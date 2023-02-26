package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminEngineerdataMapper;
import com.ruoyi.admin.domain.HhyAdminEngineerdata;
import com.ruoyi.admin.service.IHhyAdminEngineerdataService;

/**
 * engineerdataService业务层处理
 * 
 * @author daichao
 * @date 2022-01-20
 */
@Service
public class HhyAdminEngineerdataServiceImpl implements IHhyAdminEngineerdataService 
{
    @Autowired
    private HhyAdminEngineerdataMapper hhyAdminEngineerdataMapper;

    /**
     * 查询engineerdata
     * 
     * @param engId engineerdataID
     * @return engineerdata
     */
    @Override
    public HhyAdminEngineerdata selectHhyAdminEngineerdataById(Long engId)
    {
        return hhyAdminEngineerdataMapper.selectHhyAdminEngineerdataById(engId);
    }

    /**
     * 查询engineerdata列表
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return engineerdata
     */
    @Override
    public List<HhyAdminEngineerdata> selectHhyAdminEngineerdataList(HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        return hhyAdminEngineerdataMapper.selectHhyAdminEngineerdataList(hhyAdminEngineerdata);
    }

    /**
     * 新增engineerdata
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return 结果
     */
    @Override
    public int insertHhyAdminEngineerdata(HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        hhyAdminEngineerdata.setCreateTime(DateUtils.getNowDate());
        return hhyAdminEngineerdataMapper.insertHhyAdminEngineerdata(hhyAdminEngineerdata);
    }

    /**
     * 修改engineerdata
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return 结果
     */
    @Override
    public int updateHhyAdminEngineerdata(HhyAdminEngineerdata hhyAdminEngineerdata)
    {
        hhyAdminEngineerdata.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminEngineerdataMapper.updateHhyAdminEngineerdata(hhyAdminEngineerdata);
    }

    /**
     * 批量删除engineerdata
     * 
     * @param engIds 需要删除的engineerdataID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminEngineerdataByIds(Long[] engIds)
    {
        return hhyAdminEngineerdataMapper.deleteHhyAdminEngineerdataByIds(engIds);
    }

    /**
     * 删除engineerdata信息
     * 
     * @param engId engineerdataID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminEngineerdataById(Long engId)
    {
        return hhyAdminEngineerdataMapper.deleteHhyAdminEngineerdataById(engId);
    }
}
