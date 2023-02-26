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
import com.ruoyi.admin.domain.HhyAdminPropertyPicklist;
import com.ruoyi.admin.service.IHhyAdminPropertyPicklistService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * picklistController
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
@RestController
@RequestMapping("/picklist")
public class HhyAdminPropertyPicklistController extends BaseController
{
    @Autowired
    private IHhyAdminPropertyPicklistService hhyAdminPropertyPicklistService;

    /**
     * 查询picklist列表
     */
    @PreAuthorize(hasPermi = "admin:picklist:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        startPage();
        List<HhyAdminPropertyPicklist> list = hhyAdminPropertyPicklistService.selectHhyAdminPropertyPicklistList(hhyAdminPropertyPicklist);
        return getDataTable(list);
    }

    /**
     * 导出picklist列表
     */
    @PreAuthorize(hasPermi = "admin:picklist:export")
    @Log(title = "picklist", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminPropertyPicklist hhyAdminPropertyPicklist) throws IOException
    {
        List<HhyAdminPropertyPicklist> list = hhyAdminPropertyPicklistService.selectHhyAdminPropertyPicklistList(hhyAdminPropertyPicklist);
        ExcelUtil<HhyAdminPropertyPicklist> util = new ExcelUtil<HhyAdminPropertyPicklist>(HhyAdminPropertyPicklist.class);
        util.exportExcel(response, list, "picklist");
    }

    /**
     * 获取picklist详细信息
     */
    @PreAuthorize(hasPermi = "admin:picklist:query")
    @GetMapping(value = "/{pickId}")
    public AjaxResult getInfo(@PathVariable("pickId") Long pickId)
    {
        return AjaxResult.success(hhyAdminPropertyPicklistService.selectHhyAdminPropertyPicklistById(pickId));
    }

    /**
     * 新增picklist
     */
    @PreAuthorize(hasPermi = "admin:picklist:add")
    @Log(title = "picklist", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        return toAjax(hhyAdminPropertyPicklistService.insertHhyAdminPropertyPicklist(hhyAdminPropertyPicklist));
    }

    /**
     * 修改picklist
     */
    @PreAuthorize(hasPermi = "admin:picklist:edit")
    @Log(title = "picklist", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        return toAjax(hhyAdminPropertyPicklistService.updateHhyAdminPropertyPicklist(hhyAdminPropertyPicklist));
    }

    /**
     * 删除picklist
     */
    @PreAuthorize(hasPermi = "admin:picklist:remove")
    @Log(title = "picklist", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pickIds}")
    public AjaxResult remove(@PathVariable Long[] pickIds)
    {
        return toAjax(hhyAdminPropertyPicklistService.deleteHhyAdminPropertyPicklistByIds(pickIds));
    }
}
