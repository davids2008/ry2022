package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * interface_relationdef对象 hhy_admin_interface_relationdef
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminInterfaceRelationdef extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long interRelId;

    /** in_iD */
    @Excel(name = "in_iD")
    private Long interId;

    /** 名字 */
    @Excel(name = "名字")
    private String interRelName;

    /** uid */
    @Excel(name = "uid")
    private Long interRelUid;

    /** 描述 */
    @Excel(name = "描述")
    private String interRelDescription;

    /** inter_uid */
    @Excel(name = "inter_uid")
    private String interUid;

    /** inter_uid1 */
    @Excel(name = "inter_uid1")
    private String interUid1;

    /** role1 */
    @Excel(name = "role1")
    private Long interRelRole1;

    /** role2 */
    @Excel(name = "role2")
    private Long interRelRole2;

    /** view_id */
    @Excel(name = "view_id")
    private Long viewId;

    /** view_uid */
    @Excel(name = "view_uid")
    private Long viewUid;

    /** seq */
    @Excel(name = "seq")
    private Long interRelSeq;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setInterRelId(Long interRelId)
    {
        this.interRelId = interRelId;
    }

    public Long getInterRelId()
    {
        return interRelId;
    }
    public void setInterId(Long interId)
    {
        this.interId = interId;
    }

    public Long getInterId()
    {
        return interId;
    }
    public void setInterRelName(String interRelName)
    {
        this.interRelName = interRelName;
    }

    public String getInterRelName()
    {
        return interRelName;
    }
    public void setInterRelUid(Long interRelUid)
    {
        this.interRelUid = interRelUid;
    }

    public Long getInterRelUid()
    {
        return interRelUid;
    }
    public void setInterRelDescription(String interRelDescription)
    {
        this.interRelDescription = interRelDescription;
    }

    public String getInterRelDescription()
    {
        return interRelDescription;
    }
    public void setInterUid(String interUid)
    {
        this.interUid = interUid;
    }

    public String getInterUid()
    {
        return interUid;
    }
    public void setInterUid1(String interUid1)
    {
        this.interUid1 = interUid1;
    }

    public String getInterUid1()
    {
        return interUid1;
    }
    public void setInterRelRole1(Long interRelRole1)
    {
        this.interRelRole1 = interRelRole1;
    }

    public Long getInterRelRole1()
    {
        return interRelRole1;
    }
    public void setInterRelRole2(Long interRelRole2)
    {
        this.interRelRole2 = interRelRole2;
    }

    public Long getInterRelRole2()
    {
        return interRelRole2;
    }
    public void setViewId(Long viewId)
    {
        this.viewId = viewId;
    }

    public Long getViewId()
    {
        return viewId;
    }
    public void setViewUid(Long viewUid)
    {
        this.viewUid = viewUid;
    }

    public Long getViewUid()
    {
        return viewUid;
    }
    public void setInterRelSeq(Long interRelSeq)
    {
        this.interRelSeq = interRelSeq;
    }

    public Long getInterRelSeq()
    {
        return interRelSeq;
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
                .append("interRelId", getInterRelId())
                .append("interId", getInterId())
                .append("interRelName", getInterRelName())
                .append("interRelUid", getInterRelUid())
                .append("interRelDescription", getInterRelDescription())
                .append("interUid", getInterUid())
                .append("interUid1", getInterUid1())
                .append("interRelRole1", getInterRelRole1())
                .append("interRelRole2", getInterRelRole2())
                .append("viewId", getViewId())
                .append("viewUid", getViewUid())
                .append("interRelSeq", getInterRelSeq())
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
