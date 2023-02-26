package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminViewMapper;
import com.ruoyi.admin.domain.HhyAdminView;
import com.ruoyi.admin.service.IHhyAdminViewService;

/**
 * hhy_admin_viewService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminViewServiceImpl implements IHhyAdminViewService 
{
    @Autowired
    private HhyAdminViewMapper hhyAdminViewMapper;

    /**
     * 查询hhy_admin_view
     * 
     * @param viewId hhy_admin_viewID
     * @return hhy_admin_view
     */
    @Override
    public HhyAdminView selectHhyAdminViewById(Long viewId)
    {
        return hhyAdminViewMapper.selectHhyAdminViewById(viewId);
    }

    /**
     * 查询hhy_admin_view列表
     * 
     * @param hhyAdminView hhy_admin_view
     * @return hhy_admin_view
     */
    @Override
    public List<HhyAdminView> selectHhyAdminViewList(HhyAdminView hhyAdminView)
    {
        return hhyAdminViewMapper.selectHhyAdminViewList(hhyAdminView);
    }

    /**
     * 新增hhy_admin_view
     * 
     * @param hhyAdminView hhy_admin_view
     * @return 结果
     */
    @Override
    public int insertHhyAdminView(HhyAdminView hhyAdminView)
    {
        hhyAdminView.setCreateTime(DateUtils.getNowDate());
        return hhyAdminViewMapper.insertHhyAdminView(hhyAdminView);
    }

    /**
     * 修改hhy_admin_view
     * 
     * @param hhyAdminView hhy_admin_view
     * @return 结果
     */
    @Override
    public int updateHhyAdminView(HhyAdminView hhyAdminView)
    {
        hhyAdminView.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminViewMapper.updateHhyAdminView(hhyAdminView);
    }

    /**
     * 批量删除hhy_admin_view
     * 
     * @param viewIds 需要删除的hhy_admin_viewID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminViewByIds(Long[] viewIds)
    {
        return hhyAdminViewMapper.deleteHhyAdminViewByIds(viewIds);
    }

    /**
     * 删除hhy_admin_view信息
     * 
     * @param viewId hhy_admin_viewID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminViewById(Long viewId)
    {
        return hhyAdminViewMapper.deleteHhyAdminViewById(viewId);
    }
}
