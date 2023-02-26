package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_section对象 hhy_admin_section
 *
 * @author admin
 * @date 2022-03-31
 */
public class HhyAdminSection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long secId;

    /** uuid */
    @Excel(name = "uuid")
    private Long secUuid;

    /** 名字 */
    @Excel(name = "名字")
    private String secName;

    /** 描述 */
    @Excel(name = "描述")
    private String secDescription;

    /** displayas */
    @Excel(name = "displayas")
    private String secDisplayas;

    /** col_id */
    @Excel(name = "col_id")
    private Long colId;

    /** col_uid */
    @Excel(name = "col_uid")
    private Long colUid;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setSecId(Long secId)
    {
        this.secId = secId;
    }

    public Long getSecId()
    {
        return secId;
    }
    public void setSecUuid(Long secUuid)
    {
        this.secUuid = secUuid;
    }

    public Long getSecUuid()
    {
        return secUuid;
    }
    public void setSecName(String secName)
    {
        this.secName = secName;
    }

    public String getSecName()
    {
        return secName;
    }
    public void setSecDescription(String secDescription)
    {
        this.secDescription = secDescription;
    }

    public String getSecDescription()
    {
        return secDescription;
    }
    public void setSecDisplayas(String secDisplayas)
    {
        this.secDisplayas = secDisplayas;
    }

    public String getSecDisplayas()
    {
        return secDisplayas;
    }
    public void setColId(Long colId)
    {
        this.colId = colId;
    }

    public Long getColId()
    {
        return colId;
    }
    public void setColUid(Long colUid)
    {
        this.colUid = colUid;
    }

    public Long getColUid()
    {
        return colUid;
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
                .append("secId", getSecId())
                .append("secUuid", getSecUuid())
                .append("secName", getSecName())
                .append("secDescription", getSecDescription())
                .append("secDisplayas", getSecDisplayas())
                .append("colId", getColId())
                .append("colUid", getColUid())
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
