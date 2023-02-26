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
import com.ruoyi.admin.domain.HhyAdminUomUnits;
import com.ruoyi.admin.service.IHhyAdminUomUnitsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * UomUnitsController
 * 
 * @author daichao
 * @date 2022-01-19
 */
@RestController
@RequestMapping("/uomunits")
public class HhyAdminUomUnitsController extends BaseController
{
    @Autowired
    private IHhyAdminUomUnitsService hhyAdminUomUnitsService;

    /**
     * 查询UomUnits列表
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminUomUnits hhyAdminUomUnits)
    {
        startPage();
        List<HhyAdminUomUnits> list = hhyAdminUomUnitsService.selectHhyAdminUomUnitsList(hhyAdminUomUnits);
        return getDataTable(list);
    }

    /**
     * 导出UomUnits列表
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:export")
    @Log(title = "UomUnits", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminUomUnits hhyAdminUomUnits) throws IOException
    {
        List<HhyAdminUomUnits> list = hhyAdminUomUnitsService.selectHhyAdminUomUnitsList(hhyAdminUomUnits);
        ExcelUtil<HhyAdminUomUnits> util = new ExcelUtil<HhyAdminUomUnits>(HhyAdminUomUnits.class);
        util.exportExcel(response, list, "uomunits");
    }

    /**
     * 获取UomUnits详细信息
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:query")
    @GetMapping(value = "/{uomUnitsId}")
    public AjaxResult getInfo(@PathVariable("uomUnitsId") Long uomUnitsId)
    {
        return AjaxResult.success(hhyAdminUomUnitsService.selectHhyAdminUomUnitsById(uomUnitsId));
    }

    /**
     * 新增UomUnits
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:add")
    @Log(title = "UomUnits", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminUomUnits hhyAdminUomUnits)
    {
        return toAjax(hhyAdminUomUnitsService.insertHhyAdminUomUnits(hhyAdminUomUnits));
    }

    /**
     * 修改UomUnits
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:edit")
    @Log(title = "UomUnits", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminUomUnits hhyAdminUomUnits)
    {
        return toAjax(hhyAdminUomUnitsService.updateHhyAdminUomUnits(hhyAdminUomUnits));
    }

    /**
     * 删除UomUnits
     */
    @PreAuthorize(hasPermi = "admiin:uomunits:remove")
    @Log(title = "UomUnits", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uomUnitsIds}")
    public AjaxResult remove(@PathVariable Long[] uomUnitsIds)
    {
        return toAjax(hhyAdminUomUnitsService.deleteHhyAdminUomUnitsByIds(uomUnitsIds));
    }
}
