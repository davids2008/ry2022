package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_section_view_related对象 hhy_admin_section_view_related
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminSectionViewRelated extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long secRelId;

    /** id */
    @Excel(name = "id")
    private Long secRelIdOt;

    /** seq */
    @Excel(name = "seq")
    private Integer secRelSeq;

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
    public void setSecRelIdOt(Long secRelIdOt)
    {
        this.secRelIdOt = secRelIdOt;
    }

    public Long getSecRelIdOt()
    {
        return secRelIdOt;
    }
    public void setSecRelSeq(Integer secRelSeq)
    {
        this.secRelSeq = secRelSeq;
    }

    public Integer getSecRelSeq()
    {
        return secRelSeq;
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
                .append("secRelIdOt", getSecRelIdOt())
                .append("secRelSeq", getSecRelSeq())
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
