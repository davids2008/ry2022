package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminDictionayMapper;
import com.ruoyi.admin.domain.HhyAdminDictionay;
import com.ruoyi.admin.service.IHhyAdminDictionayService;

/**
 * 数据字典newService业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-18
 */
@Service
public class HhyAdminDictionayServiceImpl implements IHhyAdminDictionayService 
{
    @Autowired
    private HhyAdminDictionayMapper hhyAdminDictionayMapper;

    /**
     * 查询数据字典new
     * 
     * @param dictId 数据字典newID
     * @return 数据字典new
     */
    @Override
    public HhyAdminDictionay selectHhyAdminDictionayById(Long dictId)
    {
        return hhyAdminDictionayMapper.selectHhyAdminDictionayById(dictId);
    }

    /**
     * 查询数据字典new列表
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 数据字典new
     */
    @Override
    public List<HhyAdminDictionay> selectHhyAdminDictionayList(HhyAdminDictionay hhyAdminDictionay)
    {
        return hhyAdminDictionayMapper.selectHhyAdminDictionayList(hhyAdminDictionay);
    }

    /**
     * 新增数据字典new
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 结果
     */
    @Override
    public int insertHhyAdminDictionay(HhyAdminDictionay hhyAdminDictionay)
    {
        hhyAdminDictionay.setCreateTime(DateUtils.getNowDate());
        return hhyAdminDictionayMapper.insertHhyAdminDictionay(hhyAdminDictionay);
    }

    /**
     * 修改数据字典new
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 结果
     */
    @Override
    public int updateHhyAdminDictionay(HhyAdminDictionay hhyAdminDictionay)
    {
        hhyAdminDictionay.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminDictionayMapper.updateHhyAdminDictionay(hhyAdminDictionay);
    }

    /**
     * 批量删除数据字典new
     * 
     * @param dictIds 需要删除的数据字典newID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminDictionayByIds(Long[] dictIds)
    {
        return hhyAdminDictionayMapper.deleteHhyAdminDictionayByIds(dictIds);
    }

    /**
     * 删除数据字典new信息
     * 
     * @param dictId 数据字典newID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminDictionayById(Long dictId)
    {
        return hhyAdminDictionayMapper.deleteHhyAdminDictionayById(dictId);
    }
}
