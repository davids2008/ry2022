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
import com.ruoyi.admin.domain.HhyAdminProjectUserlist;
import com.ruoyi.admin.service.IHhyAdminProjectUserlistService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_project_userlistController
 * 
 * @author daichao
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/prouserlist")
public class HhyAdminProjectUserlistController extends BaseController
{
    @Autowired
    private IHhyAdminProjectUserlistService hhyAdminProjectUserlistService;

    /**
     * 查询hhy_admin_project_userlist列表
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        startPage();
        List<HhyAdminProjectUserlist> list = hhyAdminProjectUserlistService.selectHhyAdminProjectUserlistList(hhyAdminProjectUserlist);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_project_userlist列表
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:export")
    @Log(title = "hhy_admin_project_userlist", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminProjectUserlist hhyAdminProjectUserlist) throws IOException
    {
        List<HhyAdminProjectUserlist> list = hhyAdminProjectUserlistService.selectHhyAdminProjectUserlistList(hhyAdminProjectUserlist);
        ExcelUtil<HhyAdminProjectUserlist> util = new ExcelUtil<HhyAdminProjectUserlist>(HhyAdminProjectUserlist.class);
        util.exportExcel(response, list, "prouserlist");
    }

    /**
     * 获取hhy_admin_project_userlist详细信息
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:query")
    @GetMapping(value = "/{projUId}")
    public AjaxResult getInfo(@PathVariable("projUId") Long projUId)
    {
        return AjaxResult.success(hhyAdminProjectUserlistService.selectHhyAdminProjectUserlistById(projUId));
    }

    /**
     * 新增hhy_admin_project_userlist
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:add")
    @Log(title = "hhy_admin_project_userlist", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        return toAjax(hhyAdminProjectUserlistService.insertHhyAdminProjectUserlist(hhyAdminProjectUserlist));
    }

    /**
     * 修改hhy_admin_project_userlist
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:edit")
    @Log(title = "hhy_admin_project_userlist", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        return toAjax(hhyAdminProjectUserlistService.updateHhyAdminProjectUserlist(hhyAdminProjectUserlist));
    }

    /**
     * 删除hhy_admin_project_userlist
     */
    @PreAuthorize(hasPermi = "admin:prouserlist:remove")
    @Log(title = "hhy_admin_project_userlist", businessType = BusinessType.DELETE)
	@DeleteMapping("/{projUIds}")
    public AjaxResult remove(@PathVariable Long[] projUIds)
    {
        return toAjax(hhyAdminProjectUserlistService.deleteHhyAdminProjectUserlistByIds(projUIds));
    }
}
