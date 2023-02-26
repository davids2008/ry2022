package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminProjectMapper;
import com.ruoyi.admin.domain.HhyAdminProject;
import com.ruoyi.admin.service.IHhyAdminProjectService;

/**
 * hhy_admin_projectService业务层处理
 * 
 * @author admin
 * @date 2022-01-24
 */
@Service
public class HhyAdminProjectServiceImpl implements IHhyAdminProjectService 
{
    @Autowired
    private HhyAdminProjectMapper hhyAdminProjectMapper;

    /**
     * 查询hhy_admin_project
     * 
     * @param projId hhy_admin_projectID
     * @return hhy_admin_project
     */
    @Override
    public HhyAdminProject selectHhyAdminProjectById(Long projId)
    {
        return hhyAdminProjectMapper.selectHhyAdminProjectById(projId);
    }

    /**
     * 查询hhy_admin_project列表
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return hhy_admin_project
     */
    @Override
    public List<HhyAdminProject> selectHhyAdminProjectList(HhyAdminProject hhyAdminProject)
    {
        return hhyAdminProjectMapper.selectHhyAdminProjectList(hhyAdminProject);
    }

    /**
     * 新增hhy_admin_project
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return 结果
     */
    @Override
    public int insertHhyAdminProject(HhyAdminProject hhyAdminProject)
    {
        hhyAdminProject.setCreateTime(DateUtils.getNowDate());
        return hhyAdminProjectMapper.insertHhyAdminProject(hhyAdminProject);
    }

    /**
     * 修改hhy_admin_project
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return 结果
     */
    @Override
    public int updateHhyAdminProject(HhyAdminProject hhyAdminProject)
    {
        hhyAdminProject.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminProjectMapper.updateHhyAdminProject(hhyAdminProject);
    }

    /**
     * 批量删除hhy_admin_project
     * 
     * @param projIds 需要删除的hhy_admin_projectID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminProjectByIds(Long[] projIds)
    {
        return hhyAdminProjectMapper.deleteHhyAdminProjectByIds(projIds);
    }

    /**
     * 删除hhy_admin_project信息
     * 
     * @param projId hhy_admin_projectID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminProjectById(Long projId)
    {
        return hhyAdminProjectMapper.deleteHhyAdminProjectById(projId);
    }
}
