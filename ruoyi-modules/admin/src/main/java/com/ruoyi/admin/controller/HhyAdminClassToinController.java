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
import com.ruoyi.admin.domain.HhyAdminClassToin;
import com.ruoyi.admin.service.IHhyAdminClassToinService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * class_inController
 * 
 * @author daichao
 * @date 2022-03-31
 */
@RestController
@RequestMapping("/toin")
public class HhyAdminClassToinController extends BaseController
{
    @Autowired
    private IHhyAdminClassToinService hhyAdminClassToinService;

    /**
     * 查询class_in列表
     */
    @PreAuthorize(hasPermi = "admin:toin:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminClassToin hhyAdminClassToin)
    {
        startPage();
        List<HhyAdminClassToin> list = hhyAdminClassToinService.selectHhyAdminClassToinList(hhyAdminClassToin);
        return getDataTable(list);
    }

    /**
     * 导出class_in列表
     */
    @PreAuthorize(hasPermi = "admin:toin:export")
    @Log(title = "class_in", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminClassToin hhyAdminClassToin) throws IOException
    {
        List<HhyAdminClassToin> list = hhyAdminClassToinService.selectHhyAdminClassToinList(hhyAdminClassToin);
        ExcelUtil<HhyAdminClassToin> util = new ExcelUtil<HhyAdminClassToin>(HhyAdminClassToin.class);
        util.exportExcel(response, list, "toin");
    }

    /**
     * 获取class_in详细信息
     */
    @PreAuthorize(hasPermi = "admin:toin:query")
    @GetMapping(value = "/{classinId}")
    public AjaxResult getInfo(@PathVariable("classinId") Long classinId)
    {
        return AjaxResult.success(hhyAdminClassToinService.selectHhyAdminClassToinById(classinId));
    }

    /**
     * 新增class_in
     */
    @PreAuthorize(hasPermi = "admin:toin:add")
    @Log(title = "class_in", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminClassToin hhyAdminClassToin)
    {
        return toAjax(hhyAdminClassToinService.insertHhyAdminClassToin(hhyAdminClassToin));
    }

    /**
     * 修改class_in
     */
    @PreAuthorize(hasPermi = "admin:toin:edit")
    @Log(title = "class_in", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminClassToin hhyAdminClassToin)
    {
        return toAjax(hhyAdminClassToinService.updateHhyAdminClassToin(hhyAdminClassToin));
    }

    /**
     * 删除class_in
     */
    @PreAuthorize(hasPermi = "admin:toin:remove")
    @Log(title = "class_in", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classinIds}")
    public AjaxResult remove(@PathVariable Long[] classinIds)
    {
        return toAjax(hhyAdminClassToinService.deleteHhyAdminClassToinByIds(classinIds));
    }
}
