package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSectionViewDefinition;

/**
 * hhy_admin_section_view_definitionMapper接口
 * 
 * @author admin
 * @date 2022-01-24
 */
public interface HhyAdminSectionViewDefinitionMapper 
{
    /**
     * 查询hhy_admin_section_view_definition
     * 
     * @param secDefId hhy_admin_section_view_definitionID
     * @return hhy_admin_section_view_definition
     */
    public HhyAdminSectionViewDefinition selectHhyAdminSectionViewDefinitionById(Long secDefId);

    /**
     * 查询hhy_admin_section_view_definition列表
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return hhy_admin_section_view_definition集合
     */
    public List<HhyAdminSectionViewDefinition> selectHhyAdminSectionViewDefinitionList(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition);

    /**
     * 新增hhy_admin_section_view_definition
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return 结果
     */
    public int insertHhyAdminSectionViewDefinition(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition);

    /**
     * 修改hhy_admin_section_view_definition
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return 结果
     */
    public int updateHhyAdminSectionViewDefinition(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition);

    /**
     * 删除hhy_admin_section_view_definition
     * 
     * @param secDefId hhy_admin_section_view_definitionID
     * @return 结果
     */
    public int deleteHhyAdminSectionViewDefinitionById(Long secDefId);

    /**
     * 批量删除hhy_admin_section_view_definition
     * 
     * @param secDefIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminSectionViewDefinitionByIds(Long[] secDefIds);
}
