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
import com.ruoyi.admin.domain.HhyAdminInterfacePropertydef;
import com.ruoyi.admin.service.IHhyAdminInterfacePropertydefService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * interface_propertydefController
 * 
 * @author daichao
 * @date 2022-01-21
 */
@RestController
@RequestMapping("/interfacepropertydef")
public class HhyAdminInterfacePropertydefController extends BaseController
{
    @Autowired
    private IHhyAdminInterfacePropertydefService hhyAdminInterfacePropertydefService;

    /**
     * 查询interface_propertydef列表
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        startPage();
        List<HhyAdminInterfacePropertydef> list = hhyAdminInterfacePropertydefService.selectHhyAdminInterfacePropertydefList(hhyAdminInterfacePropertydef);
        return getDataTable(list);
    }

    /**
     * 导出interface_propertydef列表
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:export")
    @Log(title = "interface_propertydef", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef) throws IOException
    {
        List<HhyAdminInterfacePropertydef> list = hhyAdminInterfacePropertydefService.selectHhyAdminInterfacePropertydefList(hhyAdminInterfacePropertydef);
        ExcelUtil<HhyAdminInterfacePropertydef> util = new ExcelUtil<HhyAdminInterfacePropertydef>(HhyAdminInterfacePropertydef.class);
        util.exportExcel(response, list, "interfacepropertydef");
    }

    /**
     * 获取interface_propertydef详细信息
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:query")
    @GetMapping(value = "/{interProId}")
    public AjaxResult getInfo(@PathVariable("interProId") Long interProId)
    {
        return AjaxResult.success(hhyAdminInterfacePropertydefService.selectHhyAdminInterfacePropertydefById(interProId));
    }

    /**
     * 新增interface_propertydef
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:add")
    @Log(title = "interface_propertydef", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        return toAjax(hhyAdminInterfacePropertydefService.insertHhyAdminInterfacePropertydef(hhyAdminInterfacePropertydef));
    }

    /**
     * 修改interface_propertydef
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:edit")
    @Log(title = "interface_propertydef", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        return toAjax(hhyAdminInterfacePropertydefService.updateHhyAdminInterfacePropertydef(hhyAdminInterfacePropertydef));
    }

    /**
     * 删除interface_propertydef
     */
    @PreAuthorize(hasPermi = "admin:interfacepropertydef:remove")
    @Log(title = "interface_propertydef", businessType = BusinessType.DELETE)
	@DeleteMapping("/{interProIds}")
    public AjaxResult remove(@PathVariable Long[] interProIds)
    {
        return toAjax(hhyAdminInterfacePropertydefService.deleteHhyAdminInterfacePropertydefByIds(interProIds));
    }
}
