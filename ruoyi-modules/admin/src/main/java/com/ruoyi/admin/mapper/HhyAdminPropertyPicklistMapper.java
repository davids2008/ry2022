package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminPropertyPicklist;

/**
 * picklistMapper接口
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
public interface HhyAdminPropertyPicklistMapper 
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
     * 删除picklist
     * 
     * @param pickId picklistID
     * @return 结果
     */
    public int deleteHhyAdminPropertyPicklistById(Long pickId);

    /**
     * 批量删除picklist
     * 
     * @param pickIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminPropertyPicklistByIds(Long[] pickIds);
}
