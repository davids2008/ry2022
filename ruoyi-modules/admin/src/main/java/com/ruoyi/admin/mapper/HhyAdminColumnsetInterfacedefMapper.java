package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminColumnsetInterfacedef;

/**
 * hhy_admin_columnset_interfacedefMapper接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface HhyAdminColumnsetInterfacedefMapper 
{
    /**
     * 查询hhy_admin_columnset_interfacedef
     * 
     * @param colInId hhy_admin_columnset_interfacedefID
     * @return hhy_admin_columnset_interfacedef
     */
    public HhyAdminColumnsetInterfacedef selectHhyAdminColumnsetInterfacedefById(Long colInId);

    /**
     * 查询hhy_admin_columnset_interfacedef列表
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return hhy_admin_columnset_interfacedef集合
     */
    public List<HhyAdminColumnsetInterfacedef> selectHhyAdminColumnsetInterfacedefList(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef);

    /**
     * 新增hhy_admin_columnset_interfacedef
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return 结果
     */
    public int insertHhyAdminColumnsetInterfacedef(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef);

    /**
     * 修改hhy_admin_columnset_interfacedef
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return 结果
     */
    public int updateHhyAdminColumnsetInterfacedef(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef);

    /**
     * 删除hhy_admin_columnset_interfacedef
     * 
     * @param colInId hhy_admin_columnset_interfacedefID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetInterfacedefById(Long colInId);

    /**
     * 批量删除hhy_admin_columnset_interfacedef
     * 
     * @param colInIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetInterfacedefByIds(Long[] colInIds);
}
