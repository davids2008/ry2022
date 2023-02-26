package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSectionMapper;
import com.ruoyi.admin.domain.HhyAdminSection;
import com.ruoyi.admin.service.IHhyAdminSectionService;

/**
 * hhy_admin_sectionService业务层处理
 * 
 * @author admin
 * @date 2022-01-24
 */
@Service
public class HhyAdminSectionServiceImpl implements IHhyAdminSectionService 
{
    @Autowired
    private HhyAdminSectionMapper hhyAdminSectionMapper;

    /**
     * 查询hhy_admin_section
     * 
     * @param secId hhy_admin_sectionID
     * @return hhy_admin_section
     */
    @Override
    public HhyAdminSection selectHhyAdminSectionById(Long secId)
    {
        return hhyAdminSectionMapper.selectHhyAdminSectionById(secId);
    }

    /**
     * 查询hhy_admin_section列表
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return hhy_admin_section
     */
    @Override
    public List<HhyAdminSection> selectHhyAdminSectionList(HhyAdminSection hhyAdminSection)
    {
        return hhyAdminSectionMapper.selectHhyAdminSectionList(hhyAdminSection);
    }

    /**
     * 新增hhy_admin_section
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return 结果
     */
    @Override
    public int insertHhyAdminSection(HhyAdminSection hhyAdminSection)
    {
        hhyAdminSection.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSectionMapper.insertHhyAdminSection(hhyAdminSection);
    }

    /**
     * 修改hhy_admin_section
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return 结果
     */
    @Override
    public int updateHhyAdminSection(HhyAdminSection hhyAdminSection)
    {
        hhyAdminSection.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSectionMapper.updateHhyAdminSection(hhyAdminSection);
    }

    /**
     * 批量删除hhy_admin_section
     * 
     * @param secIds 需要删除的hhy_admin_sectionID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionByIds(Long[] secIds)
    {
        return hhyAdminSectionMapper.deleteHhyAdminSectionByIds(secIds);
    }

    /**
     * 删除hhy_admin_section信息
     * 
     * @param secId hhy_admin_sectionID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSectionById(Long secId)
    {
        return hhyAdminSectionMapper.deleteHhyAdminSectionById(secId);
    }
}
