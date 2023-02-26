package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSystemhierarchy;

/**
 * systemhierarchyService接口
 * 
 * @author daichao
 * @date 2022-01-19
 */
public interface IHhyAdminSystemhierarchyService 
{
    /**
     * 查询systemhierarchy
     * 
     * @param syshId systemhierarchyID
     * @return systemhierarchy
     */
    public HhyAdminSystemhierarchy selectHhyAdminSystemhierarchyById(Long syshId);

    /**
     * 查询systemhierarchy列表
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return systemhierarchy集合
     */
    public List<HhyAdminSystemhierarchy> selectHhyAdminSystemhierarchyList(HhyAdminSystemhierarchy hhyAdminSystemhierarchy);

    /**
     * 新增systemhierarchy
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return 结果
     */
    public int insertHhyAdminSystemhierarchy(HhyAdminSystemhierarchy hhyAdminSystemhierarchy);

    /**
     * 修改systemhierarchy
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return 结果
     */
    public int updateHhyAdminSystemhierarchy(HhyAdminSystemhierarchy hhyAdminSystemhierarchy);

    /**
     * 批量删除systemhierarchy
     * 
     * @param syshIds 需要删除的systemhierarchyID
     * @return 结果
     */
    public int deleteHhyAdminSystemhierarchyByIds(Long[] syshIds);

    /**
     * 删除systemhierarchy信息
     * 
     * @param syshId systemhierarchyID
     * @return 结果
     */
    public int deleteHhyAdminSystemhierarchyById(Long syshId);
}
