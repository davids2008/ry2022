package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminPropertyPicklistMapper;
import com.ruoyi.admin.domain.HhyAdminPropertyPicklist;
import com.ruoyi.admin.service.IHhyAdminPropertyPicklistService;

/**
 * picklistService业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
@Service
public class HhyAdminPropertyPicklistServiceImpl implements IHhyAdminPropertyPicklistService 
{
    @Autowired
    private HhyAdminPropertyPicklistMapper hhyAdminPropertyPicklistMapper;

    /**
     * 查询picklist
     * 
     * @param pickId picklistID
     * @return picklist
     */
    @Override
    public HhyAdminPropertyPicklist selectHhyAdminPropertyPicklistById(Long pickId)
    {
        return hhyAdminPropertyPicklistMapper.selectHhyAdminPropertyPicklistById(pickId);
    }

    /**
     * 查询picklist列表
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return picklist
     */
    @Override
    public List<HhyAdminPropertyPicklist> selectHhyAdminPropertyPicklistList(HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        return hhyAdminPropertyPicklistMapper.selectHhyAdminPropertyPicklistList(hhyAdminPropertyPicklist);
    }

    /**
     * 新增picklist
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return 结果
     */
    @Override
    public int insertHhyAdminPropertyPicklist(HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        hhyAdminPropertyPicklist.setCreateTime(DateUtils.getNowDate());
        return hhyAdminPropertyPicklistMapper.insertHhyAdminPropertyPicklist(hhyAdminPropertyPicklist);
    }

    /**
     * 修改picklist
     * 
     * @param hhyAdminPropertyPicklist picklist
     * @return 结果
     */
    @Override
    public int updateHhyAdminPropertyPicklist(HhyAdminPropertyPicklist hhyAdminPropertyPicklist)
    {
        hhyAdminPropertyPicklist.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminPropertyPicklistMapper.updateHhyAdminPropertyPicklist(hhyAdminPropertyPicklist);
    }

    /**
     * 批量删除picklist
     * 
     * @param pickIds 需要删除的picklistID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminPropertyPicklistByIds(Long[] pickIds)
    {
        return hhyAdminPropertyPicklistMapper.deleteHhyAdminPropertyPicklistByIds(pickIds);
    }

    /**
     * 删除picklist信息
     * 
     * @param pickId picklistID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminPropertyPicklistById(Long pickId)
    {
        return hhyAdminPropertyPicklistMapper.deleteHhyAdminPropertyPicklistById(pickId);
    }
}
