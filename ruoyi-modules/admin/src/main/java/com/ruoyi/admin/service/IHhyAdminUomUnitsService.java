package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminUomUnits;

/**
 * UomUnitsService接口
 * 
 * @author daichao
 * @date 2022-01-19
 */
public interface IHhyAdminUomUnitsService 
{
    /**
     * 查询UomUnits
     * 
     * @param uomUnitsId UomUnitsID
     * @return UomUnits
     */
    public HhyAdminUomUnits selectHhyAdminUomUnitsById(Long uomUnitsId);

    /**
     * 查询UomUnits列表
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return UomUnits集合
     */
    public List<HhyAdminUomUnits> selectHhyAdminUomUnitsList(HhyAdminUomUnits hhyAdminUomUnits);

    /**
     * 新增UomUnits
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return 结果
     */
    public int insertHhyAdminUomUnits(HhyAdminUomUnits hhyAdminUomUnits);

    /**
     * 修改UomUnits
     * 
     * @param hhyAdminUomUnits UomUnits
     * @return 结果
     */
    public int updateHhyAdminUomUnits(HhyAdminUomUnits hhyAdminUomUnits);

    /**
     * 批量删除UomUnits
     * 
     * @param uomUnitsIds 需要删除的UomUnitsID
     * @return 结果
     */
    public int deleteHhyAdminUomUnitsByIds(Long[] uomUnitsIds);

    /**
     * 删除UomUnits信息
     * 
     * @param uomUnitsId UomUnitsID
     * @return 结果
     */
    public int deleteHhyAdminUomUnitsById(Long uomUnitsId);
}
