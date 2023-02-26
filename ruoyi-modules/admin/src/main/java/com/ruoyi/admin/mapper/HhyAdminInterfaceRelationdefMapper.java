package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminInterfaceRelationdef;

/**
 * interface_relationdefMapper接口
 * 
 * @author daichao
 * @date 2022-01-21
 */
public interface HhyAdminInterfaceRelationdefMapper 
{
    /**
     * 查询interface_relationdef
     * 
     * @param interRelId interface_relationdefID
     * @return interface_relationdef
     */
    public HhyAdminInterfaceRelationdef selectHhyAdminInterfaceRelationdefById(Long interRelId);

    /**
     * 查询interface_relationdef列表
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return interface_relationdef集合
     */
    public List<HhyAdminInterfaceRelationdef> selectHhyAdminInterfaceRelationdefList(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef);

    /**
     * 新增interface_relationdef
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return 结果
     */
    public int insertHhyAdminInterfaceRelationdef(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef);

    /**
     * 修改interface_relationdef
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return 结果
     */
    public int updateHhyAdminInterfaceRelationdef(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef);

    /**
     * 删除interface_relationdef
     * 
     * @param interRelId interface_relationdefID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceRelationdefById(Long interRelId);

    /**
     * 批量删除interface_relationdef
     * 
     * @param interRelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminInterfaceRelationdefByIds(Long[] interRelIds);
}
