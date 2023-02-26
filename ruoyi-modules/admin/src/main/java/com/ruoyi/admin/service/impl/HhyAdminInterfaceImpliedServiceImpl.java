package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminInterfaceImpliedMapper;
import com.ruoyi.admin.domain.HhyAdminInterfaceImplied;
import com.ruoyi.admin.service.IHhyAdminInterfaceImpliedService;

/**
 * interface_impliedService业务层处理
 * 
 * @author daichao
 * @date 2022-01-21
 */
@Service
public class HhyAdminInterfaceImpliedServiceImpl implements IHhyAdminInterfaceImpliedService 
{
    @Autowired
    private HhyAdminInterfaceImpliedMapper hhyAdminInterfaceImpliedMapper;

    /**
     * 查询interface_implied
     * 
     * @param interImId interface_impliedID
     * @return interface_implied
     */
    @Override
    public HhyAdminInterfaceImplied selectHhyAdminInterfaceImpliedById(Long interImId)
    {
        return hhyAdminInterfaceImpliedMapper.selectHhyAdminInterfaceImpliedById(interImId);
    }

    /**
     * 查询interface_implied列表
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return interface_implied
     */
    @Override
    public List<HhyAdminInterfaceImplied> selectHhyAdminInterfaceImpliedList(HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        return hhyAdminInterfaceImpliedMapper.selectHhyAdminInterfaceImpliedList(hhyAdminInterfaceImplied);
    }

    /**
     * 新增interface_implied
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return 结果
     */
    @Override
    public int insertHhyAdminInterfaceImplied(HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        hhyAdminInterfaceImplied.setCreateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceImpliedMapper.insertHhyAdminInterfaceImplied(hhyAdminInterfaceImplied);
    }

    /**
     * 修改interface_implied
     * 
     * @param hhyAdminInterfaceImplied interface_implied
     * @return 结果
     */
    @Override
    public int updateHhyAdminInterfaceImplied(HhyAdminInterfaceImplied hhyAdminInterfaceImplied)
    {
        hhyAdminInterfaceImplied.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceImpliedMapper.updateHhyAdminInterfaceImplied(hhyAdminInterfaceImplied);
    }

    /**
     * 批量删除interface_implied
     * 
     * @param interImIds 需要删除的interface_impliedID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceImpliedByIds(Long[] interImIds)
    {
        return hhyAdminInterfaceImpliedMapper.deleteHhyAdminInterfaceImpliedByIds(interImIds);
    }

    /**
     * 删除interface_implied信息
     * 
     * @param interImId interface_impliedID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceImpliedById(Long interImId)
    {
        return hhyAdminInterfaceImpliedMapper.deleteHhyAdminInterfaceImpliedById(interImId);
    }
}
