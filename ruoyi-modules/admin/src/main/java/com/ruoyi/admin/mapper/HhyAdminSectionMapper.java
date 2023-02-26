package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminSection;

/**
 * hhy_admin_sectionMapper接口
 * 
 * @author admin
 * @date 2022-01-24
 */
public interface HhyAdminSectionMapper 
{
    /**
     * 查询hhy_admin_section
     * 
     * @param secId hhy_admin_sectionID
     * @return hhy_admin_section
     */
    public HhyAdminSection selectHhyAdminSectionById(Long secId);

    /**
     * 查询hhy_admin_section列表
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return hhy_admin_section集合
     */
    public List<HhyAdminSection> selectHhyAdminSectionList(HhyAdminSection hhyAdminSection);

    /**
     * 新增hhy_admin_section
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return 结果
     */
    public int insertHhyAdminSection(HhyAdminSection hhyAdminSection);

    /**
     * 修改hhy_admin_section
     * 
     * @param hhyAdminSection hhy_admin_section
     * @return 结果
     */
    public int updateHhyAdminSection(HhyAdminSection hhyAdminSection);

    /**
     * 删除hhy_admin_section
     * 
     * @param secId hhy_admin_sectionID
     * @return 结果
     */
    public int deleteHhyAdminSectionById(Long secId);

    /**
     * 批量删除hhy_admin_section
     * 
     * @param secIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminSectionByIds(Long[] secIds);
}
