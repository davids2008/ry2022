package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminInterfaceRelationdefMapper;
import com.ruoyi.admin.domain.HhyAdminInterfaceRelationdef;
import com.ruoyi.admin.service.IHhyAdminInterfaceRelationdefService;

/**
 * interface_relationdefService业务层处理
 * 
 * @author daichao
 * @date 2022-01-21
 */
@Service
public class HhyAdminInterfaceRelationdefServiceImpl implements IHhyAdminInterfaceRelationdefService 
{
    @Autowired
    private HhyAdminInterfaceRelationdefMapper hhyAdminInterfaceRelationdefMapper;

    /**
     * 查询interface_relationdef
     * 
     * @param interRelId interface_relationdefID
     * @return interface_relationdef
     */
    @Override
    public HhyAdminInterfaceRelationdef selectHhyAdminInterfaceRelationdefById(Long interRelId)
    {
        return hhyAdminInterfaceRelationdefMapper.selectHhyAdminInterfaceRelationdefById(interRelId);
    }

    /**
     * 查询interface_relationdef列表
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return interface_relationdef
     */
    @Override
    public List<HhyAdminInterfaceRelationdef> selectHhyAdminInterfaceRelationdefList(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        return hhyAdminInterfaceRelationdefMapper.selectHhyAdminInterfaceRelationdefList(hhyAdminInterfaceRelationdef);
    }

    /**
     * 新增interface_relationdef
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return 结果
     */
    @Override
    public int insertHhyAdminInterfaceRelationdef(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        hhyAdminInterfaceRelationdef.setCreateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceRelationdefMapper.insertHhyAdminInterfaceRelationdef(hhyAdminInterfaceRelationdef);
    }

    /**
     * 修改interface_relationdef
     * 
     * @param hhyAdminInterfaceRelationdef interface_relationdef
     * @return 结果
     */
    @Override
    public int updateHhyAdminInterfaceRelationdef(HhyAdminInterfaceRelationdef hhyAdminInterfaceRelationdef)
    {
        hhyAdminInterfaceRelationdef.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminInterfaceRelationdefMapper.updateHhyAdminInterfaceRelationdef(hhyAdminInterfaceRelationdef);
    }

    /**
     * 批量删除interface_relationdef
     * 
     * @param interRelIds 需要删除的interface_relationdefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceRelationdefByIds(Long[] interRelIds)
    {
        return hhyAdminInterfaceRelationdefMapper.deleteHhyAdminInterfaceRelationdefByIds(interRelIds);
    }

    /**
     * 删除interface_relationdef信息
     * 
     * @param interRelId interface_relationdefID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminInterfaceRelationdefById(Long interRelId)
    {
        return hhyAdminInterfaceRelationdefMapper.deleteHhyAdminInterfaceRelationdefById(interRelId);
    }
}
