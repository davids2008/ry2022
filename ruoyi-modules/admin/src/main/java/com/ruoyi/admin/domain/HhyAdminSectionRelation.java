package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_section_relation对象 hhy_admin_section_relation
 *
 * @author admin
 * @date 2022-03-31
 */
public class HhyAdminSectionRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long secRelId;

    /** 名称 */
    @Excel(name = "名称")
    private String secRelName;

    /** 描述 */
    @Excel(name = "描述")
    private String secRelDescription;

    /** default */
    @Excel(name = "default")
    private Integer secRelDefault;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long secId;

    public void setSecRelId(Long secRelId)
    {
        this.secRelId = secRelId;
    }

    public Long getSecRelId()
    {
        return secRelId;
    }
    public void setSecRelName(String secRelName)
    {
        this.secRelName = secRelName;
    }

    public String getSecRelName()
    {
        return secRelName;
    }
    public void setSecRelDescription(String secRelDescription)
    {
        this.secRelDescription = secRelDescription;
    }

    public String getSecRelDescription()
    {
        return secRelDescription;
    }
    public void setSecRelDefault(Integer secRelDefault)
    {
        this.secRelDefault = secRelDefault;
    }

    public Integer getSecRelDefault()
    {
        return secRelDefault;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setSecId(Long secId)
    {
        this.secId = secId;
    }

    public Long getSecId()
    {
        return secId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("secRelId", getSecRelId())
                .append("secRelName", getSecRelName())
                .append("secRelDescription", getSecRelDescription())
                .append("secRelDefault", getSecRelDefault())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("secId", getSecId())
                .toString();
    }
}
