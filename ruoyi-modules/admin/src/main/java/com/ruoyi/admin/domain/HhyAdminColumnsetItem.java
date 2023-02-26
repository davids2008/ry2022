package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_columnset_item对象 hhy_admin_columnset_item
 *
 * @author admin
 * @date 2022-03-31
 */
public class HhyAdminColumnsetItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long colItemId;

    /** iD */
    @Excel(name = "iD")
    private Long colId;

    /** uuid */
    @Excel(name = "uuid")
    private String colUuid;

    /** in_pro_iD */
    @Excel(name = "in_pro_iD")
    private Long interProId;

    /** in_pro_iD */
    @Excel(name = "in_pro_iD")
    private Long interRelId;

    /** interface */
    @Excel(name = "interface")
    private String colItemInterface;

    /** uid */
    @Excel(name = "uid")
    private String colItemUid;

    /** name */
    @Excel(name = "name")
    private String colItemName;

    /** 描述 */
    @Excel(name = "描述")
    private String colDescription;

    /** type */
    @Excel(name = "type")
    private String colProType;

    /** relation_id */
    @Excel(name = "relation_id")
    private Long colRelationId;

    /** relation_uid */
    @Excel(name = "relation_uid")
    private Long colRelationUid;

    /** seq */
    @Excel(name = "seq")
    private Integer colItemSeq;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setColItemId(Long colItemId)
    {
        this.colItemId = colItemId;
    }

    public Long getColItemId()
    {
        return colItemId;
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
    public void setInterProId(Long interProId)
    {
        this.interProId = interProId;
    }

    public Long getInterProId()
    {
        return interProId;
    }
    public void setInterRelId(Long interRelId)
    {
        this.interRelId = interRelId;
    }

    public Long getInterRelId()
    {
        return interRelId;
    }
    public void setColItemInterface(String colItemInterface)
    {
        this.colItemInterface = colItemInterface;
    }

    public String getColItemInterface()
    {
        return colItemInterface;
    }
    public void setColItemUid(String colItemUid)
    {
        this.colItemUid = colItemUid;
    }

    public String getColItemUid()
    {
        return colItemUid;
    }
    public void setColItemName(String colItemName)
    {
        this.colItemName = colItemName;
    }

    public String getColItemName()
    {
        return colItemName;
    }
    public void setColDescription(String colDescription)
    {
        this.colDescription = colDescription;
    }

    public String getColDescription()
    {
        return colDescription;
    }
    public void setColProType(String colProType)
    {
        this.colProType = colProType;
    }

    public String getColProType()
    {
        return colProType;
    }
    public void setColRelationId(Long colRelationId)
    {
        this.colRelationId = colRelationId;
    }

    public Long getColRelationId()
    {
        return colRelationId;
    }
    public void setColRelationUid(Long colRelationUid)
    {
        this.colRelationUid = colRelationUid;
    }

    public Long getColRelationUid()
    {
        return colRelationUid;
    }
    public void setColItemSeq(Integer colItemSeq)
    {
        this.colItemSeq = colItemSeq;
    }

    public Integer getColItemSeq()
    {
        return colItemSeq;
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
                .append("colItemId", getColItemId())
                .append("colId", getColId())
                .append("colUuid", getColUuid())
                .append("interProId", getInterProId())
                .append("interRelId", getInterRelId())
                .append("colItemInterface", getColItemInterface())
                .append("colItemUid", getColItemUid())
                .append("colItemName", getColItemName())
                .append("colDescription", getColDescription())
                .append("colProType", getColProType())
                .append("colRelationId", getColRelationId())
                .append("colRelationUid", getColRelationUid())
                .append("colItemSeq", getColItemSeq())
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
