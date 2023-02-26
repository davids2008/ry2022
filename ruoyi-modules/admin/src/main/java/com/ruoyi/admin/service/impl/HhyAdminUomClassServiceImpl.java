package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminUomClassMapper;
import com.ruoyi.admin.domain.HhyAdminUomClass;
import com.ruoyi.admin.service.IHhyAdminUomClassService;

/**
 * UomClassService业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-19
 */
@Service
public class HhyAdminUomClassServiceImpl implements IHhyAdminUomClassService 
{
    @Autowired
    private HhyAdminUomClassMapper hhyAdminUomClassMapper;

    /**
     * 查询UomClass
     * 
     * @param uomClassId UomClassID
     * @return UomClass
     */
    @Override
    public HhyAdminUomClass selectHhyAdminUomClassById(Long uomClassId)
    {
        return hhyAdminUomClassMapper.selectHhyAdminUomClassById(uomClassId);
    }

    /**
     * 查询UomClass列表
     * 
     * @param hhyAdminUomClass UomClass
     * @return UomClass
     */
    @Override
    public List<HhyAdminUomClass> selectHhyAdminUomClassList(HhyAdminUomClass hhyAdminUomClass)
    {
        return hhyAdminUomClassMapper.selectHhyAdminUomClassList(hhyAdminUomClass);
    }

    /**
     * 新增UomClass
     * 
     * @param hhyAdminUomClass UomClass
     * @return 结果
     */
    @Override
    public int insertHhyAdminUomClass(HhyAdminUomClass hhyAdminUomClass)
    {
        hhyAdminUomClass.setCreateTime(DateUtils.getNowDate());
        return hhyAdminUomClassMapper.insertHhyAdminUomClass(hhyAdminUomClass);
    }

    /**
     * 修改UomClass
     * 
     * @param hhyAdminUomClass UomClass
     * @return 结果
     */
    @Override
    public int updateHhyAdminUomClass(HhyAdminUomClass hhyAdminUomClass)
    {
        hhyAdminUomClass.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminUomClassMapper.updateHhyAdminUomClass(hhyAdminUomClass);
    }

    /**
     * 批量删除UomClass
     * 
     * @param uomClassIds 需要删除的UomClassID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomClassByIds(Long[] uomClassIds)
    {
        return hhyAdminUomClassMapper.deleteHhyAdminUomClassByIds(uomClassIds);
    }

    /**
     * 删除UomClass信息
     * 
     * @param uomClassId UomClassID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminUomClassById(Long uomClassId)
    {
        return hhyAdminUomClassMapper.deleteHhyAdminUomClassById(uomClassId);
    }
}
