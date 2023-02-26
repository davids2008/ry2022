package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterfaceImplied;

/**
 * interface_impliedService接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface IHhyAdminInterfaceImpliedService 
{
    /**
     * 查询interface_implied
     * 
     * @param interImId interface_impliedID
     * @return interface_implied
     */
    public HhyAdminInterfaceImplied selectHhyAdminInterfaceImpliedById(Long interImId);

    /**
     * 查询interface_implied列表
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return interface_implied集合
     */
    public List<HhyAdminInterfaceImplied> selectHhyAdminInterfaceImpliedList(HhyAdminInterfaceImplied hhyAdminInterfaceImplied);

    /**
     * 新增interface_implied
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return 结果
     */
    public int insertHhyAdminInterfaceImplied(HhyAdminInterfaceImplied hhyAdminInterfaceImplied);

    /**
     * 修改interface_implied
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return 结果
     */
    public int updateHhyAdminInterfaceImplied(HhyAdminInterfaceImplied hhyAdminInterfaceImplied);

    /**
     * 批量删除interface_implied
     * 
     * @param interImIds 需要删除的interface_impliedID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceImpliedByIds(Long[] interImIds);

    /**
     * 删除interface_implied信息
     * 
     * @param interImId interface_impliedID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceImpliedById(Long interImId);
}
