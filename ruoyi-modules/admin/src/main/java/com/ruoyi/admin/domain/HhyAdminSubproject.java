package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_subproject对象 hhy_admin_subproject
 *
 * @author ruoyi
 * @date 2022-03-31
 */
public class HhyAdminSubproject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long projSubid;

    /** 名称 */
    @Excel(name = "名称")
    private String projSubname;

    /** 描述 */
    @Excel(name = "描述")
    private String projSubdescription;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setProjSubid(Long projSubid)
    {
        this.projSubid = projSubid;
    }

    public Long getProjSubid()
    {
        return projSubid;
    }
    public void setProjSubname(String projSubname)
    {
        this.projSubname = projSubname;
    }

    public String getProjSubname()
    {
        return projSubname;
    }
    public void setProjSubdescription(String projSubdescription)
    {
        this.projSubdescription = projSubdescription;
    }

    public String getProjSubdescription()
    {
        return projSubdescription;
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
                .append("projSubid", getProjSubid())
                .append("projSubname", getProjSubname())
                .append("projSubdescription", getProjSubdescription())
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
