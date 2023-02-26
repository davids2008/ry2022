package com.ruoyi.admin.controller;

import com.ruoyi.admin.domain.HhyAdminCompany;
import com.ruoyi.admin.service.IHhyAdminCompanyService;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * hhy_admin_companyController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/company")
public class HhyAdminCompanyController extends BaseController
{
    @Autowired
    private IHhyAdminCompanyService hhyAdminCompanyService;

    /**
     * 查询hhy_admin_company列表
     */
    @PreAuthorize(hasPermi = "admin:company:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminCompany hhyAdminCompany)
    {
        startPage();
        List<HhyAdminCompany> list = hhyAdminCompanyService.selectHhyAdminCompanyList(hhyAdminCompany);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_company列表
     */
    @PreAuthorize(hasPermi = "admin:company:export")
    @Log(title = "hhy_admin_company", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminCompany hhyAdminCompany) throws IOException
    {
        List<HhyAdminCompany> list = hhyAdminCompanyService.selectHhyAdminCompanyList(hhyAdminCompany);
        ExcelUtil<HhyAdminCompany> util = new ExcelUtil<HhyAdminCompany>(HhyAdminCompany.class);
        util.exportExcel(response, list, "company");
    }

    /**
     * 获取hhy_admin_company详细信息
     */
    @PreAuthorize(hasPermi = "admin:company:query")
    @GetMapping(value = "/{cpId}")
    public AjaxResult getInfo(@PathVariable("cpId") Long cpId)
    {
        return AjaxResult.success(hhyAdminCompanyService.selectHhyAdminCompanyById(cpId));
    }

    /**
     * 新增hhy_admin_company
     */
    @PreAuthorize(hasPermi = "admin:company:add")
    @Log(title = "hhy_admin_company", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminCompany hhyAdminCompany)
    {
        return toAjax(hhyAdminCompanyService.insertHhyAdminCompany(hhyAdminCompany));
    }

    /**
     * 修改hhy_admin_company
     */
    @PreAuthorize(hasPermi = "admin:company:edit")
    @Log(title = "hhy_admin_company", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminCompany hhyAdminCompany)
    {
        return toAjax(hhyAdminCompanyService.updateHhyAdminCompany(hhyAdminCompany));
    }

    /**
     * 删除hhy_admin_company
     */
    @PreAuthorize(hasPermi = "admin:company:remove")
    @Log(title = "hhy_admin_company", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cpIds}")
    public AjaxResult remove(@PathVariable Long[] cpIds)
    {
        return toAjax(hhyAdminCompanyService.deleteHhyAdminCompanyByIds(cpIds));
    }
}
