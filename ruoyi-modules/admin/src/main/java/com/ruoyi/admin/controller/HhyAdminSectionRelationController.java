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
import com.ruoyi.admin.domain.HhyAdminSectionRelation;
import com.ruoyi.admin.service.IHhyAdminSectionRelationService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_section_relationController
 * 
 * @author admin
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/sectionrelation")
public class HhyAdminSectionRelationController extends BaseController
{
    @Autowired
    private IHhyAdminSectionRelationService hhyAdminSectionRelationService;

    /**
     * 查询hhy_admin_section_relation列表
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        startPage();
        List<HhyAdminSectionRelation> list = hhyAdminSectionRelationService.selectHhyAdminSectionRelationList(hhyAdminSectionRelation);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_section_relation列表
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:export")
    @Log(title = "hhy_admin_section_relation", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSectionRelation hhyAdminSectionRelation) throws IOException
    {
        List<HhyAdminSectionRelation> list = hhyAdminSectionRelationService.selectHhyAdminSectionRelationList(hhyAdminSectionRelation);
        ExcelUtil<HhyAdminSectionRelation> util = new ExcelUtil<HhyAdminSectionRelation>(HhyAdminSectionRelation.class);
        util.exportExcel(response, list, "sectionrelation");
    }

    /**
     * 获取hhy_admin_section_relation详细信息
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:query")
    @GetMapping(value = "/{secRelId}")
    public AjaxResult getInfo(@PathVariable("secRelId") Long secRelId)
    {
        return AjaxResult.success(hhyAdminSectionRelationService.selectHhyAdminSectionRelationById(secRelId));
    }

    /**
     * 新增hhy_admin_section_relation
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:add")
    @Log(title = "hhy_admin_section_relation", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        return toAjax(hhyAdminSectionRelationService.insertHhyAdminSectionRelation(hhyAdminSectionRelation));
    }

    /**
     * 修改hhy_admin_section_relation
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:edit")
    @Log(title = "hhy_admin_section_relation", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        return toAjax(hhyAdminSectionRelationService.updateHhyAdminSectionRelation(hhyAdminSectionRelation));
    }

    /**
     * 删除hhy_admin_section_relation
     */
    @PreAuthorize(hasPermi = "admin:sectionrelation:remove")
    @Log(title = "hhy_admin_section_relation", businessType = BusinessType.DELETE)
	@DeleteMapping("/{secRelIds}")
    public AjaxResult remove(@PathVariable Long[] secRelIds)
    {
        return toAjax(hhyAdminSectionRelationService.deleteHhyAdminSectionRelationByIds(secRelIds));
    }
}
