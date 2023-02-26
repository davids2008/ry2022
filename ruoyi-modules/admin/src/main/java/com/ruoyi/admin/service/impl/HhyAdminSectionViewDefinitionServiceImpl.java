package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSectionViewDefinitionMapper;
import com.ruoyi.admin.domain.HhyAdminSectionViewDefinition;
import com.ruoyi.admin.service.IHhyAdminSectionViewDefinitionService;

/**
 * hhy_admin_section_view_definitionService业务层处理
 * 
 * @author admin
 * @date 2022-01-24
 */
@Service
public class HhyAdminSectionViewDefinitionServiceImpl implements IHhyAdminSectionViewDefinitionService 
{
    @Autowired
    private HhyAdminSectionViewDefinitionMapper hhyAdminSectionViewDefinitionMapper;

    /**
     * 查询hhy_admin_section_view_definition
     * 
     * @param secDefId hhy_admin_section_view_definitionID
     * @return hhy_admin_section_view_definition
     */
    @Override
    public HhyAdminSectionViewDefinition selectHhyAdminSectionViewDefinitionById(Long secDefId)
    {
        return hhyAdminSectionViewDefinitionMapper.selectHhyAdminSectionViewDefinitionById(secDefId);
    }

    /**
     * 查询hhy_admin_section_view_definition列表
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return hhy_admin_section_view_definition
     */
    @Override
    public List<HhyAdminSectionViewDefinition> selectHhyAdminSectionViewDefinitionList(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        return hhyAdminSectionViewDefinitionMapper.selectHhyAdminSectionViewDefinitionList(hhyAdminSectionViewDefinition);
    }

    /**
     * 新增hhy_admin_section_view_definition
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return 结果
     */
    @Override
    public int insertHhyAdminSectionViewDefinition(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        hhyAdminSectionViewDefinition.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSectionViewDefinitionMapper.insertHhyAdminSectionViewDefinition(hhyAdminSectionViewDefinition);
    }

    /**
     * 修改hhy_admin_section_view_definition
     * 
     * @param hhyAdminSectionViewDefinition hhy_admin_section_view_definition
     * @return 结果
     */
    @Override
    public int updateHhyAdminSectionViewDefinition(HhyAdminSectionViewDefinition hhyAdminSectionViewDefinition)
    {
        hhyAdminSectionViewDefinition.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSectionViewDefinitionMapper.updateHhyAdminSectionViewDefinition(hhyAdminSectionViewDefinition);
    }

    /**
     * 批量删除hhy_admin_section_view_definition
     * 
     * @param secDefIds 需要删除的hhy_admin_section_view_definitionID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionViewDefinitionByIds(Long[] secDefIds)
    {
        return hhyAdminSectionViewDefinitionMapper.deleteHhyAdminSectionViewDefinitionByIds(secDefIds);
    }

    /**
     * 删除hhy_admin_section_view_definition信息
     * 
     * @param secDefId hhy_admin_section_view_definitionID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionViewDefinitionById(Long secDefId)
    {
        return hhyAdminSectionViewDefinitionMapper.deleteHhyAdminSectionViewDefinitionById(secDefId);
    }
}
