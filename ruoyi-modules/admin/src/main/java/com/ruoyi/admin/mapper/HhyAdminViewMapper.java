package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminView;

/**
 * hhy_admin_viewMapper接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface HhyAdminViewMapper 
{
    /**
     * 查询hhy_admin_view
     * 
     * @param viewId hhy_admin_viewID
     * @return hhy_admin_view
     */
    public HhyAdminView selectHhyAdminViewById(Long viewId);

    /**
     * 查询hhy_admin_view列表
     * 
     * @param hhyAdminView hhy_admin_view
     * @return hhy_admin_view集合
     */
    public List<HhyAdminView> selectHhyAdminViewList(HhyAdminView hhyAdminView);

    /**
     * 新增hhy_admin_view
     * 
     * @param hhyAdminView hhy_admin_view
     * @return 结果
     */
    public int insertHhyAdminView(HhyAdminView hhyAdminView);

    /**
     * 修改hhy_admin_view
     * 
     * @param hhyAdminView hhy_admin_view
     * @return 结果
     */
    public int updateHhyAdminView(HhyAdminView hhyAdminView);

    /**
     * 删除hhy_admin_view
     * 
     * @param viewId hhy_admin_viewID
     * @return 结果
     */
    public int deleteHhyAdminViewById(Long viewId);

    /**
     * 批量删除hhy_admin_view
     * 
     * @param viewIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminViewByIds(Long[] viewIds);
}
