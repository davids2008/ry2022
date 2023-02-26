package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminUomUnits;

/**
 * UomUnitsMapper接口
 * 
 * @author daichao
 * @date 2022-01-19
 */
public interface HhyAdminUomUnitsMapper 
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
     * 删除UomUnits
     * 
     * @param uomUnitsId UomUnitsID
     * @return 结果
     */
    public int deleteHhyAdminUomUnitsById(Long uomUnitsId);

    /**
     * 批量删除UomUnits
     * 
     * @param uomUnitsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminUomUnitsByIds(Long[] uomUnitsIds);
}
