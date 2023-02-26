package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminSubprojectMapper;
import com.ruoyi.admin.domain.HhyAdminSubproject;
import com.ruoyi.admin.service.IHhyAdminSubprojectService;

/**
 * hhy_admin_subprojectService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminSubprojectServiceImpl implements IHhyAdminSubprojectService 
{
    @Autowired
    private HhyAdminSubprojectMapper hhyAdminSubprojectMapper;

    /**
     * 查询hhy_admin_subproject
     * 
     * @param projSubid hhy_admin_subprojectID
     * @return hhy_admin_subproject
     */
    @Override
    public HhyAdminSubproject selectHhyAdminSubprojectById(Long projSubid)
    {
        return hhyAdminSubprojectMapper.selectHhyAdminSubprojectById(projSubid);
    }

    /**
     * 查询hhy_admin_subproject列表
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return hhy_admin_subproject
     */
    @Override
    public List<HhyAdminSubproject> selectHhyAdminSubprojectList(HhyAdminSubproject hhyAdminSubproject)
    {
        return hhyAdminSubprojectMapper.selectHhyAdminSubprojectList(hhyAdminSubproject);
    }

    /**
     * 新增hhy_admin_subproject
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return 结果
     */
    @Override
    public int insertHhyAdminSubproject(HhyAdminSubproject hhyAdminSubproject)
    {
        hhyAdminSubproject.setCreateTime(DateUtils.getNowDate());
        return hhyAdminSubprojectMapper.insertHhyAdminSubproject(hhyAdminSubproject);
    }

    /**
     * 修改hhy_admin_subproject
     * 
     * @param hhyAdminSubproject hhy_admin_subproject
     * @return 结果
     */
    @Override
    public int updateHhyAdminSubproject(HhyAdminSubproject hhyAdminSubproject)
    {
        hhyAdminSubproject.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminSubprojectMapper.updateHhyAdminSubproject(hhyAdminSubproject);
    }

    /**
     * 批量删除hhy_admin_subproject
     * 
     * @param projSubids 需要删除的hhy_admin_subprojectID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSubprojectByIds(Long[] projSubids)
    {
        return hhyAdminSubprojectMapper.deleteHhyAdminSubprojectByIds(projSubids);
    }

    /**
     * 删除hhy_admin_subproject信息
     * 
     * @param projSubid hhy_admin_subprojectID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminSubprojectById(Long projSubid)
    {
        return hhyAdminSubprojectMapper.deleteHhyAdminSubprojectById(projSubid);
    }
}
