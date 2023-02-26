package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSubproject;

/**
 * hhy_admin_subprojectMapper接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface HhyAdminSubprojectMapper 
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
     * 删除hhy_admin_subproject
     * 
     * @param projSubid hhy_admin_subprojectID
     * @return 结果
     */
    public int deleteHhyAdminSubprojectById(Long projSubid);

    /**
     * 批量删除hhy_admin_subproject
     * 
     * @param projSubids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminSubprojectByIds(Long[] projSubids);
}
