package com.ruoyi.admin.service;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminCompany;

/**
 * hhy_admin_companyService接口
 * 
 * @author daichao
 * @date 2022-01-24
 */
public interface IHhyAdminCompanyService 
{
    /**
     * 查询hhy_admin_company
     * 
     * @param cpId hhy_admin_companyID
     * @return hhy_admin_company
     */
    public HhyAdminCompany selectHhyAdminCompanyById(Long cpId);

    /**
     * 查询hhy_admin_company列表
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return hhy_admin_company集合
     */
    public List<HhyAdminCompany> selectHhyAdminCompanyList(HhyAdminCompany hhyAdminCompany);

    /**
     * 新增hhy_admin_company
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return 结果
     */
    public int insertHhyAdminCompany(HhyAdminCompany hhyAdminCompany);

    /**
     * 修改hhy_admin_company
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return 结果
     */
    public int updateHhyAdminCompany(HhyAdminCompany hhyAdminCompany);

    /**
     * 批量删除hhy_admin_company
     * 
     * @param cpIds 需要删除的hhy_admin_companyID
     * @return 结果
     */
    public int deleteHhyAdminCompanyByIds(Long[] cpIds);

    /**
     * 删除hhy_admin_company信息
     * 
     * @param cpId hhy_admin_companyID
     * @return 结果
     */
    public int deleteHhyAdminCompanyById(Long cpId);
}
