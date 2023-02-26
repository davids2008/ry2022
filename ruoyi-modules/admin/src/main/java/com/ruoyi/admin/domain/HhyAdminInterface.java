package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * interface对象 hhy_admin_interface
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminInterface extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long interId;

    /** uid */
    @Excel(name = "uid")
    private Long interUid;

    /** 名称 */
    @Excel(name = "名称")
    private String interName;

    /** 描述 */
    @Excel(name = "描述")
    private String interDescription;

    /** displayas */
    @Excel(name = "displayas")
    private Long interDisplayAs;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setInterId(Long interId)
    {
        this.interId = interId;
    }

    public Long getInterId()
    {
        return interId;
    }
    public void setInterUid(Long interUid)
    {
        this.interUid = interUid;
    }

    public Long getInterUid()
    {
        return interUid;
    }
    public void setInterName(String interName)
    {
        this.interName = interName;
    }

    public String getInterName()
    {
        return interName;
    }
    public void setInterDescription(String interDescription)
    {
        this.interDescription = interDescription;
    }

    public String getInterDescription()
    {
        return interDescription;
    }
    public void setInterDisplayAs(Long interDisplayAs)
    {
        this.interDisplayAs = interDisplayAs;
    }

    public Long getInterDisplayAs()
    {
        return interDisplayAs;
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
                .append("interId", getInterId())
                .append("interUid", getInterUid())
                .append("interName", getInterName())
                .append("interDescription", getInterDescription())
                .append("interDisplayAs", getInterDisplayAs())
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
