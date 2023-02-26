package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSectionViewRelatedMapper;
import com.ruoyi.admin.domain.HhyAdminSectionViewRelated;
import com.ruoyi.admin.service.IHhyAdminSectionViewRelatedService;

/**
 * hhy_admin_section_view_relatedService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminSectionViewRelatedServiceImpl implements IHhyAdminSectionViewRelatedService 
{
    @Autowired
    private HhyAdminSectionViewRelatedMapper hhyAdminSectionViewRelatedMapper;

    /**
     * 查询hhy_admin_section_view_related
     * 
     * @param secRelId hhy_admin_section_view_relatedID
     * @return hhy_admin_section_view_related
     */
    @Override
    public HhyAdminSectionViewRelated selectHhyAdminSectionViewRelatedById(Long secRelId)
    {
        return hhyAdminSectionViewRelatedMapper.selectHhyAdminSectionViewRelatedById(secRelId);
    }

    /**
     * 查询hhy_admin_section_view_related列表
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return hhy_admin_section_view_related
     */
    @Override
    public List<HhyAdminSectionViewRelated> selectHhyAdminSectionViewRelatedList(HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        return hhyAdminSectionViewRelatedMapper.selectHhyAdminSectionViewRelatedList(hhyAdminSectionViewRelated);
    }

    /**
     * 新增hhy_admin_section_view_related
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return 结果
     */
    @Override
    public int insertHhyAdminSectionViewRelated(HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        hhyAdminSectionViewRelated.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSectionViewRelatedMapper.insertHhyAdminSectionViewRelated(hhyAdminSectionViewRelated);
    }

    /**
     * 修改hhy_admin_section_view_related
     * 
     * @param hhyAdminSectionViewRelated hhy_admin_section_view_related
     * @return 结果
     */
    @Override
    public int updateHhyAdminSectionViewRelated(HhyAdminSectionViewRelated hhyAdminSectionViewRelated)
    {
        hhyAdminSectionViewRelated.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSectionViewRelatedMapper.updateHhyAdminSectionViewRelated(hhyAdminSectionViewRelated);
    }

    /**
     * 批量删除hhy_admin_section_view_related
     * 
     * @param secRelIds 需要删除的hhy_admin_section_view_relatedID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionViewRelatedByIds(Long[] secRelIds)
    {
        return hhyAdminSectionViewRelatedMapper.deleteHhyAdminSectionViewRelatedByIds(secRelIds);
    }

    /**
     * 删除hhy_admin_section_view_related信息
     * 
     * @param secRelId hhy_admin_section_view_relatedID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionViewRelatedById(Long secRelId)
    {
        return hhyAdminSectionViewRelatedMapper.deleteHhyAdminSectionViewRelatedById(secRelId);
    }
}
