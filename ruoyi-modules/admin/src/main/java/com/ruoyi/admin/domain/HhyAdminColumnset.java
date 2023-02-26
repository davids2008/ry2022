package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_columnset对象 hhy_admin_columnset
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminColumnset extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long colId;

    /** uuid */
    @Excel(name = "uuid")
    private Long colUuid;

    /** 名字 */
    @Excel(name = "名字")
    private String colName;

    /** 描述 */
    @Excel(name = "描述")
    private String colDescription;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setColId(Long colId)
    {
        this.colId = colId;
    }

    public Long getColId()
    {
        return colId;
    }
    public void setColUuid(Long colUuid)
    {
        this.colUuid = colUuid;
    }

    public Long getColUuid()
    {
        return colUuid;
    }
    public void setColName(String colName)
    {
        this.colName = colName;
    }

    public String getColName()
    {
        return colName;
    }
    public void setColDescription(String colDescription)
    {
        this.colDescription = colDescription;
    }

    public String getColDescription()
    {
        return colDescription;
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
                .append("colId", getColId())
                .append("colUuid", getColUuid())
                .append("colName", getColName())
                .append("colDescription", getColDescription())
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
