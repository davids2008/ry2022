package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterfacePropertydef;

/**
 * interface_propertydefService接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface IHhyAdminInterfacePropertydefService 
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
     * 批量删除interface_propertydef
     * 
     * @param interProIds 需要删除的interface_propertydefID
     * @return 结果
     */
    public int deleteHhyAdminInterfacePropertydefByIds(Long[] interProIds);

    /**
     * 删除interface_propertydef信息
     * 
     * @param interProId interface_propertydefID
     * @return 结果
     */
    public int deleteHhyAdminInterfacePropertydefById(Long interProId);
}
