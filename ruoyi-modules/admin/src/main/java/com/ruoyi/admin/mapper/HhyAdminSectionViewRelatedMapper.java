package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSectionViewRelated;

/**
 * hhy_admin_section_view_relatedMapper接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface HhyAdminSectionViewRelatedMapper 
{
    /**
     * 查询hhy_admin_section_view_related
     * 
     * @param secRelId hhy_admin_section_view_relatedID
     * @return hhy_admin_section_view_related
     */
    public HhyAdminSectionViewRelated selectHhyAdminSectionViewRelatedById(Long secRelId);

    /**
     * 查询hhy_admin_section_view_related列表
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return hhy_admin_section_view_related集合
     */
    public List<HhyAdminSectionViewRelated> selectHhyAdminSectionViewRelatedList(HhyAdminSectionViewRelated hhyAdminSectionViewRelated);

    /**
     * 新增hhy_admin_section_view_related
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return 结果
     */
    public int insertHhyAdminSectionViewRelated(HhyAdminSectionViewRelated hhyAdminSectionViewRelated);

    /**
     * 修改hhy_admin_section_view_related
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return 结果
     */
    public int updateHhyAdminSectionViewRelated(HhyAdminSectionViewRelated hhyAdminSectionViewRelated);

    /**
     * 删除hhy_admin_section_view_related
     * 
     * @param secRelId hhy_admin_section_view_relatedID
     * @return 结果
     */
    public int deleteHhyAdminSectionViewRelatedById(Long secRelId);

    /**
     * 批量删除hhy_admin_section_view_related
     * 
     * @param secRelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminSectionViewRelatedByIds(Long[] secRelIds);
}
