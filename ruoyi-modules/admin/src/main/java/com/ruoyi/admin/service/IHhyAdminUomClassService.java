package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminUomClass;

/**
 * UomClassService接口
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
public interface IHhyAdminUomClassService 
{
    /**
     * 查询UomClass
     * 
     * @param uomClassId UomClassID
     * @return UomClass
     */
    public HhyAdminUomClass selectHhyAdminUomClassById(Long uomClassId);

    /**
     * 查询UomClass列表
     * 
     * @param hhyAdminUomClass UomClass
     * @return UomClass集合
     */
    public List<HhyAdminUomClass> selectHhyAdminUomClassList(HhyAdminUomClass hhyAdminUomClass);

    /**
     * 新增UomClass
     * 
     * @param hhyAdminUomClass UomClass
     * @return 结果
     */
    public int insertHhyAdminUomClass(HhyAdminUomClass hhyAdminUomClass);

    /**
     * 修改UomClass
     * 
     * @param hhyAdminUomClass UomClass
     * @return 结果
     */
    public int updateHhyAdminUomClass(HhyAdminUomClass hhyAdminUomClass);

    /**
     * 批量删除UomClass
     * 
     * @param uomClassIds 需要删除的UomClassID
     * @return 结果
     */
    public int deleteHhyAdminUomClassByIds(Long[] uomClassIds);

    /**
     * 删除UomClass信息
     * 
     * @param uomClassId UomClassID
     * @return 结果
     */
    public int deleteHhyAdminUomClassById(Long uomClassId);
}
