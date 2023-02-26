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
import com.ruoyi.admin.domain.HhyAdminSection;
import com.ruoyi.admin.service.IHhyAdminSectionService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_sectionController
 * 
 * @author admin
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/section")
public class HhyAdminSectionController extends BaseController
{
    @Autowired
    private IHhyAdminSectionService hhyAdminSectionService;

    /**
     * 查询hhy_admin_section列表
     */
    @PreAuthorize(hasPermi = "admin:section:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminSection hhyAdminSection)
    {
        startPage();
        List<HhyAdminSection> list = hhyAdminSectionService.selectHhyAdminSectionList(hhyAdminSection);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_section列表
     */
    @PreAuthorize(hasPermi = "admin:section:export")
    @Log(title = "hhy_admin_section", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminSection hhyAdminSection) throws IOException
    {
        List<HhyAdminSection> list = hhyAdminSectionService.selectHhyAdminSectionList(hhyAdminSection);
        ExcelUtil<HhyAdminSection> util = new ExcelUtil<HhyAdminSection>(HhyAdminSection.class);
        util.exportExcel(response, list, "section");
    }

    /**
     * 获取hhy_admin_section详细信息
     */
    @PreAuthorize(hasPermi = "admin:section:query")
    @GetMapping(value = "/{secId}")
    public AjaxResult getInfo(@PathVariable("secId") Long secId)
    {
        return AjaxResult.success(hhyAdminSectionService.selectHhyAdminSectionById(secId));
    }

    /**
     * 新增hhy_admin_section
     */
    @PreAuthorize(hasPermi = "admin:section:add")
    @Log(title = "hhy_admin_section", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminSection hhyAdminSection)
    {
        return toAjax(hhyAdminSectionService.insertHhyAdminSection(hhyAdminSection));
    }

    /**
     * 修改hhy_admin_section
     */
    @PreAuthorize(hasPermi = "admin:section:edit")
    @Log(title = "hhy_admin_section", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminSection hhyAdminSection)
    {
        return toAjax(hhyAdminSectionService.updateHhyAdminSection(hhyAdminSection));
    }

    /**
     * 删除hhy_admin_section
     */
    @PreAuthorize(hasPermi = "admin:section:remove")
    @Log(title = "hhy_admin_section", businessType = BusinessType.DELETE)
	@DeleteMapping("/{secIds}")
    public AjaxResult remove(@PathVariable Long[] secIds)
    {
        return toAjax(hhyAdminSectionService.deleteHhyAdminSectionByIds(secIds));
    }
}
