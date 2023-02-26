package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminClass;

/**
 * adminclassService接口
 * 
 * @author daichao
 * @date 2022-01-20
 */
public interface IHhyAdminClassService 
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
     * 批量删除adminclass
     * 
     * @param classIds 需要删除的adminclassID
     * @return 结果
     */
    public int deleteHhyAdminClassByIds(Long[] classIds);

    /**
     * 删除adminclass信息
     * 
     * @param classId adminclassID
     * @return 结果
     */
    public int deleteHhyAdminClassById(Long classId);
}
