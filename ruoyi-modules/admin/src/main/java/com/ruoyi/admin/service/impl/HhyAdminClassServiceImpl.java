package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.core.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.admin.domain.HhyAdminClassToin;
import com.ruoyi.admin.mapper.HhyAdminClassMapper;
import com.ruoyi.admin.domain.HhyAdminClass;
import com.ruoyi.admin.service.IHhyAdminClassService;

/**
 * adminclassService业务层处理
 * 
 * @author daichao
 * @date 2022-01-20
 */
@Service
public class HhyAdminClassServiceImpl implements IHhyAdminClassService 
{
    @Autowired
    private HhyAdminClassMapper hhyAdminClassMapper;

    /**
     * 查询adminclass
     * 
     * @param classId adminclassID
     * @return adminclass
     */
    @Override
    public HhyAdminClass selectHhyAdminClassById(Long classId)
    {
        return hhyAdminClassMapper.selectHhyAdminClassById(classId);
    }

    /**
     * 查询adminclass列表
     * 
     * @param hhyAdminClass adminclass
     * @return adminclass
     */
    @Override
    public List<HhyAdminClass> selectHhyAdminClassList(HhyAdminClass hhyAdminClass)
    {
        return hhyAdminClassMapper.selectHhyAdminClassList(hhyAdminClass);
    }

    /**
     * 新增adminclass
     * 
     * @param hhyAdminClass adminclass
     * @return 结果
     */
    @Transactional
    @Override
    public int insertHhyAdminClass(HhyAdminClass hhyAdminClass)
    {
        hhyAdminClass.setCreateTime(DateUtils.getNowDate());
        int rows = hhyAdminClassMapper.insertHhyAdminClass(hhyAdminClass);
        insertHhyAdminClassToin(hhyAdminClass);
        return rows;
    }

    /**
     * 修改adminclass
     * 
     * @param hhyAdminClass adminclass
     * @return 结果
     */
    @Transactional
    @Override
    public int updateHhyAdminClass(HhyAdminClass hhyAdminClass)
    {
        hhyAdminClass.setUpdateTime(DateUtils.getNowDate());
        hhyAdminClassMapper.deleteHhyAdminClassToinByClassId(hhyAdminClass.getClassId());
        insertHhyAdminClassToin(hhyAdminClass);
        return hhyAdminClassMapper.updateHhyAdminClass(hhyAdminClass);
    }

    /**
     * 批量删除adminclass
     * 
     * @param classIds 需要删除的adminclassID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteHhyAdminClassByIds(Long[] classIds)
    {
        hhyAdminClassMapper.deleteHhyAdminClassToinByClassIds(classIds);
        return hhyAdminClassMapper.deleteHhyAdminClassByIds(classIds);
    }

    /**
     * 删除adminclass信息
     * 
     * @param classId adminclassID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminClassById(Long classId)
    {
        hhyAdminClassMapper.deleteHhyAdminClassToinByClassId(classId);
        return hhyAdminClassMapper.deleteHhyAdminClassById(classId);
    }

    /**
     * 新增class_in信息
     * 
     * @param hhyAdminClass adminclass对象
     */
    public void insertHhyAdminClassToin(HhyAdminClass hhyAdminClass)
    {
        List<HhyAdminClassToin> hhyAdminClassToinList = hhyAdminClass.getHhyAdminClassToinList();
        Long classId = hhyAdminClass.getClassId();
        if (StringUtils.isNotNull(hhyAdminClassToinList))
        {
            List<HhyAdminClassToin> list = new ArrayList<HhyAdminClassToin>();
            for (HhyAdminClassToin hhyAdminClassToin : hhyAdminClassToinList)
            {
                hhyAdminClassToin.setClassId(classId);
                list.add(hhyAdminClassToin);
            }
            if (list.size() > 0)
            {
                hhyAdminClassMapper.batchHhyAdminClassToin(list);
            }
        }
    }
}
