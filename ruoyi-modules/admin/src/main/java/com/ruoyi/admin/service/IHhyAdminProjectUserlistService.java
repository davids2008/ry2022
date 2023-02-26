package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminProjectUserlist;

/**
 * hhy_admin_project_userlistService接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface IHhyAdminProjectUserlistService 
{
    /**
     * 查询hhy_admin_project_userlist
     * 
     * @param projUId hhy_admin_project_userlistID
     * @return hhy_admin_project_userlist
     */
    public HhyAdminProjectUserlist selectHhyAdminProjectUserlistById(Long projUId);

    /**
     * 查询hhy_admin_project_userlist列表
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return hhy_admin_project_userlist集合
     */
    public List<HhyAdminProjectUserlist> selectHhyAdminProjectUserlistList(HhyAdminProjectUserlist hhyAdminProjectUserlist);

    /**
     * 新增hhy_admin_project_userlist
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return 结果
     */
    public int insertHhyAdminProjectUserlist(HhyAdminProjectUserlist hhyAdminProjectUserlist);

    /**
     * 修改hhy_admin_project_userlist
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return 结果
     */
    public int updateHhyAdminProjectUserlist(HhyAdminProjectUserlist hhyAdminProjectUserlist);

    /**
     * 批量删除hhy_admin_project_userlist
     * 
     * @param projUIds 需要删除的hhy_admin_project_userlistID
     * @return 结果
     */
    public int deleteHhyAdminProjectUserlistByIds(Long[] projUIds);

    /**
     * 删除hhy_admin_project_userlist信息
     * 
     * @param projUId hhy_admin_project_userlistID
     * @return 结果
     */
    public int deleteHhyAdminProjectUserlistById(Long projUId);
}
