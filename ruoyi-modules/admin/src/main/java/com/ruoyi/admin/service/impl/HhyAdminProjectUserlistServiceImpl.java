package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminProjectUserlistMapper;
import com.ruoyi.admin.domain.HhyAdminProjectUserlist;
import com.ruoyi.admin.service.IHhyAdminProjectUserlistService;

/**
 * hhy_admin_project_userlistService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminProjectUserlistServiceImpl implements IHhyAdminProjectUserlistService 
{
    @Autowired
    private HhyAdminProjectUserlistMapper hhyAdminProjectUserlistMapper;

    /**
     * 查询hhy_admin_project_userlist
     * 
     * @param projUId hhy_admin_project_userlistID
     * @return hhy_admin_project_userlist
     */
    @Override
    public HhyAdminProjectUserlist selectHhyAdminProjectUserlistById(Long projUId)
    {
        return hhyAdminProjectUserlistMapper.selectHhyAdminProjectUserlistById(projUId);
    }

    /**
     * 查询hhy_admin_project_userlist列表
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return hhy_admin_project_userlist
     */
    @Override
    public List<HhyAdminProjectUserlist> selectHhyAdminProjectUserlistList(HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        return hhyAdminProjectUserlistMapper.selectHhyAdminProjectUserlistList(hhyAdminProjectUserlist);
    }

    /**
     * 新增hhy_admin_project_userlist
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return 结果
     */
    @Override
    public int insertHhyAdminProjectUserlist(HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        hhyAdminProjectUserlist.setCreateTime(DateUtils.getNowDate());
        return hhyAdminProjectUserlistMapper.insertHhyAdminProjectUserlist(hhyAdminProjectUserlist);
    }

    /**
     * 修改hhy_admin_project_userlist
     * 
     * @param hhyAdminProjectUserlist hhy_admin_project_userlist
     * @return 结果
     */
    @Override
    public int updateHhyAdminProjectUserlist(HhyAdminProjectUserlist hhyAdminProjectUserlist)
    {
        hhyAdminProjectUserlist.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminProjectUserlistMapper.updateHhyAdminProjectUserlist(hhyAdminProjectUserlist);
    }

    /**
     * 批量删除hhy_admin_project_userlist
     * 
     * @param projUIds 需要删除的hhy_admin_project_userlistID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminProjectUserlistByIds(Long[] projUIds)
    {
        return hhyAdminProjectUserlistMapper.deleteHhyAdminProjectUserlistByIds(projUIds);
    }

    /**
     * 删除hhy_admin_project_userlist信息
     * 
     * @param projUId hhy_admin_project_userlistID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminProjectUserlistById(Long projUId)
    {
        return hhyAdminProjectUserlistMapper.deleteHhyAdminProjectUserlistById(projUId);
    }
}
