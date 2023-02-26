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
import com.ruoyi.admin.domain.HhyAdminProject;
import com.ruoyi.admin.service.IHhyAdminProjectService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * hhy_admin_projectController
 * 
 * @author admin
 * @date 2022-01-24
 */
@RestController
@RequestMapping("/project")
public class HhyAdminProjectController extends BaseController
{
    @Autowired
    private IHhyAdminProjectService hhyAdminProjectService;

    /**
     * 查询hhy_admin_project列表
     */
    @PreAuthorize(hasPermi = "admin:project:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminProject hhyAdminProject)
    {
        startPage();
        List<HhyAdminProject> list = hhyAdminProjectService.selectHhyAdminProjectList(hhyAdminProject);
        return getDataTable(list);
    }

    /**
     * 导出hhy_admin_project列表
     */
    @PreAuthorize(hasPermi = "admin:project:export")
    @Log(title = "hhy_admin_project", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminProject hhyAdminProject) throws IOException
    {
        List<HhyAdminProject> list = hhyAdminProjectService.selectHhyAdminProjectList(hhyAdminProject);
        ExcelUtil<HhyAdminProject> util = new ExcelUtil<HhyAdminProject>(HhyAdminProject.class);
        util.exportExcel(response, list, "project");
    }

    /**
     * 获取hhy_admin_project详细信息
     */
    @PreAuthorize(hasPermi = "admin:project:query")
    @GetMapping(value = "/{projId}")
    public AjaxResult getInfo(@PathVariable("projId") Long projId)
    {
        return AjaxResult.success(hhyAdminProjectService.selectHhyAdminProjectById(projId));
    }

    /**
     * 新增hhy_admin_project
     */
    @PreAuthorize(hasPermi = "admin:project:add")
    @Log(title = "hhy_admin_project", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminProject hhyAdminProject)
    {
        return toAjax(hhyAdminProjectService.insertHhyAdminProject(hhyAdminProject));
    }

    /**
     * 修改hhy_admin_project
     */
    @PreAuthorize(hasPermi = "admin:project:edit")
    @Log(title = "hhy_admin_project", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminProject hhyAdminProject)
    {
        return toAjax(hhyAdminProjectService.updateHhyAdminProject(hhyAdminProject));
    }

    /**
     * 删除hhy_admin_project
     */
    @PreAuthorize(hasPermi = "admin:project:remove")
    @Log(title = "hhy_admin_project", businessType = BusinessType.DELETE)
	@DeleteMapping("/{projIds}")
    public AjaxResult remove(@PathVariable Long[] projIds)
    {
        return toAjax(hhyAdminProjectService.deleteHhyAdminProjectByIds(projIds));
    }
}
