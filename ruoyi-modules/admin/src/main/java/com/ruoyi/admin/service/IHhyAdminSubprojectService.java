package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSubproject;

/**
 * hhy_admin_subprojectService接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface IHhyAdminSubprojectService 
{
    /**
     * 查询hhy_admin_subproject
     * 
     * @param projSubid hhy_admin_subprojectID
     * @return hhy_admin_subproject
     */
    public HhyAdminSubproject selectHhyAdminSubprojectById(Long projSubid);

    /**
     * 查询hhy_admin_subproject列表
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return hhy_admin_subproject集合
     */
    public List<HhyAdminSubproject> selectHhyAdminSubprojectList(HhyAdminSubproject hhyAdminSubproject);

    /**
     * 新增hhy_admin_subproject
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return 结果
     */
    public int insertHhyAdminSubproject(HhyAdminSubproject hhyAdminSubproject);

    /**
     * 修改hhy_admin_subproject
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return 结果
     */
    public int updateHhyAdminSubproject(HhyAdminSubproject hhyAdminSubproject);

    /**
     * 批量删除hhy_admin_subproject
     * 
     * @param projSubids 需要删除的hhy_admin_subprojectID
     * @return 结果
     */
    public int deleteHhyAdminSubprojectByIds(Long[] projSubids);

    /**
     * 删除hhy_admin_subproject信息
     * 
     * @param projSubid hhy_admin_subprojectID
     * @return 结果
     */
    public int deleteHhyAdminSubprojectById(Long projSubid);
}
