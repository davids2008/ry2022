package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminEngineerdata;

/**
 * engineerdataService接口
 * 
 * @author daichao
 * @date 2022-01-20
 */
public interface IHhyAdminEngineerdataService 
{
    /**
     * 查询engineerdata
     * 
     * @param engId engineerdataID
     * @return engineerdata
     */
    public HhyAdminEngineerdata selectHhyAdminEngineerdataById(Long engId);

    /**
     * 查询engineerdata列表
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return engineerdata集合
     */
    public List<HhyAdminEngineerdata> selectHhyAdminEngineerdataList(HhyAdminEngineerdata hhyAdminEngineerdata);

    /**
     * 新增engineerdata
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return 结果
     */
    public int insertHhyAdminEngineerdata(HhyAdminEngineerdata hhyAdminEngineerdata);

    /**
     * 修改engineerdata
     * 
     * @param hhyAdminEngineerdata engineerdata
     * @return 结果
     */
    public int updateHhyAdminEngineerdata(HhyAdminEngineerdata hhyAdminEngineerdata);

    /**
     * 批量删除engineerdata
     * 
     * @param engIds 需要删除的engineerdataID
     * @return 结果
     */
    public int deleteHhyAdminEngineerdataByIds(Long[] engIds);

    /**
     * 删除engineerdata信息
     * 
     * @param engId engineerdataID
     * @return 结果
     */
    public int deleteHhyAdminEngineerdataById(Long engId);
}
