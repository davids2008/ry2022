package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * interface_implied对象 hhy_admin_interface_implied
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminInterfaceImplied extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long interImId;

    /** in_iD */
    @Excel(name = "in_iD")
    private Long interId;

    /** uid */
    @Excel(name = "uid")
    private String interImUid;

    /** uid1 */
    @Excel(name = "uid1")
    private String interImUid1;

    /** uid2 */
    @Excel(name = "uid2")
    private String interImUid2;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String interImIsrequire;

    /** seq */
    @Excel(name = "seq")
    private Long interSeq;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setInterImId(Long interImId)
    {
        this.interImId = interImId;
    }

    public Long getInterImId()
    {
        return interImId;
    }
    public void setInterId(Long interId)
    {
        this.interId = interId;
    }

    public Long getInterId()
    {
        return interId;
    }
    public void setInterImUid(String interImUid)
    {
        this.interImUid = interImUid;
    }

    public String getInterImUid()
    {
        return interImUid;
    }
    public void setInterImUid1(String interImUid1)
    {
        this.interImUid1 = interImUid1;
    }

    public String getInterImUid1()
    {
        return interImUid1;
    }
    public void setInterImUid2(String interImUid2)
    {
        this.interImUid2 = interImUid2;
    }

    public String getInterImUid2()
    {
        return interImUid2;
    }
    public void setInterImIsrequire(String interImIsrequire)
    {
        this.interImIsrequire = interImIsrequire;
    }

    public String getInterImIsrequire()
    {
        return interImIsrequire;
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
                .append("interImId", getInterImId())
                .append("interId", getInterId())
                .append("interImUid", getInterImUid())
                .append("interImUid1", getInterImUid1())
                .append("interImUid2", getInterImUid2())
                .append("interImIsrequire", getInterImIsrequire())
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
