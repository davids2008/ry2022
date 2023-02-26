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
import com.ruoyi.admin.domain.HhyAdminSectionViewRelated;
import com.ruoyi.admin.service.IHhyAdminSectionViewRelatedService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_section_view_relatedController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/sectviewrelated")
public class HhyAdminSectionViewRelatedController extends BaseController
{
    @Autowired
    private IHhyAdminSectionViewRelatedService hhyAdminSectionViewRelatedService;

    /**
     * 查询hhy_admin_section_view_related列表
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        startPage();
        List<HhyAdminSectionViewRelated> list = hhyAdminSectionViewRelatedService.selectHhyAdminSectionViewRelatedList(hhyAdminSectionViewRelated);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_section_view_related列表
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:export")
    @Log(title = "hhy_admin_section_view_related", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSectionViewRelated hhyAdminSectionViewRelated) throws IOException
    {
        List<HhyAdminSectionViewRelated> list = hhyAdminSectionViewRelatedService.selectHhyAdminSectionViewRelatedList(hhyAdminSectionViewRelated);
        ExcelUtil<HhyAdminSectionViewRelated> util = new ExcelUtil<HhyAdminSectionViewRelated>(HhyAdminSectionViewRelated.class);
        util.exportExcel(response, list, "sectviewrelated");
    }

    /**
     * 获取hhy_admin_section_view_related详细信息
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:query")
    @GetMapping(value = "/{secRelId}")
    public AjaxResult getInfo(@PathVariable("secRelId") Long secRelId)
    {
        return AjaxResult.success(hhyAdminSectionViewRelatedService.selectHhyAdminSectionViewRelatedById(secRelId));
    }

    /**
     * 新增hhy_admin_section_view_related
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:add")
    @Log(title = "hhy_admin_section_view_related", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        return toAjax(hhyAdminSectionViewRelatedService.insertHhyAdminSectionViewRelated(hhyAdminSectionViewRelated));
    }

    /**
     * 修改hhy_admin_section_view_related
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:edit")
    @Log(title = "hhy_admin_section_view_related", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        return toAjax(hhyAdminSectionViewRelatedService.updateHhyAdminSectionViewRelated(hhyAdminSectionViewRelated));
    }

    /**
     * 删除hhy_admin_section_view_related
     */
    @PreAuthorize(hasPermi = "admin:sectviewrelated:remove")
    @Log(title = "hhy_admin_section_view_related", businessType = BusinessType.DELETE)
	@DeleteMapping("/{secRelIds}")
    public AjaxResult remove(@PathVariable Long[] secRelIds)
    {
        return toAjax(hhyAdminSectionViewRelatedService.deleteHhyAdminSectionViewRelatedByIds(secRelIds));
    }
}
