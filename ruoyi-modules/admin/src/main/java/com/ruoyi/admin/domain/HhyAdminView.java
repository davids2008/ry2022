package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_view对象 hhy_admin_view
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminView extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long viewId;

    /** 名称 */
    @Excel(name = "名称")
    private String viewName;

    /** 描述 */
    @Excel(name = "描述")
    private String viewDescription;

    /** display */
    @Excel(name = "display")
    private Integer viewDisplayas;

    /** section_id */
    @Excel(name = "section_id")
    private Integer viewSectionId;

    /** section_uid */
    @Excel(name = "section_uid")
    private Integer viewSectionUid;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setViewId(Long viewId)
    {
        this.viewId = viewId;
    }

    public Long getViewId()
    {
        return viewId;
    }
    public void setViewName(String viewName)
    {
        this.viewName = viewName;
    }

    public String getViewName()
    {
        return viewName;
    }
    public void setViewDescription(String viewDescription)
    {
        this.viewDescription = viewDescription;
    }

    public String getViewDescription()
    {
        return viewDescription;
    }
    public void setViewDisplayas(Integer viewDisplayas)
    {
        this.viewDisplayas = viewDisplayas;
    }

    public Integer getViewDisplayas()
    {
        return viewDisplayas;
    }
    public void setViewSectionId(Integer viewSectionId)
    {
        this.viewSectionId = viewSectionId;
    }

    public Integer getViewSectionId()
    {
        return viewSectionId;
    }
    public void setViewSectionUid(Integer viewSectionUid)
    {
        this.viewSectionUid = viewSectionUid;
    }

    public Integer getViewSectionUid()
    {
        return viewSectionUid;
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
                .append("viewId", getViewId())
                .append("viewName", getViewName())
                .append("viewDescription", getViewDescription())
                .append("viewDisplayas", getViewDisplayas())
                .append("viewSectionId", getViewSectionId())
                .append("viewSectionUid", getViewSectionUid())
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
