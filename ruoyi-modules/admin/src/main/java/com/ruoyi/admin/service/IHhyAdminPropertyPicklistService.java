package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminPropertyPicklist;

/**
 * picklistService接口
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
public interface IHhyAdminPropertyPicklistService 
{
    /**
     * 查询picklist
     * 
     * @param pickId picklistID
     * @return picklist
     */
    public HhyAdminPropertyPicklist selectHhyAdminPropertyPicklistById(Long pickId);

    /**
     * 查询picklist列表
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return picklist集合
     */
    public List<HhyAdminPropertyPicklist> selectHhyAdminPropertyPicklistList(HhyAdminPropertyPicklist hhyAdminPropertyPicklist);

    /**
     * 新增picklist
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return 结果
     */
    public int insertHhyAdminPropertyPicklist(HhyAdminPropertyPicklist hhyAdminPropertyPicklist);

    /**
     * 修改picklist
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return 结果
     */
    public int updateHhyAdminPropertyPicklist(HhyAdminPropertyPicklist hhyAdminPropertyPicklist);

    /**
     * 批量删除picklist
     * 
     * @param pickIds 需要删除的picklistID
     * @return 结果
     */
    public int deleteHhyAdminPropertyPicklistByIds(Long[] pickIds);

    /**
     * 删除picklist信息
     * 
     * @param pickId picklistID
     * @return 结果
     */
    public int deleteHhyAdminPropertyPicklistById(Long pickId);
}
