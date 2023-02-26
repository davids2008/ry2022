package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * UomUnits对象 hhy_admin_uom_units
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminUomUnits extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long uomUnitsId;

    /** uuiD */
    @Excel(name = "uuiD")
    private String uomUnitsUuid;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String uomUnitsName;

    /** 分类描述 */
    @Excel(name = "分类描述")
    private String uomClassDescription;

    /** symbol */
    @Excel(name = "symbol")
    private String uomClassSymbol;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setUomUnitsId(Long uomUnitsId)
    {
        this.uomUnitsId = uomUnitsId;
    }

    public Long getUomUnitsId()
    {
        return uomUnitsId;
    }
    public void setUomUnitsUuid(String uomUnitsUuid)
    {
        this.uomUnitsUuid = uomUnitsUuid;
    }

    public String getUomUnitsUuid()
    {
        return uomUnitsUuid;
    }
    public void setUomUnitsName(String uomUnitsName)
    {
        this.uomUnitsName = uomUnitsName;
    }

    public String getUomUnitsName()
    {
        return uomUnitsName;
    }
    public void setUomClassDescription(String uomClassDescription)
    {
        this.uomClassDescription = uomClassDescription;
    }

    public String getUomClassDescription()
    {
        return uomClassDescription;
    }
    public void setUomClassSymbol(String uomClassSymbol)
    {
        this.uomClassSymbol = uomClassSymbol;
    }

    public String getUomClassSymbol()
    {
        return uomClassSymbol;
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
                .append("uomUnitsId", getUomUnitsId())
                .append("uomUnitsUuid", getUomUnitsUuid())
                .append("uomUnitsName", getUomUnitsName())
                .append("uomClassDescription", getUomClassDescription())
                .append("uomClassSymbol", getUomClassSymbol())
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
