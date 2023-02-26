package com.ruoyi.admin.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * adminclass对象 hhy_admin_class
 *
 * @author daichao
 * @date 2022-03-31
 */
public class HhyAdminClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** iD */
    private Long classId;

    /** uiD */
    @Excel(name = "uiD")
    private Long classUid;

    /** 名称 */
    @Excel(name = "名称")
    private String className;

    /** 描述 */
    @Excel(name = "描述")
    private String classDescription;

    /** display */
    @Excel(name = "display")
    private String classDisplayAs;

    /** extends */
    @Excel(name = "extends")
    private Integer classExtends;

    /** type */
    @Excel(name = "type")
    private String classType;

    /** rule */
    @Excel(name = "rule")
    private String classUniqueIdRule;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 项目id */
    @Excel(name = "项目id")
    private Long projId;

    /** class_in信息 */
    private List<HhyAdminClassToin> hhyAdminClassToinList;

    public void setClassId(Long classId)
    {
        this.classId = classId;
    }

    public Long getClassId()
    {
        return classId;
    }
    public void setClassUid(Long classUid)
    {
        this.classUid = classUid;
    }

    public Long getClassUid()
    {
        return classUid;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }

    public String getClassName()
    {
        return className;
    }
    public void setClassDescription(String classDescription)
    {
        this.classDescription = classDescription;
    }

    public String getClassDescription()
    {
        return classDescription;
    }
    public void setClassDisplayAs(String classDisplayAs)
    {
        this.classDisplayAs = classDisplayAs;
    }

    public String getClassDisplayAs()
    {
        return classDisplayAs;
    }
    public void setClassExtends(Integer classExtends)
    {
        this.classExtends = classExtends;
    }

    public Integer getClassExtends()
    {
        return classExtends;
    }
    public void setClassType(String classType)
    {
        this.classType = classType;
    }

    public String getClassType()
    {
        return classType;
    }
    public void setClassUniqueIdRule(String classUniqueIdRule)
    {
        this.classUniqueIdRule = classUniqueIdRule;
    }

    public String getClassUniqueIdRule()
    {
        return classUniqueIdRule;
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

    public List<HhyAdminClassToin> getHhyAdminClassToinList()
    {
        return hhyAdminClassToinList;
    }

    public void setHhyAdminClassToinList(List<HhyAdminClassToin> hhyAdminClassToinList)
    {
        this.hhyAdminClassToinList = hhyAdminClassToinList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("classId", getClassId())
                .append("classUid", getClassUid())
                .append("className", getClassName())
                .append("classDescription", getClassDescription())
                .append("classDisplayAs", getClassDisplayAs())
                .append("classExtends", getClassExtends())
                .append("classType", getClassType())
                .append("classUniqueIdRule", getClassUniqueIdRule())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("projId", getProjId())
                .append("hhyAdminClassToinList", getHhyAdminClassToinList())
                .toString();
    }
}
