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
import com.ruoyi.admin.domain.HhyAdminDictionay;
import com.ruoyi.admin.service.IHhyAdminDictionayService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 数据字典newController
 * 
 * @author ruoyi
 * @date 2022-01-18
 */
@RestController
@RequestMapping("/dictionay")
public class HhyAdminDictionayController extends BaseController
{
    @Autowired
    private IHhyAdminDictionayService hhyAdminDictionayService;

    /**
     * 查询数据字典new列表
     */
    @PreAuthorize(hasPermi = "admin:dictionay:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminDictionay hhyAdminDictionay)
    {
        startPage();
        List<HhyAdminDictionay> list = hhyAdminDictionayService.selectHhyAdminDictionayList(hhyAdminDictionay);
        return getDataTable(list);
    }

    /**
     * 导出数据字典new列表
     */
    @PreAuthorize(hasPermi = "admin:dictionay:export")
    @Log(title = "数据字典new", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminDictionay hhyAdminDictionay) throws IOException
    {
        List<HhyAdminDictionay> list = hhyAdminDictionayService.selectHhyAdminDictionayList(hhyAdminDictionay);
        ExcelUtil<HhyAdminDictionay> util = new ExcelUtil<HhyAdminDictionay>(HhyAdminDictionay.class);
        util.exportExcel(response, list, "dictionay");
    }

    /**
     * 获取数据字典new详细信息
     */
    @PreAuthorize(hasPermi = "admin:dictionay:query")
    @GetMapping(value = "/{dictId}")
    public AjaxResult getInfo(@PathVariable("dictId") Long dictId)
    {
        return AjaxResult.success(hhyAdminDictionayService.selectHhyAdminDictionayById(dictId));
    }

    /**
     * 新增数据字典new
     */
    @PreAuthorize(hasPermi = "admin:dictionay:add")
    @Log(title = "数据字典new", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminDictionay hhyAdminDictionay)
    {
        return toAjax(hhyAdminDictionayService.insertHhyAdminDictionay(hhyAdminDictionay));
    }

    /**
     * 修改数据字典new
     */
    @PreAuthorize(hasPermi = "admin:dictionay:edit")
    @Log(title = "数据字典new", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminDictionay hhyAdminDictionay)
    {
        return toAjax(hhyAdminDictionayService.updateHhyAdminDictionay(hhyAdminDictionay));
    }

    /**
     * 删除数据字典new
     */
    @PreAuthorize(hasPermi = "admin:dictionay:remove")
    @Log(title = "数据字典new", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dictIds}")
    public AjaxResult remove(@PathVariable Long[] dictIds)
    {
        return toAjax(hhyAdminDictionayService.deleteHhyAdminDictionayByIds(dictIds));
    }
}
