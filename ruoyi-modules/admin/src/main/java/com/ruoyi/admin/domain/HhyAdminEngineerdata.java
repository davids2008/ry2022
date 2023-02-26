package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * engineerdata对象 hhy_admin_engineerdata
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminEngineerdata extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long engId;

    /** 名称 */
    @Excel(name = "名称")
    private String engName;

    /** 描述 */
    @Excel(name = "描述")
    private String engDescription;

    /** ip */
    @Excel(name = "ip")
    private String engAddrIp;

    /** 端口 */
    @Excel(name = "端口")
    private Integer engPort;

    /** 账号 */
    @Excel(name = "账号")
    private String engUsername;

    /** 密码 */
    @Excel(name = "密码")
    private String engPasswd;

    /** 数据库类型 */
    @Excel(name = "数据库类型")
    private String engType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setEngId(Long engId)
    {
        this.engId = engId;
    }

    public Long getEngId()
    {
        return engId;
    }
    public void setEngName(String engName)
    {
        this.engName = engName;
    }

    public String getEngName()
    {
        return engName;
    }
    public void setEngDescription(String engDescription)
    {
        this.engDescription = engDescription;
    }

    public String getEngDescription()
    {
        return engDescription;
    }
    public void setEngAddrIp(String engAddrIp)
    {
        this.engAddrIp = engAddrIp;
    }

    public String getEngAddrIp()
    {
        return engAddrIp;
    }
    public void setEngPort(Integer engPort)
    {
        this.engPort = engPort;
    }

    public Integer getEngPort()
    {
        return engPort;
    }
    public void setEngUsername(String engUsername)
    {
        this.engUsername = engUsername;
    }

    public String getEngUsername()
    {
        return engUsername;
    }
    public void setEngPasswd(String engPasswd)
    {
        this.engPasswd = engPasswd;
    }

    public String getEngPasswd()
    {
        return engPasswd;
    }
    public void setEngType(String engType)
    {
        this.engType = engType;
    }

    public String getEngType()
    {
        return engType;
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
                .append("engId", getEngId())
                .append("engName", getEngName())
                .append("engDescription", getEngDescription())
                .append("engAddrIp", getEngAddrIp())
                .append("engPort", getEngPort())
                .append("engUsername", getEngUsername())
                .append("engPasswd", getEngPasswd())
                .append("engType", getEngType())
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
