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
import com.ruoyi.admin.domain.HhyAdminColumnsetInterfacedef;
import com.ruoyi.admin.service.IHhyAdminColumnsetInterfacedefService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_columnset_interfacedefController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/colinterfacedef")
public class HhyAdminColumnsetInterfacedefController extends BaseController
{
    @Autowired
    private IHhyAdminColumnsetInterfacedefService hhyAdminColumnsetInterfacedefService;

    /**
     * 查询hhy_admin_columnset_interfacedef列表
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        startPage();
        List<HhyAdminColumnsetInterfacedef> list = hhyAdminColumnsetInterfacedefService.selectHhyAdminColumnsetInterfacedefList(hhyAdminColumnsetInterfacedef);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_columnset_interfacedef列表
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:export")
    @Log(title = "hhy_admin_columnset_interfacedef", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef) throws IOException
    {
        List<HhyAdminColumnsetInterfacedef> list = hhyAdminColumnsetInterfacedefService.selectHhyAdminColumnsetInterfacedefList(hhyAdminColumnsetInterfacedef);
        ExcelUtil<HhyAdminColumnsetInterfacedef> util = new ExcelUtil<HhyAdminColumnsetInterfacedef>(HhyAdminColumnsetInterfacedef.class);
        util.exportExcel(response, list, "colinterfacedef");
    }

    /**
     * 获取hhy_admin_columnset_interfacedef详细信息
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:query")
    @GetMapping(value = "/{colInId}")
    public AjaxResult getInfo(@PathVariable("colInId") Long colInId)
    {
        return AjaxResult.success(hhyAdminColumnsetInterfacedefService.selectHhyAdminColumnsetInterfacedefById(colInId));
    }

    /**
     * 新增hhy_admin_columnset_interfacedef
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:add")
    @Log(title = "hhy_admin_columnset_interfacedef", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        return toAjax(hhyAdminColumnsetInterfacedefService.insertHhyAdminColumnsetInterfacedef(hhyAdminColumnsetInterfacedef));
    }

    /**
     * 修改hhy_admin_columnset_interfacedef
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:edit")
    @Log(title = "hhy_admin_columnset_interfacedef", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        return toAjax(hhyAdminColumnsetInterfacedefService.updateHhyAdminColumnsetInterfacedef(hhyAdminColumnsetInterfacedef));
    }

    /**
     * 删除hhy_admin_columnset_interfacedef
     */
    @PreAuthorize(hasPermi = "admin:colinterfacedef:remove")
    @Log(title = "hhy_admin_columnset_interfacedef", businessType = BusinessType.DELETE)
	@DeleteMapping("/{colInIds}")
    public AjaxResult remove(@PathVariable Long[] colInIds)
    {
        return toAjax(hhyAdminColumnsetInterfacedefService.deleteHhyAdminColumnsetInterfacedefByIds(colInIds));
    }
}
