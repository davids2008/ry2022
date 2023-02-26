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
import com.ruoyi.admin.domain.HhyAdminInterfaceImplied;
import com.ruoyi.admin.service.IHhyAdminInterfaceImpliedService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * interface_impliedController
 * 
 * @author daichao
 * @date 2022-01-21
 */
@RestController
@RequestMapping("/interfaceimplied")
public class HhyAdminInterfaceImpliedController extends BaseController
{
    @Autowired
    private IHhyAdminInterfaceImpliedService hhyAdminInterfaceImpliedService;

    /**
     * 查询interface_implied列表
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        startPage();
        List<HhyAdminInterfaceImplied> list = hhyAdminInterfaceImpliedService.selectHhyAdminInterfaceImpliedList(hhyAdminInterfaceImplied);
        return getDataTable(list);
    }

    /**
     * 导出interface_implied列表
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:export")
    @Log(title = "interface_implied", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminInterfaceImplied hhyAdminInterfaceImplied) throws IOException
    {
        List<HhyAdminInterfaceImplied> list = hhyAdminInterfaceImpliedService.selectHhyAdminInterfaceImpliedList(hhyAdminInterfaceImplied);
        ExcelUtil<HhyAdminInterfaceImplied> util = new ExcelUtil<HhyAdminInterfaceImplied>(HhyAdminInterfaceImplied.class);
        util.exportExcel(response, list, "interfaceimplied");
    }

    /**
     * 获取interface_implied详细信息
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:query")
    @GetMapping(value = "/{interImId}")
    public AjaxResult getInfo(@PathVariable("interImId") Long interImId)
    {
        return AjaxResult.success(hhyAdminInterfaceImpliedService.selectHhyAdminInterfaceImpliedById(interImId));
    }

    /**
     * 新增interface_implied
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:add")
    @Log(title = "interface_implied", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        return toAjax(hhyAdminInterfaceImpliedService.insertHhyAdminInterfaceImplied(hhyAdminInterfaceImplied));
    }

    /**
     * 修改interface_implied
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:edit")
    @Log(title = "interface_implied", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        return toAjax(hhyAdminInterfaceImpliedService.updateHhyAdminInterfaceImplied(hhyAdminInterfaceImplied));
    }

    /**
     * 删除interface_implied
     */
    @PreAuthorize(hasPermi = "admin:interfaceimplied:remove")
    @Log(title = "interface_implied", businessType = BusinessType.DELETE)
	@DeleteMapping("/{interImIds}")
    public AjaxResult remove(@PathVariable Long[] interImIds)
    {
        return toAjax(hhyAdminInterfaceImpliedService.deleteHhyAdminInterfaceImpliedByIds(interImIds));
    }
}
