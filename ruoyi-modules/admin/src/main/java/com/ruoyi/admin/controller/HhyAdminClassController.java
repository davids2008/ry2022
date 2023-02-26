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
import com.ruoyi.admin.domain.HhyAdminClass;
import com.ruoyi.admin.service.IHhyAdminClassService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * adminclassController
 * 
 * @author daichao
 * @date 2022-01-20
 */
@RestController
@RequestMapping("/adminclass")
public class HhyAdminClassController extends BaseController
{
    @Autowired
    private IHhyAdminClassService hhyAdminClassService;

    /**
     * 查询adminclass列表
     */
    @PreAuthorize(hasPermi = "system:adminclass:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminClass hhyAdminClass)
    {
        startPage();
        List<HhyAdminClass> list = hhyAdminClassService.selectHhyAdminClassList(hhyAdminClass);
        return getDataTable(list);
    }

    /**
     * 导出adminclass列表
     */
    @PreAuthorize(hasPermi = "system:adminclass:export")
    @Log(title = "adminclass", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminClass hhyAdminClass) throws IOException
    {
        List<HhyAdminClass> list = hhyAdminClassService.selectHhyAdminClassList(hhyAdminClass);
        ExcelUtil<HhyAdminClass> util = new ExcelUtil<HhyAdminClass>(HhyAdminClass.class);
        util.exportExcel(response, list, "adminclass");
    }

    /**
     * 获取adminclass详细信息
     */
    @PreAuthorize(hasPermi = "system:adminclass:query")
    @GetMapping(value = "/{classId}")
    public AjaxResult getInfo(@PathVariable("classId") Long classId)
    {
        return AjaxResult.success(hhyAdminClassService.selectHhyAdminClassById(classId));
    }

    /**
     * 新增adminclass
     */
    @PreAuthorize(hasPermi = "system:adminclass:add")
    @Log(title = "adminclass", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminClass hhyAdminClass)
    {
        return toAjax(hhyAdminClassService.insertHhyAdminClass(hhyAdminClass));
    }

    /**
     * 修改adminclass
     */
    @PreAuthorize(hasPermi = "system:adminclass:edit")
    @Log(title = "adminclass", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminClass hhyAdminClass)
    {
        return toAjax(hhyAdminClassService.updateHhyAdminClass(hhyAdminClass));
    }

    /**
     * 删除adminclass
     */
    @PreAuthorize(hasPermi = "system:adminclass:remove")
    @Log(title = "adminclass", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classIds}")
    public AjaxResult remove(@PathVariable Long[] classIds)
    {
        return toAjax(hhyAdminClassService.deleteHhyAdminClassByIds(classIds));
    }
}
