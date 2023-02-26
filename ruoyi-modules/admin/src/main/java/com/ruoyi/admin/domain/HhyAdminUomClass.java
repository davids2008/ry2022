package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * UomClass对象 hhy_admin_uom_class
 *
 * @author ruoyi
 * @date 2022-03-31
 */
public class HhyAdminUomClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分类iD */
    private Long uomClassId;

    /** 分类uuiD */
    @Excel(name = "分类uuiD")
    private String uomClassUuid;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String uomClassName;

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
    private String esSPI;
    private  String esSPPID;
    private  String esS3D;

    public String getEsSPI() {
        return esSPI;
    }

    public void setEsSPI(String esSPI) {
        this.esSPI = esSPI;
    }

    public String getEsSPPID() {
        return esSPPID;
    }

    public void setEsSPPID(String esSPPID) {
        this.esSPPID = esSPPID;
    }

    public String getEsS3D() {
        return esS3D;
    }

    public void setEsS3D(String esS3D) {
        this.esS3D = esS3D;
    }

    public void setUomClassId(Long uomClassId)
    {
        this.uomClassId = uomClassId;
    }

    public Long getUomClassId()
    {
        return uomClassId;
    }
    public void setUomClassUuid(String uomClassUuid)
    {
        this.uomClassUuid = uomClassUuid;
    }

    public String getUomClassUuid()
    {
        return uomClassUuid;
    }
    public void setUomClassName(String uomClassName)
    {
        this.uomClassName = uomClassName;
    }

    public String getUomClassName()
    {
        return uomClassName;
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
                .append("uomClassId", getUomClassId())
                .append("uomClassUuid", getUomClassUuid())
                .append("uomClassName", getUomClassName())
                .append("uomClassDescription", getUomClassDescription())
                .append("uomSort", getUomSort())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("projId", getProjId())
                .append("esS3D", getEsS3D())
                .append("esSPPID", getEsSPPID())
                .append("esSPI", getEsSPI())
                .toString();
    }
}
