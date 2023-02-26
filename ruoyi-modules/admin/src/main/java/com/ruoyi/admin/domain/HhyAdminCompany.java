package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_company对象 hhy_admin_company
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long cpId;

    /** 名称 */
    @Excel(name = "名称")
    private String cpName;

    /** 描述 */
    @Excel(name = "描述")
    private String cpDescription;

    /** 用户列表 */
    @Excel(name = "用户列表")
    private String cpUserList;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setCpId(Long cpId)
    {
        this.cpId = cpId;
    }

    public Long getCpId()
    {
        return cpId;
    }
    public void setCpName(String cpName)
    {
        this.cpName = cpName;
    }

    public String getCpName()
    {
        return cpName;
    }
    public void setCpDescription(String cpDescription)
    {
        this.cpDescription = cpDescription;
    }

    public String getCpDescription()
    {
        return cpDescription;
    }
    public void setCpUserList(String cpUserList)
    {
        this.cpUserList = cpUserList;
    }

    public String getCpUserList()
    {
        return cpUserList;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("cpId", getCpId())
                .append("cpName", getCpName())
                .append("cpDescription", getCpDescription())
                .append("cpUserList", getCpUserList())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
