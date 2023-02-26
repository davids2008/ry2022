package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * class_in对象 hhy_admin_class_toin
 * 
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminClassToin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long classinId;

    /** classid */
    @Excel(name = "classid")
    private Long classId;

    /** inuiD */
    @Excel(name = "inuiD")
    private Long classinInterfaceUid;

    /** in_def名称 */
    @Excel(name = "in_def名称")
    private String classinInterfaceDef;

    /** 排序 */
    @Excel(name = "排序")
    private Long classinSeq;

    /** 状态（0需要 1不需要） */
    @Excel(name = "状态", readConverterExp = "0=需要,1=不需要")
    private String classinIsrequire;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setClassinId(Long classinId) 
    {
        this.classinId = classinId;
    }

    public Long getClassinId() 
    {
        return classinId;
    }
    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }
    public void setClassinInterfaceUid(Long classinInterfaceUid) 
    {
        this.classinInterfaceUid = classinInterfaceUid;
    }

    public Long getClassinInterfaceUid() 
    {
        return classinInterfaceUid;
    }
    public void setClassinInterfaceDef(String classinInterfaceDef) 
    {
        this.classinInterfaceDef = classinInterfaceDef;
    }

    public String getClassinInterfaceDef() 
    {
        return classinInterfaceDef;
    }
    public void setClassinSeq(Long classinSeq) 
    {
        this.classinSeq = classinSeq;
    }

    public Long getClassinSeq() 
    {
        return classinSeq;
    }
    public void setClassinIsrequire(String classinIsrequire) 
    {
        this.classinIsrequire = classinIsrequire;
    }

    public String getClassinIsrequire() 
    {
        return classinIsrequire;
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
            .append("classinId", getClassinId())
            .append("classId", getClassId())
            .append("classinInterfaceUid", getClassinInterfaceUid())
            .append("classinInterfaceDef", getClassinInterfaceDef())
            .append("classinSeq", getClassinSeq())
            .append("classinIsrequire", getClassinIsrequire())
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
