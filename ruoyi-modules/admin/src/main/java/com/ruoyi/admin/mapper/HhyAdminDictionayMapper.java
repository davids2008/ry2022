package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminDictionay;

/**
 * 数据字典newMapper接口
 * 
 * @author ruoyi
 * @date 2022-01-18
 */
public interface HhyAdminDictionayMapper 
{
    /**
     * 查询数据字典new
     * 
     * @param dictId 数据字典newID
     * @return 数据字典new
     */
    public HhyAdminDictionay selectHhyAdminDictionayById(Long dictId);

    /**
     * 查询数据字典new列表
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 数据字典new集合
     */
    public List<HhyAdminDictionay> selectHhyAdminDictionayList(HhyAdminDictionay hhyAdminDictionay);

    /**
     * 新增数据字典new
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 结果
     */
    public int insertHhyAdminDictionay(HhyAdminDictionay hhyAdminDictionay);

    /**
     * 修改数据字典new
     * 
     * @param hhyAdminDictionay 数据字典new
     * @return 结果
     */
    public int updateHhyAdminDictionay(HhyAdminDictionay hhyAdminDictionay);

    /**
     * 删除数据字典new
     * 
     * @param dictId 数据字典newID
     * @return 结果
     */
    public int deleteHhyAdminDictionayById(Long dictId);

    /**
     * 批量删除数据字典new
     * 
     * @param dictIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminDictionayByIds(Long[] dictIds);
}
