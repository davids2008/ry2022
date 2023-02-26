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
import com.ruoyi.admin.domain.HhyAdminSectionViewDefinition;
import com.ruoyi.admin.service.IHhyAdminSectionViewDefinitionService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_section_view_definitionController
 * 
 * @author admin
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/sectviewdefinition")
public class HhyAdminSectionViewDefinitionController extends BaseController
{
    @Autowired
    private IHhyAdminSectionViewDefinitionService hhyAdminSectionViewDefinitionService;

    /**
     * 查询hhy_admin_section_view_definition列表
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        startPage();
        List<HhyAdminSectionViewDefinition> list = hhyAdminSectionViewDefinitionService.selectHhyAdminSectionViewDefinitionList(hhyAdminSectionViewDefinition);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_section_view_definition列表
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:export")
    @Log(title = "hhy_admin_section_view_definition", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition) throws IOException
    {
        List<HhyAdminSectionViewDefinition> list = hhyAdminSectionViewDefinitionService.selectHhyAdminSectionViewDefinitionList(hhyAdminSectionViewDefinition);
        ExcelUtil<HhyAdminSectionViewDefinition> util = new ExcelUtil<HhyAdminSectionViewDefinition>(HhyAdminSectionViewDefinition.class);
        util.exportExcel(response, list, "sectviewdefinition");
    }

    /**
     * 获取hhy_admin_section_view_definition详细信息
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:query")
    @GetMapping(value = "/{secDefId}")
    public AjaxResult getInfo(@PathVariable("secDefId") Long secDefId)
    {
        return AjaxResult.success(hhyAdminSectionViewDefinitionService.selectHhyAdminSectionViewDefinitionById(secDefId));
    }

    /**
     * 新增hhy_admin_section_view_definition
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:add")
    @Log(title = "hhy_admin_section_view_definition", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        return toAjax(hhyAdminSectionViewDefinitionService.insertHhyAdminSectionViewDefinition(hhyAdminSectionViewDefinition));
    }

    /**
     * 修改hhy_admin_section_view_definition
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:edit")
    @Log(title = "hhy_admin_section_view_definition", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        return toAjax(hhyAdminSectionViewDefinitionService.updateHhyAdminSectionViewDefinition(hhyAdminSectionViewDefinition));
    }

    /**
     * 删除hhy_admin_section_view_definition
     */
    @PreAuthorize(hasPermi = "admin:sectviewdefinition:remove")
    @Log(title = "hhy_admin_section_view_definition", businessType = BusinessType.DELETE)
	@DeleteMapping("/{secDefIds}")
    public AjaxResult remove(@PathVariable Long[] secDefIds)
    {
        return toAjax(hhyAdminSectionViewDefinitionService.deleteHhyAdminSectionViewDefinitionByIds(secDefIds));
    }
}
