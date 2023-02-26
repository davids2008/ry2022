package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminColumnset;

/**
 * hhy_admin_columnsetMapper接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface HhyAdminColumnsetMapper 
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
     * 删除hhy_admin_columnset
     * 
     * @param colId hhy_admin_columnsetID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetById(Long colId);

    /**
     * 批量删除hhy_admin_columnset
     * 
     * @param colIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetByIds(Long[] colIds);
}
