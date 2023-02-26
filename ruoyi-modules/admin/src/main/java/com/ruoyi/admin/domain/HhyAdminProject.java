package com.ruoyi.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * hhy_admin_project对象 hhy_admin_project
 *
 * @author admin
 * @date 2022-03-31
 */
public class HhyAdminProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long projId;

    /** 名称 */
    @Excel(name = "名称")
    private String projName;

    /** 描述 */
    @Excel(name = "描述")
    private String projDescription;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date projBegintime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date projEndintime;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setProjId(Long projId)
    {
        this.projId = projId;
    }

    public Long getProjId()
    {
        return projId;
    }
    public void setProjName(String projName)
    {
        this.projName = projName;
    }

    public String getProjName()
    {
        return projName;
    }
    public void setProjDescription(String projDescription)
    {
        this.projDescription = projDescription;
    }

    public String getProjDescription()
    {
        return projDescription;
    }
    public void setProjBegintime(Date projBegintime)
    {
        this.projBegintime = projBegintime;
    }

    public Date getProjBegintime()
    {
        return projBegintime;
    }
    public void setProjEndintime(Date projEndintime)
    {
        this.projEndintime = projEndintime;
    }

    public Date getProjEndintime()
    {
        return projEndintime;
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
                .append("projId", getProjId())
                .append("projName", getProjName())
                .append("projDescription", getProjDescription())
                .append("projBegintime", getProjBegintime())
                .append("projEndintime", getProjEndintime())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
