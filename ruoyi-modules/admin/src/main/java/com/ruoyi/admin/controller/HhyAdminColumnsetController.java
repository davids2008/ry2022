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
import com.ruoyi.admin.domain.HhyAdminColumnset;
import com.ruoyi.admin.service.IHhyAdminColumnsetService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_columnsetController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/columnset")
public class HhyAdminColumnsetController extends BaseController
{
    @Autowired
    private IHhyAdminColumnsetService hhyAdminColumnsetService;

    /**
     * 查询hhy_admin_columnset列表
     */
    @PreAuthorize(hasPermi = "admin:columnset:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminColumnset hhyAdminColumnset)
    {
        startPage();
        List<HhyAdminColumnset> list = hhyAdminColumnsetService.selectHhyAdminColumnsetList(hhyAdminColumnset);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_columnset列表
     */
    @PreAuthorize(hasPermi = "admin:columnset:export")
    @Log(title = "hhy_admin_columnset", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminColumnset hhyAdminColumnset) throws IOException
    {
        List<HhyAdminColumnset> list = hhyAdminColumnsetService.selectHhyAdminColumnsetList(hhyAdminColumnset);
        ExcelUtil<HhyAdminColumnset> util = new ExcelUtil<HhyAdminColumnset>(HhyAdminColumnset.class);
        util.exportExcel(response, list, "columnset");
    }

    /**
     * 获取hhy_admin_columnset详细信息
     */
    @PreAuthorize(hasPermi = "admin:columnset:query")
    @GetMapping(value = "/{colId}")
    public AjaxResult getInfo(@PathVariable("colId") Long colId)
    {
        return AjaxResult.success(hhyAdminColumnsetService.selectHhyAdminColumnsetById(colId));
    }

    /**
     * 新增hhy_admin_columnset
     */
    @PreAuthorize(hasPermi = "admin:columnset:add")
    @Log(title = "hhy_admin_columnset", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminColumnset hhyAdminColumnset)
    {
        return toAjax(hhyAdminColumnsetService.insertHhyAdminColumnset(hhyAdminColumnset));
    }

    /**
     * 修改hhy_admin_columnset
     */
    @PreAuthorize(hasPermi = "admin:columnset:edit")
    @Log(title = "hhy_admin_columnset", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminColumnset hhyAdminColumnset)
    {
        return toAjax(hhyAdminColumnsetService.updateHhyAdminColumnset(hhyAdminColumnset));
    }

    /**
     * 删除hhy_admin_columnset
     */
    @PreAuthorize(hasPermi = "admin:columnset:remove")
    @Log(title = "hhy_admin_columnset", businessType = BusinessType.DELETE)
	@DeleteMapping("/{colIds}")
    public AjaxResult remove(@PathVariable Long[] colIds)
    {
        return toAjax(hhyAdminColumnsetService.deleteHhyAdminColumnsetByIds(colIds));
    }
}
