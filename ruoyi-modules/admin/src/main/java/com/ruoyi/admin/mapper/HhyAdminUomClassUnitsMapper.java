package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminUomClassUnits;

/**
 * UomClassUnitsMapper接口
 * 
 * @author daichao
 * @date 2022-01-19
 */
public interface HhyAdminUomClassUnitsMapper 
{
    /**
     * 查询UomClassUnits
     * 
     * @param uomClassUnitsId UomClassUnitsID
     * @return UomClassUnits
     */
    public HhyAdminUomClassUnits selectHhyAdminUomClassUnitsById(Long uomClassUnitsId);

    /**
     * 查询UomClassUnits列表
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return UomClassUnits集合
     */
    public List<HhyAdminUomClassUnits> selectHhyAdminUomClassUnitsList(HhyAdminUomClassUnits hhyAdminUomClassUnits);

    /**
     * 新增UomClassUnits
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return 结果
     */
    public int insertHhyAdminUomClassUnits(HhyAdminUomClassUnits hhyAdminUomClassUnits);

    /**
     * 修改UomClassUnits
     * 
     * @param hhyAdminUomClassUnits UomClassUnits
     * @return 结果
     */
    public int updateHhyAdminUomClassUnits(HhyAdminUomClassUnits hhyAdminUomClassUnits);

    /**
     * 删除UomClassUnits
     * 
     * @param uomClassUnitsId UomClassUnitsID
     * @return 结果
     */
    public int deleteHhyAdminUomClassUnitsById(Long uomClassUnitsId);

    /**
     * 批量删除UomClassUnits
     * 
     * @param uomClassUnitsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminUomClassUnitsByIds(Long[] uomClassUnitsIds);
}
