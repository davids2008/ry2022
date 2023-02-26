package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_columnset_interfacedef对象 hhy_admin_columnset_interfacedef
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminColumnsetInterfacedef extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long colInId;

    /** iD */
    @Excel(name = "iD")
    private Long colId;

    /** uuid */
    @Excel(name = "uuid")
    private String colUuid;

    /** in_uuid */
    @Excel(name = "in_uuid")
    private String colInUuid;

    /** seq */
    @Excel(name = "seq")
    private Long colInSeq;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setColInId(Long colInId)
    {
        this.colInId = colInId;
    }

    public Long getColInId()
    {
        return colInId;
    }
    public void setColId(Long colId)
    {
        this.colId = colId;
    }

    public Long getColId()
    {
        return colId;
    }
    public void setColUuid(String colUuid)
    {
        this.colUuid = colUuid;
    }

    public String getColUuid()
    {
        return colUuid;
    }
    public void setColInUuid(String colInUuid)
    {
        this.colInUuid = colInUuid;
    }

    public String getColInUuid()
    {
        return colInUuid;
    }
    public void setColInSeq(Long colInSeq)
    {
        this.colInSeq = colInSeq;
    }

    public Long getColInSeq()
    {
        return colInSeq;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setProjId(Long projId)
    {
        this.projId = projId;
    }

    public Long getProjId()
    {
        return projId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("colInId", getColInId())
                .append("colId", getColId())
                .append("colUuid", getColUuid())
                .append("colInUuid", getColInUuid())
                .append("colInSeq", getColInSeq())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("projId", getProjId())
                .toString();
    }
}
