package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminUomUnitsMapper;
import com.ruoyi.admin.domain.HhyAdminUomUnits;
import com.ruoyi.admin.service.IHhyAdminUomUnitsService;

/**
 * UomUnitsService业务层处理
 * 
 * @author daichao
 * @date 2022-01-19
 */
@Service
public class HhyAdminUomUnitsServiceImpl implements IHhyAdminUomUnitsService 
{
    @Autowired
    private HhyAdminUomUnitsMapper hhyAdminUomUnitsMapper;

    /**
     * 查询UomUnits
     * 
     * @param uomUnitsId UomUnitsID
     * @return UomUnits
     */
    @Override
    public HhyAdminUomUnits selectHhyAdminUomUnitsById(Long uomUnitsId)
    {
        return hhyAdminUomUnitsMapper.selectHhyAdminUomUnitsById(uomUnitsId);
    }

    /**
     * 查询UomUnits列表
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return UomUnits
     */
    @Override
    public List<HhyAdminUomUnits> selectHhyAdminUomUnitsList(HhyAdminUomUnits hhyAdminUomUnits)
    {
        return hhyAdminUomUnitsMapper.selectHhyAdminUomUnitsList(hhyAdminUomUnits);
    }

    /**
     * 新增UomUnits
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return 结果
     */
    @Override
    public int insertHhyAdminUomUnits(HhyAdminUomUnits hhyAdminUomUnits)
    {
        hhyAdminUomUnits.setCreateTime(DateUtils.getNowDate());
        return hhyAdminUomUnitsMapper.insertHhyAdminUomUnits(hhyAdminUomUnits);
    }

    /**
     * 修改UomUnits
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return 结果
     */
    @Override
    public int updateHhyAdminUomUnits(HhyAdminUomUnits hhyAdminUomUnits)
    {
        hhyAdminUomUnits.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminUomUnitsMapper.updateHhyAdminUomUnits(hhyAdminUomUnits);
    }

    /**
     * 批量删除UomUnits
     * 
     * @param uomUnitsIds 需要删除的UomUnitsID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomUnitsByIds(Long[] uomUnitsIds)
    {
        return hhyAdminUomUnitsMapper.deleteHhyAdminUomUnitsByIds(uomUnitsIds);
    }

    /**
     * 删除UomUnits信息
     * 
     * @param uomUnitsId UomUnitsID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomUnitsById(Long uomUnitsId)
    {
        return hhyAdminUomUnitsMapper.deleteHhyAdminUomUnitsById(uomUnitsId);
    }
}
