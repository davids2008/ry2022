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
import com.ruoyi.admin.domain.HhyAdminView;
import com.ruoyi.admin.service.IHhyAdminViewService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_viewController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/view")
public class HhyAdminViewController extends BaseController
{
    @Autowired
    private IHhyAdminViewService hhyAdminViewService;

    /**
     * 查询hhy_admin_view列表
     */
    @PreAuthorize(hasPermi = "admin:view:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminView hhyAdminView)
    {
        startPage();
        List<HhyAdminView> list = hhyAdminViewService.selectHhyAdminViewList(hhyAdminView);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_view列表
     */
    @PreAuthorize(hasPermi = "admin:view:export")
    @Log(title = "hhy_admin_view", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminView hhyAdminView) throws IOException
    {
        List<HhyAdminView> list = hhyAdminViewService.selectHhyAdminViewList(hhyAdminView);
        ExcelUtil<HhyAdminView> util = new ExcelUtil<HhyAdminView>(HhyAdminView.class);
        util.exportExcel(response, list, "view");
    }

    /**
     * 获取hhy_admin_view详细信息
     */
    @PreAuthorize(hasPermi = "admin:view:query")
    @GetMapping(value = "/{viewId}")
    public AjaxResult getInfo(@PathVariable("viewId") Long viewId)
    {
        return AjaxResult.success(hhyAdminViewService.selectHhyAdminViewById(viewId));
    }

    /**
     * 新增hhy_admin_view
     */
    @PreAuthorize(hasPermi = "admin:view:add")
    @Log(title = "hhy_admin_view", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminView hhyAdminView)
    {
        return toAjax(hhyAdminViewService.insertHhyAdminView(hhyAdminView));
    }

    /**
     * 修改hhy_admin_view
     */
    @PreAuthorize(hasPermi = "admin:view:edit")
    @Log(title = "hhy_admin_view", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminView hhyAdminView)
    {
        return toAjax(hhyAdminViewService.updateHhyAdminView(hhyAdminView));
    }

    /**
     * 删除hhy_admin_view
     */
    @PreAuthorize(hasPermi = "admin:view:remove")
    @Log(title = "hhy_admin_view", businessType = BusinessType.DELETE)
	@DeleteMapping("/{viewIds}")
    public AjaxResult remove(@PathVariable Long[] viewIds)
    {
        return toAjax(hhyAdminViewService.deleteHhyAdminViewByIds(viewIds));
    }
}
