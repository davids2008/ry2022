package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminColumnset;

/**
 * hhy_admin_columnsetService接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface IHhyAdminColumnsetService 
{
    /**
     * 查询hhy_admin_columnset
     * 
     * @param colId hhy_admin_columnsetID
     * @return hhy_admin_columnset
     */
    public HhyAdminColumnset selectHhyAdminColumnsetById(Long colId);

    /**
     * 查询hhy_admin_columnset列表
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return hhy_admin_columnset集合
     */
    public List<HhyAdminColumnset> selectHhyAdminColumnsetList(HhyAdminColumnset hhyAdminColumnset);

    /**
     * 新增hhy_admin_columnset
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return 结果
     */
    public int insertHhyAdminColumnset(HhyAdminColumnset hhyAdminColumnset);

    /**
     * 修改hhy_admin_columnset
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return 结果
     */
    public int updateHhyAdminColumnset(HhyAdminColumnset hhyAdminColumnset);

    /**
     * 批量删除hhy_admin_columnset
     * 
     * @param colIds 需要删除的hhy_admin_columnsetID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetByIds(Long[] colIds);

    /**
     * 删除hhy_admin_columnset信息
     * 
     * @param colId hhy_admin_columnsetID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetById(Long colId);
}
