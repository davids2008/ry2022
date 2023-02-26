package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminColumnsetMapper;
import com.ruoyi.admin.domain.HhyAdminColumnset;
import com.ruoyi.admin.service.IHhyAdminColumnsetService;

/**
 * hhy_admin_columnsetService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminColumnsetServiceImpl implements IHhyAdminColumnsetService 
{
    @Autowired
    private HhyAdminColumnsetMapper hhyAdminColumnsetMapper;

    /**
     * 查询hhy_admin_columnset
     * 
     * @param colId hhy_admin_columnsetID
     * @return hhy_admin_columnset
     */
    @Override
    public HhyAdminColumnset selectHhyAdminColumnsetById(Long colId)
    {
        return hhyAdminColumnsetMapper.selectHhyAdminColumnsetById(colId);
    }

    /**
     * 查询hhy_admin_columnset列表
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return hhy_admin_columnset
     */
    @Override
    public List<HhyAdminColumnset> selectHhyAdminColumnsetList(HhyAdminColumnset hhyAdminColumnset)
    {
        return hhyAdminColumnsetMapper.selectHhyAdminColumnsetList(hhyAdminColumnset);
    }

    /**
     * 新增hhy_admin_columnset
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return 结果
     */
    @Override
    public int insertHhyAdminColumnset(HhyAdminColumnset hhyAdminColumnset)
    {
        hhyAdminColumnset.setCreateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetMapper.insertHhyAdminColumnset(hhyAdminColumnset);
    }

    /**
     * 修改hhy_admin_columnset
     * 
     * @param hhyAdminColumnset hhy_admin_columnset
     * @return 结果
     */
    @Override
    public int updateHhyAdminColumnset(HhyAdminColumnset hhyAdminColumnset)
    {
        hhyAdminColumnset.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetMapper.updateHhyAdminColumnset(hhyAdminColumnset);
    }

    /**
     * 批量删除hhy_admin_columnset
     * 
     * @param colIds 需要删除的hhy_admin_columnsetID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetByIds(Long[] colIds)
    {
        return hhyAdminColumnsetMapper.deleteHhyAdminColumnsetByIds(colIds);
    }

    /**
     * 删除hhy_admin_columnset信息
     * 
     * @param colId hhy_admin_columnsetID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetById(Long colId)
    {
        return hhyAdminColumnsetMapper.deleteHhyAdminColumnsetById(colId);
    }
}
