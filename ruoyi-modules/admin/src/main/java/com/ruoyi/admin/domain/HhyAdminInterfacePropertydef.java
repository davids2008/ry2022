package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * interface_propertydef对象 hhy_admin_interface_propertydef
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminInterfacePropertydef extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long interProId;

    /** in_iD */
    @Excel(name = "in_iD")
    private Long interId;

    /** dict_id */
    @Excel(name = "dict_id")
    private Long dictId;

    /** uom_id */
    @Excel(name = "uom_id")
    private Long uomId;

    /** uom_uid */
    @Excel(name = "uom_uid")
    private Long uomUid;

    /** uid */
    @Excel(name = "uid")
    private String dictUid;

    /** 名称 */
    @Excel(name = "名称")
    private String dictName;

    /** 描述 */
    @Excel(name = "描述")
    private String dictDescription;

    /** displayas */
    @Excel(name = "displayas")
    private String interProDisplayas;

    /** type */
    @Excel(name = "type")
    private String interProType;

    /** seq */
    @Excel(name = "seq")
    private Long interSeq;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setInterProId(Long interProId)
    {
        this.interProId = interProId;
    }

    public Long getInterProId()
    {
        return interProId;
    }
    public void setInterId(Long interId)
    {
        this.interId = interId;
    }

    public Long getInterId()
    {
        return interId;
    }
    public void setDictId(Long dictId)
    {
        this.dictId = dictId;
    }

    public Long getDictId()
    {
        return dictId;
    }
    public void setUomId(Long uomId)
    {
        this.uomId = uomId;
    }

    public Long getUomId()
    {
        return uomId;
    }
    public void setUomUid(Long uomUid)
    {
        this.uomUid = uomUid;
    }

    public Long getUomUid()
    {
        return uomUid;
    }
    public void setDictUid(String dictUid)
    {
        this.dictUid = dictUid;
    }

    public String getDictUid()
    {
        return dictUid;
    }
    public void setDictName(String dictName)
    {
        this.dictName = dictName;
    }

    public String getDictName()
    {
        return dictName;
    }
    public void setDictDescription(String dictDescription)
    {
        this.dictDescription = dictDescription;
    }

    public String getDictDescription()
    {
        return dictDescription;
    }
    public void setInterProDisplayas(String interProDisplayas)
    {
        this.interProDisplayas = interProDisplayas;
    }

    public String getInterProDisplayas()
    {
        return interProDisplayas;
    }
    public void setInterProType(String interProType)
    {
        this.interProType = interProType;
    }

    public String getInterProType()
    {
        return interProType;
    }
    public void setInterSeq(Long interSeq)
    {
        this.interSeq = interSeq;
    }

    public Long getInterSeq()
    {
        return interSeq;
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
                .append("interProId", getInterProId())
                .append("interId", getInterId())
                .append("dictId", getDictId())
                .append("uomId", getUomId())
                .append("uomUid", getUomUid())
                .append("dictUid", getDictUid())
                .append("dictName", getDictName())
                .append("dictDescription", getDictDescription())
                .append("interProDisplayas", getInterProDisplayas())
                .append("interProType", getInterProType())
                .append("interSeq", getInterSeq())
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
