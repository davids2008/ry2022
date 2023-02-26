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
import com.ruoyi.admin.domain.HhyAdminEngineerdata;
import com.ruoyi.admin.service.IHhyAdminEngineerdataService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * engineerdataController
 * 
 * @author daichao
 * @date 2022-01-20
 */
@RestController
@RequestMapping("/engineerdata")
public class HhyAdminEngineerdataController extends BaseController
{
    @Autowired
    private IHhyAdminEngineerdataService hhyAdminEngineerdataService;

    /**
     * 查询engineerdata列表
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:list")
    @GetMapping("/list")
    public TableDataInfo list(HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        startPage();
        List<HhyAdminEngineerdata> list = hhyAdminEngineerdataService.selectHhyAdminEngineerdataList(hhyAdminEngineerdata);
        return getDataTable(list);
    }

    /**
     * 导出engineerdata列表
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:export")
    @Log(title = "engineerdata", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HhyAdminEngineerdata hhyAdminEngineerdata) throws IOException
    {
        List<HhyAdminEngineerdata> list = hhyAdminEngineerdataService.selectHhyAdminEngineerdataList(hhyAdminEngineerdata);
        ExcelUtil<HhyAdminEngineerdata> util = new ExcelUtil<HhyAdminEngineerdata>(HhyAdminEngineerdata.class);
        util.exportExcel(response, list, "engineerdata");
    }

    /**
     * 获取engineerdata详细信息
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:query")
    @GetMapping(value = "/{engId}")
    public AjaxResult getInfo(@PathVariable("engId") Long engId)
    {
        return AjaxResult.success(hhyAdminEngineerdataService.selectHhyAdminEngineerdataById(engId));
    }

    /**
     * 新增engineerdata
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:add")
    @Log(title = "engineerdata", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        return toAjax(hhyAdminEngineerdataService.insertHhyAdminEngineerdata(hhyAdminEngineerdata));
    }

    /**
     * 修改engineerdata
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:edit")
    @Log(title = "engineerdata", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        return toAjax(hhyAdminEngineerdataService.updateHhyAdminEngineerdata(hhyAdminEngineerdata));
    }

    /**
     * 删除engineerdata
     */
    @PreAuthorize(hasPermi = "admin:engineerdata:remove")
    @Log(title = "engineerdata", businessType = BusinessType.DELETE)
	@DeleteMapping("/{engIds}")
    public AjaxResult remove(@PathVariable Long[] engIds)
    {
        return toAjax(hhyAdminEngineerdataService.deleteHhyAdminEngineerdataByIds(engIds));
    }
}
