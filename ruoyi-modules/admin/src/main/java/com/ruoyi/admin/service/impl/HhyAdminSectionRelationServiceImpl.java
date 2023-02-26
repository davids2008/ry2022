package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSectionRelationMapper;
import com.ruoyi.admin.domain.HhyAdminSectionRelation;
import com.ruoyi.admin.service.IHhyAdminSectionRelationService;

/**
 * hhy_admin_section_relationService业务层处理
 * 
 * @author admin
 * @date 2022-01-24
 */
@Service
public class HhyAdminSectionRelationServiceImpl implements IHhyAdminSectionRelationService 
{
    @Autowired
    private HhyAdminSectionRelationMapper hhyAdminSectionRelationMapper;

    /**
     * 查询hhy_admin_section_relation
     * 
     * @param secRelId hhy_admin_section_relationID
     * @return hhy_admin_section_relation
     */
    @Override
    public HhyAdminSectionRelation selectHhyAdminSectionRelationById(Long secRelId)
    {
        return hhyAdminSectionRelationMapper.selectHhyAdminSectionRelationById(secRelId);
    }

    /**
     * 查询hhy_admin_section_relation列表
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return hhy_admin_section_relation
     */
    @Override
    public List<HhyAdminSectionRelation> selectHhyAdminSectionRelationList(HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        return hhyAdminSectionRelationMapper.selectHhyAdminSectionRelationList(hhyAdminSectionRelation);
    }

    /**
     * 新增hhy_admin_section_relation
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return 结果
     */
    @Override
    public int insertHhyAdminSectionRelation(HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        hhyAdminSectionRelation.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSectionRelationMapper.insertHhyAdminSectionRelation(hhyAdminSectionRelation);
    }

    /**
     * 修改hhy_admin_section_relation
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return 结果
     */
    @Override
    public int updateHhyAdminSectionRelation(HhyAdminSectionRelation hhyAdminSectionRelation)
    {
        hhyAdminSectionRelation.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSectionRelationMapper.updateHhyAdminSectionRelation(hhyAdminSectionRelation);
    }

    /**
     * 批量删除hhy_admin_section_relation
     * 
     * @param secRelIds 需要删除的hhy_admin_section_relationID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionRelationByIds(Long[] secRelIds)
    {
        return hhyAdminSectionRelationMapper.deleteHhyAdminSectionRelationByIds(secRelIds);
    }

    /**
     * 删除hhy_admin_section_relation信息
     * 
     * @param secRelId hhy_admin_section_relationID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionRelationById(Long secRelId)
    {
        return hhyAdminSectionRelationMapper.deleteHhyAdminSectionRelationById(secRelId);
    }
}
