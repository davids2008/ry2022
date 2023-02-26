package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_project_userlist对象 hhy_admin_project_userlist
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminProjectUserlist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long projUId;

    /** id */
    @Excel(name = "id")
    private Long projJd;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private String projUUid;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setProjUId(Long projUId)
    {
        this.projUId = projUId;
    }

    public Long getProjUId()
    {
        return projUId;
    }
    public void setProjJd(Long projJd)
    {
        this.projJd = projJd;
    }

    public Long getProjJd()
    {
        return projJd;
    }
    public void setProjUUid(String projUUid)
    {
        this.projUUid = projUUid;
    }

    public String getProjUUid()
    {
        return projUUid;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("projUId", getProjUId())
                .append("projJd", getProjJd())
                .append("projUUid", getProjUUid())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
