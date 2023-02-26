package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSystemhierarchyMapper;
import com.ruoyi.admin.domain.HhyAdminSystemhierarchy;
import com.ruoyi.admin.service.IHhyAdminSystemhierarchyService;

/**
 * systemhierarchyService业务层处理
 * 
 * @author daichao
 * @date 2022-01-19
 */
@Service
public class HhyAdminSystemhierarchyServiceImpl implements IHhyAdminSystemhierarchyService 
{
    @Autowired
    private HhyAdminSystemhierarchyMapper hhyAdminSystemhierarchyMapper;

    /**
     * 查询systemhierarchy
     * 
     * @param syshId systemhierarchyID
     * @return systemhierarchy
     */
    @Override
    public HhyAdminSystemhierarchy selectHhyAdminSystemhierarchyById(Long syshId)
    {
        return hhyAdminSystemhierarchyMapper.selectHhyAdminSystemhierarchyById(syshId);
    }

    /**
     * 查询systemhierarchy列表
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return systemhierarchy
     */
    @Override
    public List<HhyAdminSystemhierarchy> selectHhyAdminSystemhierarchyList(HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        return hhyAdminSystemhierarchyMapper.selectHhyAdminSystemhierarchyList(hhyAdminSystemhierarchy);
    }

    /**
     * 新增systemhierarchy
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return 结果
     */
    @Override
    public int insertHhyAdminSystemhierarchy(HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        hhyAdminSystemhierarchy.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSystemhierarchyMapper.insertHhyAdminSystemhierarchy(hhyAdminSystemhierarchy);
    }

    /**
     * 修改systemhierarchy
     * 
     * @param hhyAdminSystemhierarchy systemhierarchy
     * @return 结果
     */
    @Override
    public int updateHhyAdminSystemhierarchy(HhyAdminSystemhierarchy hhyAdminSystemhierarchy)
    {
        hhyAdminSystemhierarchy.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSystemhierarchyMapper.updateHhyAdminSystemhierarchy(hhyAdminSystemhierarchy);
    }

    /**
     * 批量删除systemhierarchy
     * 
     * @param syshIds 需要删除的systemhierarchyID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSystemhierarchyByIds(Long[] syshIds)
    {
        return hhyAdminSystemhierarchyMapper.deleteHhyAdminSystemhierarchyByIds(syshIds);
    }

    /**
     * 删除systemhierarchy信息
     * 
     * @param syshId systemhierarchyID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSystemhierarchyById(Long syshId)
    {
        return hhyAdminSystemhierarchyMapper.deleteHhyAdminSystemhierarchyById(syshId);
    }
}
