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
import com.ruoyi.admin.domain.HhyAdminColumnsetItem;
import com.ruoyi.admin.service.IHhyAdminColumnsetItemService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_columnset_itemController
 * 
 * @author admin
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/colitem")
public class HhyAdminColumnsetItemController extends BaseController
{
    @Autowired
    private IHhyAdminColumnsetItemService hhyAdminColumnsetItemService;

    /**
     * 查询hhy_admin_columnset_item列表
     */
    @PreAuthorize(hasPermi = "admin:colitem:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        startPage();
        List<HhyAdminColumnsetItem> list = hhyAdminColumnsetItemService.selectHhyAdminColumnsetItemList(hhyAdminColumnsetItem);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_columnset_item列表
     */
    @PreAuthorize(hasPermi = "admin:colitem:export")
    @Log(title = "hhy_admin_columnset_item", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminColumnsetItem hhyAdminColumnsetItem) throws IOException
    {
        List<HhyAdminColumnsetItem> list = hhyAdminColumnsetItemService.selectHhyAdminColumnsetItemList(hhyAdminColumnsetItem);
        ExcelUtil<HhyAdminColumnsetItem> util = new ExcelUtil<HhyAdminColumnsetItem>(HhyAdminColumnsetItem.class);
        util.exportExcel(response, list, "colitem");
    }

    /**
     * 获取hhy_admin_columnset_item详细信息
     */
    @PreAuthorize(hasPermi = "admin:colitem:query")
    @GetMapping(value = "/{colItemId}")
    public AjaxResult getInfo(@PathVariable("colItemId") Long colItemId)
    {
        return AjaxResult.success(hhyAdminColumnsetItemService.selectHhyAdminColumnsetItemById(colItemId));
    }

    /**
     * 新增hhy_admin_columnset_item
     */
    @PreAuthorize(hasPermi = "admin:colitem:add")
    @Log(title = "hhy_admin_columnset_item", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        return toAjax(hhyAdminColumnsetItemService.insertHhyAdminColumnsetItem(hhyAdminColumnsetItem));
    }

    /**
     * 修改hhy_admin_columnset_item
     */
    @PreAuthorize(hasPermi = "admin:colitem:edit")
    @Log(title = "hhy_admin_columnset_item", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        return toAjax(hhyAdminColumnsetItemService.updateHhyAdminColumnsetItem(hhyAdminColumnsetItem));
    }

    /**
     * 删除hhy_admin_columnset_item
     */
    @PreAuthorize(hasPermi = "admin:colitem:remove")
    @Log(title = "hhy_admin_columnset_item", businessType = BusinessType.DELETE)
	@DeleteMapping("/{colItemIds}")
    public AjaxResult remove(@PathVariable Long[] colItemIds)
    {
        return toAjax(hhyAdminColumnsetItemService.deleteHhyAdminColumnsetItemByIds(colItemIds));
    }
}
