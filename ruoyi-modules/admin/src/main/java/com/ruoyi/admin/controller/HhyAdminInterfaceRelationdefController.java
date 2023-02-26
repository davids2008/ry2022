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
import com.ruoyi.admin.domain.HhyAdminInterfaceRelationdef;
import com.ruoyi.admin.service.IHhyAdminInterfaceRelationdefService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * interface_relationdefController
 * 
 * @author daichao
 * @date 2022-01-21
 */
@RestController
@RequestMapping("/interfacerelationdef")
public class HhyAdminInterfaceRelationdefController extends BaseController
{
    @Autowired
    private IHhyAdminInterfaceRelationdefService hhyAdminInterfaceRelationdefService;

    /**
     * 查询interface_relationdef列表
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        startPage();
        List<HhyAdminInterfaceRelationdef> list = hhyAdminInterfaceRelationdefService.selectHhyAdminInterfaceRelationdefList(hhyAdminInterfaceRelationdef);
        return getDataTable(list);
    }

    /**
     * 导出interface_relationdef列表
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:export")
    @Log(title = "interface_relationdef", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef) throws IOException
    {
        List<HhyAdminInterfaceRelationdef> list = hhyAdminInterfaceRelationdefService.selectHhyAdminInterfaceRelationdefList(hhyAdminInterfaceRelationdef);
        ExcelUtil<HhyAdminInterfaceRelationdef> util = new ExcelUtil<HhyAdminInterfaceRelationdef>(HhyAdminInterfaceRelationdef.class);
        util.exportExcel(response, list, "interfacerelationdef");
    }

    /**
     * 获取interface_relationdef详细信息
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:query")
    @GetMapping(value = "/{interRelId}")
    public AjaxResult getInfo(@PathVariable("interRelId") Long interRelId)
    {
        return AjaxResult.success(hhyAdminInterfaceRelationdefService.selectHhyAdminInterfaceRelationdefById(interRelId));
    }

    /**
     * 新增interface_relationdef
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:add")
    @Log(title = "interface_relationdef", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        return toAjax(hhyAdminInterfaceRelationdefService.insertHhyAdminInterfaceRelationdef(hhyAdminInterfaceRelationdef));
    }

    /**
     * 修改interface_relationdef
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:edit")
    @Log(title = "interface_relationdef", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        return toAjax(hhyAdminInterfaceRelationdefService.updateHhyAdminInterfaceRelationdef(hhyAdminInterfaceRelationdef));
    }

    /**
     * 删除interface_relationdef
     */
    @PreAuthorize(hasPermi = "admin:interfacerelationdef:remove")
    @Log(title = "interface_relationdef", businessType = BusinessType.DELETE)
	@DeleteMapping("/{interRelIds}")
    public AjaxResult remove(@PathVariable Long[] interRelIds)
    {
        return toAjax(hhyAdminInterfaceRelationdefService.deleteHhyAdminInterfaceRelationdefByIds(interRelIds));
    }
}
