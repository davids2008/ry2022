package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminUomClassUnitsMapper;
import com.ruoyi.admin.domain.HhyAdminUomClassUnits;
import com.ruoyi.admin.service.IHhyAdminUomClassUnitsService;

/**
 * UomClassUnitsService业务层处理
 * 
 * @author daichao
 * @date 2022-01-19
 */
@Service
public class HhyAdminUomClassUnitsServiceImpl implements IHhyAdminUomClassUnitsService 
{
    @Autowired
    private HhyAdminUomClassUnitsMapper hhyAdminUomClassUnitsMapper;

    /**
     * 查询UomClassUnits
     * 
     * @param uomClassUnitsId UomClassUnitsID
     * @return UomClassUnits
     */
    @Override
    public HhyAdminUomClassUnits selectHhyAdminUomClassUnitsById(Long uomClassUnitsId)
    {
        return hhyAdminUomClassUnitsMapper.selectHhyAdminUomClassUnitsById(uomClassUnitsId);
    }

    /**
     * 查询UomClassUnits列表
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return UomClassUnits
     */
    @Override
    public List<HhyAdminUomClassUnits> selectHhyAdminUomClassUnitsList(HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        return hhyAdminUomClassUnitsMapper.selectHhyAdminUomClassUnitsList(hhyAdminUomClassUnits);
    }

    /**
     * 新增UomClassUnits
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return 结果
     */
    @Override
    public int insertHhyAdminUomClassUnits(HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        hhyAdminUomClassUnits.setCreateTime(DateUtils.getNowDate());
        return hhyAdminUomClassUnitsMapper.insertHhyAdminUomClassUnits(hhyAdminUomClassUnits);
    }

    /**
     * 修改UomClassUnits
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return 结果
     */
    @Override
    public int updateHhyAdminUomClassUnits(HhyAdminUomClassUnits hhyAdminUomClassUnits)
    {
        hhyAdminUomClassUnits.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminUomClassUnitsMapper.updateHhyAdminUomClassUnits(hhyAdminUomClassUnits);
    }

    /**
     * 批量删除UomClassUnits
     * 
     * @param uomClassUnitsIds 需要删除的UomClassUnitsID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomClassUnitsByIds(Long[] uomClassUnitsIds)
    {
        return hhyAdminUomClassUnitsMapper.deleteHhyAdminUomClassUnitsByIds(uomClassUnitsIds);
    }

    /**
     * 删除UomClassUnits信息
     * 
     * @param uomClassUnitsId UomClassUnitsID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomClassUnitsById(Long uomClassUnitsId)
    {
        return hhyAdminUomClassUnitsMapper.deleteHhyAdminUomClassUnitsById(uomClassUnitsId);
    }
}
