package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * systemhierarchy对象 hhy_admin_systemhierarchy
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminSystemhierarchy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long syshId;

    /** 名称 */
    @Excel(name = "名称")
    private String syshName;

    /** 上级id */
    @Excel(name = "上级id")
    private Long syshParentid;

    /** 上级名称 */
    @Excel(name = "上级名称")
    private String syshParentName;

    /** 分类描述 */
    @Excel(name = "分类描述")
    private String syshDescription;

    /** classrootuid */
    @Excel(name = "classrootuid")
    private String syshClassRootUid;

    /** classrootname */
    @Excel(name = "classrootname")
    private String syshClassRootName;

    /** 类型 */
    @Excel(name = "类型")
    private String syshType;

    /** 类型（0system 1class） */
    @Excel(name = "类型", readConverterExp = "0=system,1=class")
    private String syshSystemClass;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setSyshId(Long syshId)
    {
        this.syshId = syshId;
    }

    public Long getSyshId()
    {
        return syshId;
    }
    public void setSyshName(String syshName)
    {
        this.syshName = syshName;
    }

    public String getSyshName()
    {
        return syshName;
    }
    public void setSyshParentid(Long syshParentid)
    {
        this.syshParentid = syshParentid;
    }

    public Long getSyshParentid()
    {
        return syshParentid;
    }
    public void setSyshParentName(String syshParentName)
    {
        this.syshParentName = syshParentName;
    }

    public String getSyshParentName()
    {
        return syshParentName;
    }
    public void setSyshDescription(String syshDescription)
    {
        this.syshDescription = syshDescription;
    }

    public String getSyshDescription()
    {
        return syshDescription;
    }
    public void setSyshClassRootUid(String syshClassRootUid)
    {
        this.syshClassRootUid = syshClassRootUid;
    }

    public String getSyshClassRootUid()
    {
        return syshClassRootUid;
    }
    public void setSyshClassRootName(String syshClassRootName)
    {
        this.syshClassRootName = syshClassRootName;
    }

    public String getSyshClassRootName()
    {
        return syshClassRootName;
    }
    public void setSyshType(String syshType)
    {
        this.syshType = syshType;
    }

    public String getSyshType()
    {
        return syshType;
    }
    public void setSyshSystemClass(String syshSystemClass)
    {
        this.syshSystemClass = syshSystemClass;
    }

    public String getSyshSystemClass()
    {
        return syshSystemClass;
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
                .append("syshId", getSyshId())
                .append("syshName", getSyshName())
                .append("syshParentid", getSyshParentid())
                .append("syshParentName", getSyshParentName())
                .append("syshDescription", getSyshDescription())
                .append("syshClassRootUid", getSyshClassRootUid())
                .append("syshClassRootName", getSyshClassRootName())
                .append("syshType", getSyshType())
                .append("syshSystemClass", getSyshSystemClass())
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
