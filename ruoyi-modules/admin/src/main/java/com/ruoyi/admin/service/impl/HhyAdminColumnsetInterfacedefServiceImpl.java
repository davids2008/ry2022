package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminColumnsetInterfacedefMapper;
import com.ruoyi.admin.domain.HhyAdminColumnsetInterfacedef;
import com.ruoyi.admin.service.IHhyAdminColumnsetInterfacedefService;

/**
 * hhy_admin_columnset_interfacedefService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminColumnsetInterfacedefServiceImpl implements IHhyAdminColumnsetInterfacedefService 
{
    @Autowired
    private HhyAdminColumnsetInterfacedefMapper hhyAdminColumnsetInterfacedefMapper;

    /**
     * 查询hhy_admin_columnset_interfacedef
     * 
     * @param colInId hhy_admin_columnset_interfacedefID
     * @return hhy_admin_columnset_interfacedef
     */
    @Override
    public HhyAdminColumnsetInterfacedef selectHhyAdminColumnsetInterfacedefById(Long colInId)
    {
        return hhyAdminColumnsetInterfacedefMapper.selectHhyAdminColumnsetInterfacedefById(colInId);
    }

    /**
     * 查询hhy_admin_columnset_interfacedef列表
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return hhy_admin_columnset_interfacedef
     */
    @Override
    public List<HhyAdminColumnsetInterfacedef> selectHhyAdminColumnsetInterfacedefList(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        return hhyAdminColumnsetInterfacedefMapper.selectHhyAdminColumnsetInterfacedefList(hhyAdminColumnsetInterfacedef);
    }

    /**
     * 新增hhy_admin_columnset_interfacedef
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return 结果
     */
    @Override
    public int insertHhyAdminColumnsetInterfacedef(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        hhyAdminColumnsetInterfacedef.setCreateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetInterfacedefMapper.insertHhyAdminColumnsetInterfacedef(hhyAdminColumnsetInterfacedef);
    }

    /**
     * 修改hhy_admin_columnset_interfacedef
     * 
     * @param hhyAdminColumnsetInterfacedef hhy_admin_columnset_interfacedef
     * @return 结果
     */
    @Override
    public int updateHhyAdminColumnsetInterfacedef(HhyAdminColumnsetInterfacedef hhyAdminColumnsetInterfacedef)
    {
        hhyAdminColumnsetInterfacedef.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetInterfacedefMapper.updateHhyAdminColumnsetInterfacedef(hhyAdminColumnsetInterfacedef);
    }

    /**
     * 批量删除hhy_admin_columnset_interfacedef
     * 
     * @param colInIds 需要删除的hhy_admin_columnset_interfacedefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetInterfacedefByIds(Long[] colInIds)
    {
        return hhyAdminColumnsetInterfacedefMapper.deleteHhyAdminColumnsetInterfacedefByIds(colInIds);
    }

    /**
     * 删除hhy_admin_columnset_interfacedef信息
     * 
     * @param colInId hhy_admin_columnset_interfacedefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetInterfacedefById(Long colInId)
    {
        return hhyAdminColumnsetInterfacedefMapper.deleteHhyAdminColumnsetInterfacedefById(colInId);
    }
}
