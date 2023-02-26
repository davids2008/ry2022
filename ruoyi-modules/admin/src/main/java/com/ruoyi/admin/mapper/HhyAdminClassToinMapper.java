package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminClassToin;

/**
 * class_inMapper接口
 * 
 * @author daichao
 * @date 2022-03-31
 */
public interface HhyAdminClassToinMapper 
{
    /**
     * 查询class_in
     * 
     * @param classinId class_inID
     * @return class_in
     */
    public HhyAdminClassToin selectHhyAdminClassToinById(Long classinId);

    /**
     * 查询class_in列表
     * 
     * @param hhyAdminClassToin class_in
     * @return class_in集合
     */
    public List<HhyAdminClassToin> selectHhyAdminClassToinList(HhyAdminClassToin hhyAdminClassToin);

    /**
     * 新增class_in
     * 
     * @param hhyAdminClassToin class_in
     * @return 结果
     */
    public int insertHhyAdminClassToin(HhyAdminClassToin hhyAdminClassToin);

    /**
     * 修改class_in
     * 
     * @param hhyAdminClassToin class_in
     * @return 结果
     */
    public int updateHhyAdminClassToin(HhyAdminClassToin hhyAdminClassToin);

    /**
     * 删除class_in
     * 
     * @param classinId class_inID
     * @return 结果
     */
    public int deleteHhyAdminClassToinById(Long classinId);

    /**
     * 批量删除class_in
     * 
     * @param classinIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminClassToinByIds(Long[] classinIds);
}
