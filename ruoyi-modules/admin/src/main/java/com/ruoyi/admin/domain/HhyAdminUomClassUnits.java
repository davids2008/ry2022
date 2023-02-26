package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * UomClassUnits对象 hhy_admin_uom_class_units
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminUomClassUnits extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long uomClassUnitsId;

    /** uuiD */
    @Excel(name = "uuiD")
    private String uomClassUnitsUuid;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String uomUnitsName;

    /** 分类描述 */
    @Excel(name = "分类描述")
    private String uomClassDescription;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer uomSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setUomClassUnitsId(Long uomClassUnitsId)
    {
        this.uomClassUnitsId = uomClassUnitsId;
    }

    public Long getUomClassUnitsId()
    {
        return uomClassUnitsId;
    }
    public void setUomClassUnitsUuid(String uomClassUnitsUuid)
    {
        this.uomClassUnitsUuid = uomClassUnitsUuid;
    }

    public String getUomClassUnitsUuid()
    {
        return uomClassUnitsUuid;
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
    public void setUomSort(Integer uomSort)
    {
        this.uomSort = uomSort;
    }

    public Integer getUomSort()
    {
        return uomSort;
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
                .append("uomClassUnitsId", getUomClassUnitsId())
                .append("uomClassUnitsUuid", getUomClassUnitsUuid())
                .append("uomUnitsName", getUomUnitsName())
                .append("uomClassDescription", getUomClassDescription())
                .append("uomSort", getUomSort())
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
