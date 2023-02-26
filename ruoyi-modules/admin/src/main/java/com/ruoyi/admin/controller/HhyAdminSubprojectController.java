package com.ruoyi.admin.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.PreAuthorize;
import com.ruoyi.admin.domain.HhyAdminSubproject;
import com.ruoyi.admin.service.IHhyAdminSubprojectService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_subprojectController
 * 
 * @author ruoyi
 * @date 2022-01-25
 */
@RestController
@RequestMapping("/subproject")
public class HhyAdminSubprojectController extends BaseController
{
    @Autowired
    private IHhyAdminSubprojectService hhyAdminSubprojectService;

    /**
     * 查询hhy_admin_subproject列表
     */
    @PreAuthorize(hasPermi = "admin:subproject:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSubproject hhyAdminSubproject)
    {
        startPage();
        List<HhyAdminSubproject> list = hhyAdminSubprojectService.selectHhyAdminSubprojectList(hhyAdminSubproject);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_subproject列表
     */
    @PreAuthorize(hasPermi = "admin:subproject:export")
    @Log(title = "hhy_admin_subproject", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSubproject hhyAdminSubproject) throws IOException
    {
        List<HhyAdminSubproject> list = hhyAdminSubprojectService.selectHhyAdminSubprojectList(hhyAdminSubproject);
        ExcelUtil<HhyAdminSubproject> util = new ExcelUtil<HhyAdminSubproject>(HhyAdminSubproject.class);
        util.exportExcel(response, list, "subproject");
    }

    /**
     * 获取hhy_admin_subproject详细信息
     */
    @PreAuthorize(hasPermi = "admin:subproject:query")
    @GetMapping(value = "/{projSubid}")
    public AjaxResult getInfo(@PathVariable("projSubid") Long projSubid)
    {
        return AjaxResult.success(hhyAdminSubprojectService.selectHhyAdminSubprojectById(projSubid));
    }

    /**
     * 新增hhy_admin_subproject
     */
    @PreAuthorize(hasPermi = "admin:subproject:add")
    @Log(title = "hhy_admin_subproject", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSubproject hhyAdminSubproject)
    {
        return toAjax(hhyAdminSubprojectService.insertHhyAdminSubproject(hhyAdminSubproject));
    }

    /**
     * 修改hhy_admin_subproject
     */
    @PreAuthorize(hasPermi = "admin:subproject:edit")
    @Log(title = "hhy_admin_subproject", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSubproject hhyAdminSubproject)
    {
        return toAjax(hhyAdminSubprojectService.updateHhyAdminSubproject(hhyAdminSubproject));
    }

    /**
     * 删除hhy_admin_subproject
     */
    @PreAuthorize(hasPermi = "admin:subproject:remove")
    @Log(title = "hhy_admin_subproject", businessType = BusinessType.DELETE)
	@DeleteMapping("/{projSubids}")
    public AjaxResult remove(@PathVariable Long[] projSubids)
    {
        return toAjax(hhyAdminSubprojectService.deleteHhyAdminSubprojectByIds(projSubids));
    }
}
