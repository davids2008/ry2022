package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminClass;
import com.ruoyi.admin.domain.HhyAdminClassToin;

/**
 * adminclassMapper接口
 * 
 * @author daichao
 * @date 2022-01-20
 */
public interface HhyAdminClassMapper 
{
    /**
     * 查询adminclass
     * 
     * @param classId adminclassID
     * @return adminclass
     */
    public HhyAdminClass selectHhyAdminClassById(Long classId);

    /**
     * 查询adminclass列表
     * 
     * @param hhyAdminClass adminclass
     * @return adminclass集合
     */
    public List<HhyAdminClass> selectHhyAdminClassList(HhyAdminClass hhyAdminClass);

    /**
     * 新增adminclass
     * 
     * @param hhyAdminClass adminclass
     * @return 结果
     */
    public int insertHhyAdminClass(HhyAdminClass hhyAdminClass);

    /**
     * 修改adminclass
     * 
     * @param hhyAdminClass adminclass
     * @return 结果
     */
    public int updateHhyAdminClass(HhyAdminClass hhyAdminClass);

    /**
     * 删除adminclass
     * 
     * @param classId adminclassID
     * @return 结果
     */
    public int deleteHhyAdminClassById(Long classId);

    /**
     * 批量删除adminclass
     * 
     * @param classIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminClassByIds(Long[] classIds);

    /**
     * 批量删除class_in
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminClassToinByClassIds(Long[] classIds);
    
    /**
     * 批量新增class_in
     * 
     * @param hhyAdminClassToinList class_in列表
     * @return 结果
     */
    public int batchHhyAdminClassToin(List<HhyAdminClassToin> hhyAdminClassToinList);
    

    /**
     * 通过adminclassID删除class_in信息
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteHhyAdminClassToinByClassId(Long classId);
}
