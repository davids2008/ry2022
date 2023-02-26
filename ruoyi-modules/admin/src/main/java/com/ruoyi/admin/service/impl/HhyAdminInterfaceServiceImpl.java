package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminInterfaceMapper;
import com.ruoyi.admin.domain.HhyAdminInterface;
import com.ruoyi.admin.service.IHhyAdminInterfaceService;

/**
 * interfaceService业务层处理
 * 
 * @author daichao
 * @date 2022-01-21
 */
@Service
public class HhyAdminInterfaceServiceImpl implements IHhyAdminInterfaceService 
{
    @Autowired
    private HhyAdminInterfaceMapper hhyAdminInterfaceMapper;

    /**
     * 查询interface
     * 
     * @param interId interfaceID
     * @return interface
     */
    @Override
    public HhyAdminInterface selectHhyAdminInterfaceById(Long interId)
    {
        return hhyAdminInterfaceMapper.selectHhyAdminInterfaceById(interId);
    }

    /**
     * 查询interface列表
     * 
     * @param hhyAdminInterface interface
     * @return interface
     */
    @Override
    public List<HhyAdminInterface> selectHhyAdminInterfaceList(HhyAdminInterface hhyAdminInterface)
    {
        return hhyAdminInterfaceMapper.selectHhyAdminInterfaceList(hhyAdminInterface);
    }

    /**
     * 新增interface
     * 
     * @param hhyAdminInterface interface
     * @return 结果
     */
    @Override
    public int insertHhyAdminInterface(HhyAdminInterface hhyAdminInterface)
    {
        hhyAdminInterface.setCreateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceMapper.insertHhyAdminInterface(hhyAdminInterface);
    }

    /**
     * 修改interface
     * 
     * @param hhyAdminInterface interface
     * @return 结果
     */
    @Override
    public int updateHhyAdminInterface(HhyAdminInterface hhyAdminInterface)
    {
        hhyAdminInterface.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceMapper.updateHhyAdminInterface(hhyAdminInterface);
    }

    /**
     * 批量删除interface
     * 
     * @param interIds 需要删除的interfaceID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceByIds(Long[] interIds)
    {
        return hhyAdminInterfaceMapper.deleteHhyAdminInterfaceByIds(interIds);
    }

    /**
     * 删除interface信息
     * 
     * @param interId interfaceID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceById(Long interId)
    {
        return hhyAdminInterfaceMapper.deleteHhyAdminInterfaceById(interId);
    }
}
