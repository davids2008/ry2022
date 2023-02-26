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
import com.ruoyi.admin.domain.HhyAdminUomClass;
import com.ruoyi.admin.service.IHhyAdminUomClassService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * UomClassController
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
@RestController
@RequestMapping("/uomclass")
public class HhyAdminUomClassController extends BaseController
{
    @Autowired
    private IHhyAdminUomClassService hhyAdminUomClassService;

    /**
     * 查询UomClass列表
     */
    @PreAuthorize(hasPermi = "admin:uomclass:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminUomClass hhyAdminUomClass)
    {
        startPage();
        List<HhyAdminUomClass> list = hhyAdminUomClassService.selectHhyAdminUomClassList(hhyAdminUomClass);
        return getDataTable(list);
    }

    /**
     * 导出UomClass列表
     */
    @PreAuthorize(hasPermi = "admin:uomclass:export")
    @Log(title = "UomClass", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminUomClass hhyAdminUomClass) throws IOException
    {
        List<HhyAdminUomClass> list = hhyAdminUomClassService.selectHhyAdminUomClassList(hhyAdminUomClass);
        ExcelUtil<HhyAdminUomClass> util = new ExcelUtil<HhyAdminUomClass>(HhyAdminUomClass.class);
        util.exportExcel(response, list, "uomclass");
    }

    /**
     * 获取UomClass详细信息
     */
    @PreAuthorize(hasPermi = "admin:uomclass:query")
    @GetMapping(value = "/{uomClassId}")
    public AjaxResult getInfo(@PathVariable("uomClassId") Long uomClassId)
    {
        return AjaxResult.success(hhyAdminUomClassService.selectHhyAdminUomClassById(uomClassId));
    }

    /**
     * 新增UomClass
     */
    @PreAuthorize(hasPermi = "admin:uomclass:add")
    @Log(title = "UomClass", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminUomClass hhyAdminUomClass)
    {
        return toAjax(hhyAdminUomClassService.insertHhyAdminUomClass(hhyAdminUomClass));
    }

    /**
     * 修改UomClass
     */
    @PreAuthorize(hasPermi = "admin:uomclass:edit")
    @Log(title = "UomClass", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminUomClass hhyAdminUomClass)
    {
        return toAjax(hhyAdminUomClassService.updateHhyAdminUomClass(hhyAdminUomClass));
    }

    /**
     * 删除UomClass
     */
    @PreAuthorize(hasPermi = "admin:uomclass:remove")
    @Log(title = "UomClass", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uomClassIds}")
    public AjaxResult remove(@PathVariable Long[] uomClassIds)
    {
        return toAjax(hhyAdminUomClassService.deleteHhyAdminUomClassByIds(uomClassIds));
    }
}
