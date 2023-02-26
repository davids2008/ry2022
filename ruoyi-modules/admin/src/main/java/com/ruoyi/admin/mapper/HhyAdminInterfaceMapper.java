package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterface;

/**
 * interfaceMapper接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface HhyAdminInterfaceMapper 
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
     * 删除interface
     * 
     * @param interId interfaceID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceById(Long interId);

    /**
     * 批量删除interface
     * 
     * @param interIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceByIds(Long[] interIds);
}
