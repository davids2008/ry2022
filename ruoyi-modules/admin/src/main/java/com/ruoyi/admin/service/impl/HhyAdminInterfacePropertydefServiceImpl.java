package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminInterfacePropertydefMapper;
import com.ruoyi.admin.domain.HhyAdminInterfacePropertydef;
import com.ruoyi.admin.service.IHhyAdminInterfacePropertydefService;

/**
 * interface_propertydefService业务层处理
 * 
 * @author daichao
 * @date 2022-01-21
 */
@Service
public class HhyAdminInterfacePropertydefServiceImpl implements IHhyAdminInterfacePropertydefService 
{
    @Autowired
    private HhyAdminInterfacePropertydefMapper hhyAdminInterfacePropertydefMapper;

    /**
     * 查询interface_propertydef
     * 
     * @param interProId interface_propertydefID
     * @return interface_propertydef
     */
    @Override
    public HhyAdminInterfacePropertydef selectHhyAdminInterfacePropertydefById(Long interProId)
    {
        return hhyAdminInterfacePropertydefMapper.selectHhyAdminInterfacePropertydefById(interProId);
    }

    /**
     * 查询interface_propertydef列表
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return interface_propertydef
     */
    @Override
    public List<HhyAdminInterfacePropertydef> selectHhyAdminInterfacePropertydefList(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        return hhyAdminInterfacePropertydefMapper.selectHhyAdminInterfacePropertydefList(hhyAdminInterfacePropertydef);
    }

    /**
     * 新增interface_propertydef
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return 结果
     */
    @Override
    public int insertHhyAdminInterfacePropertydef(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        hhyAdminInterfacePropertydef.setCreateTime(DateUtils.getNowDate());
        return hhyAdminInterfacePropertydefMapper.insertHhyAdminInterfacePropertydef(hhyAdminInterfacePropertydef);
    }

    /**
     * 修改interface_propertydef
     * 
     * @param hhyAdminInterfacePropertydef interface_propertydef
     * @return 结果
     */
    @Override
    public int updateHhyAdminInterfacePropertydef(HhyAdminInterfacePropertydef hhyAdminInterfacePropertydef)
    {
        hhyAdminInterfacePropertydef.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminInterfacePropertydefMapper.updateHhyAdminInterfacePropertydef(hhyAdminInterfacePropertydef);
    }

    /**
     * 批量删除interface_propertydef
     * 
     * @param interProIds 需要删除的interface_propertydefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfacePropertydefByIds(Long[] interProIds)
    {
        return hhyAdminInterfacePropertydefMapper.deleteHhyAdminInterfacePropertydefByIds(interProIds);
    }

    /**
     * 删除interface_propertydef信息
     * 
     * @param interProId interface_propertydefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfacePropertydefById(Long interProId)
    {
        return hhyAdminInterfacePropertydefMapper.deleteHhyAdminInterfacePropertydefById(interProId);
    }
}
