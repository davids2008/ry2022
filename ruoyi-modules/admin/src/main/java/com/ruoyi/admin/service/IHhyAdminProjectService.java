package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminProject;

/**
 * hhy_admin_projectService接口
 * 
 * @author admin
 * @date 2022-01-24
 */
public interface IHhyAdminProjectService 
{
    /**
     * 查询hhy_admin_project
     * 
     * @param projId hhy_admin_projectID
     * @return hhy_admin_project
     */
    public HhyAdminProject selectHhyAdminProjectById(Long projId);

    /**
     * 查询hhy_admin_project列表
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return hhy_admin_project集合
     */
    public List<HhyAdminProject> selectHhyAdminProjectList(HhyAdminProject hhyAdminProject);

    /**
     * 新增hhy_admin_project
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return 结果
     */
    public int insertHhyAdminProject(HhyAdminProject hhyAdminProject);

    /**
     * 修改hhy_admin_project
     * 
     * @param hhyAdminProject hhy_admin_project
     * @return 结果
     */
    public int updateHhyAdminProject(HhyAdminProject hhyAdminProject);

    /**
     * 批量删除hhy_admin_project
     * 
     * @param projIds 需要删除的hhy_admin_projectID
     * @return 结果
     */
    public int deleteHhyAdminProjectByIds(Long[] projIds);

    /**
     * 删除hhy_admin_project信息
     * 
     * @param projId hhy_admin_projectID
     * @return 结果
     */
    public int deleteHhyAdminProjectById(Long projId);
}
