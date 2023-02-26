package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysUserProj;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户与角色关联表 数据层
 * 
 * @author ruoyi
 */
public interface SysUserUserProjMapper
{
    /**
     * 通过用户ID删除用户和项目关联
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public int deleteUserProjByUserId(Long userId);

    /**
     * 批量删除用户和角色关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserProj(Long[] ids);


    /**
     * 批量新增用户项目信息
     * 
     * @param userProjList 用户角色列表
     * @return 结果
     */
    public int batchUserProj(List<SysUserProj> userProjList);

    /**
     * 删除用户和角色关联信息
     *
     * @param userProjList 用户和角色关联信息
     * @return 结果
     */
    public int deleteUserProjnfo(SysUserProj userProjList);

    /**
     * 批量取消授权用户角色
     *
     * @param ProjId  项目ID
     * @param userIds 需要删除的用户数据ID
     * @return 结果
     */
    public int deleteUserProjInfos(@Param("ProjId") Long ProjId, @Param("userIds") Long[] userIds);
}
