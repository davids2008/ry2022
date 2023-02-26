package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterfacePropertydef;

/**
 * interface_propertydefMapper接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface HhyAdminInterfacePropertydefMapper 
{
    /**
     * 查询interface_propertydef
     * 
     * @param interProId interface_propertydefID
     * @return interface_propertydef
     */
    public HhyAdminInterfacePropertydef selectHhyAdminInterfacePropertydefById(Long interProId);

    /**
     * 查询interface_propertydef列表
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return interface_propertydef集合
     */
    public List<HhyAdminInterfacePropertydef> selectHhyAdminInterfacePropertydefList(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef);

    /**
     * 新增interface_propertydef
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return 结果
     */
    public int insertHhyAdminInterfacePropertydef(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef);

    /**
     * 修改interface_propertydef
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return 结果
     */
    public int updateHhyAdminInterfacePropertydef(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef);

    /**
     * 删除interface_propertydef
     * 
     * @param interProId interface_propertydefID
     * @return 结果
     */
    public int deleteHhyAdminInterfacePropertydefById(Long interProId);

    /**
     * 批量删除interface_propertydef
     * 
     * @param interProIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminInterfacePropertydefByIds(Long[] interProIds);
}
