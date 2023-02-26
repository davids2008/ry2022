package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminCompanyMapper;
import com.ruoyi.admin.domain.HhyAdminCompany;
import com.ruoyi.admin.service.IHhyAdminCompanyService;

/**
 * hhy_admin_companyService业务层处理
 * 
 * @author daichao
 * @date 2022-01-24
 */
@Service
public class HhyAdminCompanyServiceImpl implements IHhyAdminCompanyService 
{
    @Autowired
    private HhyAdminCompanyMapper hhyAdminCompanyMapper;

    /**
     * 查询hhy_admin_company
     * 
     * @param cpId hhy_admin_companyID
     * @return hhy_admin_company
     */
    @Override
    public HhyAdminCompany selectHhyAdminCompanyById(Long cpId)
    {
        return hhyAdminCompanyMapper.selectHhyAdminCompanyById(cpId);
    }

    /**
     * 查询hhy_admin_company列表
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return hhy_admin_company
     */
    @Override
    public List<HhyAdminCompany> selectHhyAdminCompanyList(HhyAdminCompany hhyAdminCompany)
    {
        return hhyAdminCompanyMapper.selectHhyAdminCompanyList(hhyAdminCompany);
    }

    /**
     * 新增hhy_admin_company
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return 结果
     */
    @Override
    public int insertHhyAdminCompany(HhyAdminCompany hhyAdminCompany)
    {
        hhyAdminCompany.setCreateTime(DateUtils.getNowDate());
        return hhyAdminCompanyMapper.insertHhyAdminCompany(hhyAdminCompany);
    }

    /**
     * 修改hhy_admin_company
     * 
     * @param hhyAdminCompany hhy_admin_company
     * @return 结果
     */
    @Override
    public int updateHhyAdminCompany(HhyAdminCompany hhyAdminCompany)
    {
        hhyAdminCompany.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminCompanyMapper.updateHhyAdminCompany(hhyAdminCompany);
    }

    /**
     * 批量删除hhy_admin_company
     * 
     * @param cpIds 需要删除的hhy_admin_companyID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminCompanyByIds(Long[] cpIds)
    {
        return hhyAdminCompanyMapper.deleteHhyAdminCompanyByIds(cpIds);
    }

    /**
     * 删除hhy_admin_company信息
     * 
     * @param cpId hhy_admin_companyID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminCompanyById(Long cpId)
    {
        return hhyAdminCompanyMapper.deleteHhyAdminCompanyById(cpId);
    }
}
