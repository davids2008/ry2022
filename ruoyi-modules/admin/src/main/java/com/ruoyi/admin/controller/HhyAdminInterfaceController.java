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
import com.ruoyi.admin.domain.HhyAdminInterface;
import com.ruoyi.admin.service.IHhyAdminInterfaceService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * interfaceController
 * 
 * @author daichao
 * @date 2022-01-21
 */
@RestController
@RequestMapping("/interface")
public class HhyAdminInterfaceController extends BaseController
{
    @Autowired
    private IHhyAdminInterfaceService hhyAdminInterfaceService;

    /**
     * 查询interface列表
     */
    @PreAuthorize(hasPermi = "admin:interface:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminInterface hhyAdminInterface)
    {
        startPage();
        List<HhyAdminInterface> list = hhyAdminInterfaceService.selectHhyAdminInterfaceList(hhyAdminInterface);
        return getDataTable(list);
    }

    /**
     * 导出interface列表
     */
    @PreAuthorize(hasPermi = "admin:interface:export")
    @Log(title = "interface", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminInterface hhyAdminInterface) throws IOException
    {
        List<HhyAdminInterface> list = hhyAdminInterfaceService.selectHhyAdminInterfaceList(hhyAdminInterface);
        ExcelUtil<HhyAdminInterface> util = new ExcelUtil<HhyAdminInterface>(HhyAdminInterface.class);
        util.exportExcel(response, list, "interface");
    }

    /**
     * 获取interface详细信息
     */
    @PreAuthorize(hasPermi = "admin:interface:query")
    @GetMapping(value = "/{interId}")
    public AjaxResult getInfo(@PathVariable("interId") Long interId)
    {
        return AjaxResult.success(hhyAdminInterfaceService.selectHhyAdminInterfaceById(interId));
    }

    /**
     * 新增interface
     */
    @PreAuthorize(hasPermi = "admin:interface:add")
    @Log(title = "interface", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminInterface hhyAdminInterface)
    {
        return toAjax(hhyAdminInterfaceService.insertHhyAdminInterface(hhyAdminInterface));
    }

    /**
     * 修改interface
     */
    @PreAuthorize(hasPermi = "admin:interface:edit")
    @Log(title = "interface", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminInterface hhyAdminInterface)
    {
        return toAjax(hhyAdminInterfaceService.updateHhyAdminInterface(hhyAdminInterface));
    }

    /**
     * 删除interface
     */
    @PreAuthorize(hasPermi = "admin:interface:remove")
    @Log(title = "interface", businessType = BusinessType.DELETE)
	@DeleteMapping("/{interIds}")
    public AjaxResult remove(@PathVariable Long[] interIds)
    {
        return toAjax(hhyAdminInterfaceService.deleteHhyAdminInterfaceByIds(interIds));
    }
}
