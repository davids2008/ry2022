package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * picklist对象 hhy_admin_property_picklist
 *
 * @author ruoyi
 * @date 2022-03-31
 */
public class HhyAdminPropertyPicklist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long pickId;

    /** 名称 */
    @Excel(name = "名称")
    private String pickName;

    /** uid */
    @Excel(name = "uid")
    private String pickUid;

    /** 类型 */
    @Excel(name = "类型")
    private String pickType;

    /** 描述 */
    @Excel(name = "描述")
    private String pickDescription;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer pickSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setPickId(Long pickId)
    {
        this.pickId = pickId;
    }

    public Long getPickId()
    {
        return pickId;
    }
    public void setPickName(String pickName)
    {
        this.pickName = pickName;
    }

    public String getPickName()
    {
        return pickName;
    }
    public void setPickUid(String pickUid)
    {
        this.pickUid = pickUid;
    }

    public String getPickUid()
    {
        return pickUid;
    }
    public void setPickType(String pickType)
    {
        this.pickType = pickType;
    }

    public String getPickType()
    {
        return pickType;
    }
    public void setPickDescription(String pickDescription)
    {
        this.pickDescription = pickDescription;
    }

    public String getPickDescription()
    {
        return pickDescription;
    }
    public void setPickSort(Integer pickSort)
    {
        this.pickSort = pickSort;
    }

    public Integer getPickSort()
    {
        return pickSort;
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
                .append("pickId", getPickId())
                .append("pickName", getPickName())
                .append("pickUid", getPickUid())
                .append("pickType", getPickType())
                .append("pickDescription", getPickDescription())
                .append("pickSort", getPickSort())
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
