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
import com.ruoyi.admin.domain.HhyAdminSystemhierarchy;
import com.ruoyi.admin.service.IHhyAdminSystemhierarchyService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * systemhierarchyController
 * 
 * @author daichao
 * @date 2022-01-19
 */
@RestController
@RequestMapping("/systemhierarchy")
public class HhyAdminSystemhierarchyController extends BaseController
{
    @Autowired
    private IHhyAdminSystemhierarchyService hhyAdminSystemhierarchyService;

    /**
     * 查询systemhierarchy列表
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        startPage();
        List<HhyAdminSystemhierarchy> list = hhyAdminSystemhierarchyService.selectHhyAdminSystemhierarchyList(hhyAdminSystemhierarchy);
        return getDataTable(list);
    }

    /**
     * 导出systemhierarchy列表
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:export")
    @Log(title = "systemhierarchy", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSystemhierarchy hhyAdminSystemhierarchy) throws IOException
    {
        List<HhyAdminSystemhierarchy> list = hhyAdminSystemhierarchyService.selectHhyAdminSystemhierarchyList(hhyAdminSystemhierarchy);
        ExcelUtil<HhyAdminSystemhierarchy> util = new ExcelUtil<HhyAdminSystemhierarchy>(HhyAdminSystemhierarchy.class);
        util.exportExcel(response, list, "systemhierarchy");
    }

    /**
     * 获取systemhierarchy详细信息
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:query")
    @GetMapping(value = "/{syshId}")
    public AjaxResult getInfo(@PathVariable("syshId") Long syshId)
    {
        return AjaxResult.success(hhyAdminSystemhierarchyService.selectHhyAdminSystemhierarchyById(syshId));
    }

    /**
     * 新增systemhierarchy
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:add")
    @Log(title = "systemhierarchy", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        return toAjax(hhyAdminSystemhierarchyService.insertHhyAdminSystemhierarchy(hhyAdminSystemhierarchy));
    }

    /**
     * 修改systemhierarchy
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:edit")
    @Log(title = "systemhierarchy", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        return toAjax(hhyAdminSystemhierarchyService.updateHhyAdminSystemhierarchy(hhyAdminSystemhierarchy));
    }

    /**
     * 删除systemhierarchy
     */
    @PreAuthorize(hasPermi = "admin:systemhierarchy:remove")
    @Log(title = "systemhierarchy", businessType = BusinessType.DELETE)
	@DeleteMapping("/{syshIds}")
    public AjaxResult remove(@PathVariable Long[] syshIds)
    {
        return toAjax(hhyAdminSystemhierarchyService.deleteHhyAdminSystemhierarchyByIds(syshIds));
    }
}
