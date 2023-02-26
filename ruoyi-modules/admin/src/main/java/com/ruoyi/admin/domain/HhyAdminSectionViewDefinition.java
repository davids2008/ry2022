package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_section_view_definition对象 hhy_admin_section_view_definition
 *
 * @author admin
 * @date 2022-03-31
 */
public class HhyAdminSectionViewDefinition extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long secDefId;

    /** id */
    @Excel(name = "id")
    private Long interProId;

    /** seq */
    @Excel(name = "seq")
    private Integer secRelSeq;

    /** display */
    @Excel(name = "display")
    private Integer secDefDisplay;

    /** iscomp */
    @Excel(name = "iscomp")
    private Integer secDefIscomp;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long secId;

    public void setSecDefId(Long secDefId)
    {
        this.secDefId = secDefId;
    }

    public Long getSecDefId()
    {
        return secDefId;
    }
    public void setInterProId(Long interProId)
    {
        this.interProId = interProId;
    }

    public Long getInterProId()
    {
        return interProId;
    }
    public void setSecRelSeq(Integer secRelSeq)
    {
        this.secRelSeq = secRelSeq;
    }

    public Integer getSecRelSeq()
    {
        return secRelSeq;
    }
    public void setSecDefDisplay(Integer secDefDisplay)
    {
        this.secDefDisplay = secDefDisplay;
    }

    public Integer getSecDefDisplay()
    {
        return secDefDisplay;
    }
    public void setSecDefIscomp(Integer secDefIscomp)
    {
        this.secDefIscomp = secDefIscomp;
    }

    public Integer getSecDefIscomp()
    {
        return secDefIscomp;
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
                .append("secDefId", getSecDefId())
                .append("interProId", getInterProId())
                .append("secRelSeq", getSecRelSeq())
                .append("secDefDisplay", getSecDefDisplay())
                .append("secDefIscomp", getSecDefIscomp())
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
