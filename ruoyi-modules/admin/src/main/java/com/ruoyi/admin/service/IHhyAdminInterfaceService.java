package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterface;

/**
 * interfaceService接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface IHhyAdminInterfaceService 
{
    /**
     * 查询interface
     * 
     * @param interId interfaceID
     * @return interface
     */
    public HhyAdminInterface selectHhyAdminInterfaceById(Long interId);

    /**
     * 查询interface列表
     * 
     * @param hhyAdminInterface interface
     * @return interface集合
     */
    public List<HhyAdminInterface> selectHhyAdminInterfaceList(HhyAdminInterface hhyAdminInterface);

    /**
     * 新增interface
     * 
     * @param hhyAdminInterface interface
     * @return 结果
     */
    public int insertHhyAdminInterface(HhyAdminInterface hhyAdminInterface);

    /**
     * 修改interface
     * 
     * @param hhyAdminInterface interface
     * @return 结果
     */
    public int updateHhyAdminInterface(HhyAdminInterface hhyAdminInterface);

    /**
     * 批量删除interface
     * 
     * @param interIds 需要删除的interfaceID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceByIds(Long[] interIds);

    /**
     * 删除interface信息
     * 
     * @param interId interfaceID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceById(Long interId);
}
