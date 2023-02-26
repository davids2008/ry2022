package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSectionRelation;

/**
 * hhy_admin_section_relationService接口
 * 
 * @author admin
 * @date 2022-01-24
 */
public interface IHhyAdminSectionRelationService 
{
    /**
     * 查询hhy_admin_section_relation
     * 
     * @param secRelId hhy_admin_section_relationID
     * @return hhy_admin_section_relation
     */
    public HhyAdminSectionRelation selectHhyAdminSectionRelationById(Long secRelId);

    /**
     * 查询hhy_admin_section_relation列表
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return hhy_admin_section_relation集合
     */
    public List<HhyAdminSectionRelation> selectHhyAdminSectionRelationList(HhyAdminSectionRelation hhyAdminSectionRelation);

    /**
     * 新增hhy_admin_section_relation
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return 结果
     */
    public int insertHhyAdminSectionRelation(HhyAdminSectionRelation hhyAdminSectionRelation);

    /**
     * 修改hhy_admin_section_relation
     * 
     * @param hhyAdminSectionRelation hhy_admin_section_relation
     * @return 结果
     */
    public int updateHhyAdminSectionRelation(HhyAdminSectionRelation hhyAdminSectionRelation);

    /**
     * 批量删除hhy_admin_section_relation
     * 
     * @param secRelIds 需要删除的hhy_admin_section_relationID
     * @return 结果
     */
    public int deleteHhyAdminSectionRelationByIds(Long[] secRelIds);

    /**
     * 删除hhy_admin_section_relation信息
     * 
     * @param secRelId hhy_admin_section_relationID
     * @return 结果
     */
    public int deleteHhyAdminSectionRelationById(Long secRelId);
}
