package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminEngineerdata;

/**
 * engineerdataMapper接口
 * 
 * @author daichao
 * @date 2022-01-20
 */
public interface HhyAdminEngineerdataMapper 
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
     * 删除engineerdata
     * 
     * @param engId engineerdataID
     * @return 结果
     */
    public int deleteHhyAdminEngineerdataById(Long engId);

    /**
     * 批量删除engineerdata
     * 
     * @param engIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminEngineerdataByIds(Long[] engIds);
}
