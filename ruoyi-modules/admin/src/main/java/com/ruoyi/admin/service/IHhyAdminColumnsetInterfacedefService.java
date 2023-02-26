package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminColumnsetInterfacedef;

/**
 * hhy_admin_columnset_interfacedefService接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface IHhyAdminColumnsetInterfacedefService 
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
     * 批量删除hhy_admin_columnset_interfacedef
     * 
     * @param colInIds 需要删除的hhy_admin_columnset_interfacedefID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetInterfacedefByIds(Long[] colInIds);

    /**
     * 删除hhy_admin_columnset_interfacedef信息
     * 
     * @param colInId hhy_admin_columnset_interfacedefID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetInterfacedefById(Long colInId);
}
