package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminClassToinMapper;
import com.ruoyi.admin.domain.HhyAdminClassToin;
import com.ruoyi.admin.service.IHhyAdminClassToinService;

/**
 * class_inService业务层处理
 * 
 * @author daichao
 * @date 2022-03-31
 */
@Service
public class HhyAdminClassToinServiceImpl implements IHhyAdminClassToinService 
{
    @Autowired
    private HhyAdminClassToinMapper hhyAdminClassToinMapper;

    /**
     * 查询class_in
     * 
     * @param classinId class_inID
     * @return class_in
     */
    @Override
    public HhyAdminClassToin selectHhyAdminClassToinById(Long classinId)
    {
        return hhyAdminClassToinMapper.selectHhyAdminClassToinById(classinId);
    }

    /**
     * 查询class_in列表
     * 
     * @param hhyAdminClassToin class_in
     * @return class_in
     */
    @Override
    public List<HhyAdminClassToin> selectHhyAdminClassToinList(HhyAdminClassToin hhyAdminClassToin)
    {
        return hhyAdminClassToinMapper.selectHhyAdminClassToinList(hhyAdminClassToin);
    }

    /**
     * 新增class_in
     * 
     * @param hhyAdminClassToin class_in
     * @return 结果
     */
    @Override
    public int insertHhyAdminClassToin(HhyAdminClassToin hhyAdminClassToin)
    {
        hhyAdminClassToin.setCreateTime(DateUtils.getNowDate());
        return hhyAdminClassToinMapper.insertHhyAdminClassToin(hhyAdminClassToin);
    }

    /**
     * 修改class_in
     * 
     * @param hhyAdminClassToin class_in
     * @return 结果
     */
    @Override
    public int updateHhyAdminClassToin(HhyAdminClassToin hhyAdminClassToin)
    {
        hhyAdminClassToin.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminClassToinMapper.updateHhyAdminClassToin(hhyAdminClassToin);
    }

    /**
     * 批量删除class_in
     * 
     * @param classinIds 需要删除的class_inID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminClassToinByIds(Long[] classinIds)
    {
        return hhyAdminClassToinMapper.deleteHhyAdminClassToinByIds(classinIds);
    }

    /**
     * 删除class_in信息
     * 
     * @param classinId class_inID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminClassToinById(Long classinId)
    {
        return hhyAdminClassToinMapper.deleteHhyAdminClassToinById(classinId);
    }
}
