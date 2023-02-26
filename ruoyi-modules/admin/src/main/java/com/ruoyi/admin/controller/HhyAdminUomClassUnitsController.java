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
import com.ruoyi.admin.domain.HhyAdminUomClassUnits;
import com.ruoyi.admin.service.IHhyAdminUomClassUnitsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * UomClassUnitsController
 * 
 * @author daichao
 * @date 2022-01-19
 */
@RestController
@RequestMapping("/uomclassunits")
public class HhyAdminUomClassUnitsController extends BaseController
{
    @Autowired
    private IHhyAdminUomClassUnitsService hhyAdminUomClassUnitsService;

    /**
     * 查询UomClassUnits列表
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        startPage();
        List<HhyAdminUomClassUnits> list = hhyAdminUomClassUnitsService.selectHhyAdminUomClassUnitsList(hhyAdminUomClassUnits);
        return getDataTable(list);
    }

    /**
     * 导出UomClassUnits列表
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:export")
    @Log(title = "UomClassUnits", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminUomClassUnits hhyAdminUomClassUnits) throws IOException
    {
        List<HhyAdminUomClassUnits> list = hhyAdminUomClassUnitsService.selectHhyAdminUomClassUnitsList(hhyAdminUomClassUnits);
        ExcelUtil<HhyAdminUomClassUnits> util = new ExcelUtil<HhyAdminUomClassUnits>(HhyAdminUomClassUnits.class);
        util.exportExcel(response, list, "uomclassunits");
    }

    /**
     * 获取UomClassUnits详细信息
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:query")
    @GetMapping(value = "/{uomClassUnitsId}")
    public AjaxResult getInfo(@PathVariable("uomClassUnitsId") Long uomClassUnitsId)
    {
        return AjaxResult.success(hhyAdminUomClassUnitsService.selectHhyAdminUomClassUnitsById(uomClassUnitsId));
    }

    /**
     * 新增UomClassUnits
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:add")
    @Log(title = "UomClassUnits", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        return toAjax(hhyAdminUomClassUnitsService.insertHhyAdminUomClassUnits(hhyAdminUomClassUnits));
    }

    /**
     * 修改UomClassUnits
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:edit")
    @Log(title = "UomClassUnits", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        return toAjax(hhyAdminUomClassUnitsService.updateHhyAdminUomClassUnits(hhyAdminUomClassUnits));
    }

    /**
     * 删除UomClassUnits
     */
    @PreAuthorize(hasPermi = "admin:uomclassunits:remove")
    @Log(title = "UomClassUnits", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uomClassUnitsIds}")
    public AjaxResult remove(@PathVariable Long[] uomClassUnitsIds)
    {
        return toAjax(hhyAdminUomClassUnitsService.deleteHhyAdminUomClassUnitsByIds(uomClassUnitsIds));
    }
}
