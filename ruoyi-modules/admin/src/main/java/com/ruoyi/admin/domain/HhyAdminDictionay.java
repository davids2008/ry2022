package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 数据字典new对象 hhy_admin_dictionay
 *
 * @author ruoyi
 * @date 2022-03-31
 */
public class HhyAdminDictionay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 字典ID */
    private Long dictId;

    /** 字符名称 */
    @Excel(name = "字符名称")
    private String dictName;

    /** 字符属性 */
    @Excel(name = "字符属性")
    private String dictDefinition;

    /** 长度 */
    @Excel(name = "长度")
    private String dictDataTypeLength;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private String dictDataType;

    /** uom类型 */
    @Excel(name = "uom类型")
    private String uomClass;

    /** uom_required */
    @Excel(name = "uom_required")
    private Integer uomRequired;

    /** picklistName */
    @Excel(name = "picklistName")
    private String picklistname;

    /** picklistRequired */
    @Excel(name = "picklistRequired")
    private Integer picklistrequired;

    /** groupid */
    @Excel(name = "groupid")
    private Long groupid;

    /** content */
    @Excel(name = "content")
    private String content;

    /** seq */
    @Excel(name = "seq")
    private Long seq;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer dictSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态", readConverterExp = "$column.readConverterExp()")
    private Long projId;

    public void setDictId(Long dictId)
    {
        this.dictId = dictId;
    }

    public Long getDictId()
    {
        return dictId;
    }
    public void setDictName(String dictName)
    {
        this.dictName = dictName;
    }

    public String getDictName()
    {
        return dictName;
    }
    public void setDictDefinition(String dictDefinition)
    {
        this.dictDefinition = dictDefinition;
    }

    public String getDictDefinition()
    {
        return dictDefinition;
    }
    public void setDictDataTypeLength(String dictDataTypeLength)
    {
        this.dictDataTypeLength = dictDataTypeLength;
    }

    public String getDictDataTypeLength()
    {
        return dictDataTypeLength;
    }
    public void setDictDataType(String dictDataType)
    {
        this.dictDataType = dictDataType;
    }

    public String getDictDataType()
    {
        return dictDataType;
    }
    public void setUomClass(String uomClass)
    {
        this.uomClass = uomClass;
    }

    public String getUomClass()
    {
        return uomClass;
    }
    public void setUomRequired(Integer uomRequired)
    {
        this.uomRequired = uomRequired;
    }

    public Integer getUomRequired()
    {
        return uomRequired;
    }
    public void setPicklistname(String picklistname)
    {
        this.picklistname = picklistname;
    }

    public String getPicklistname()
    {
        return picklistname;
    }
    public void setPicklistrequired(Integer picklistrequired)
    {
        this.picklistrequired = picklistrequired;
    }

    public Integer getPicklistrequired()
    {
        return picklistrequired;
    }
    public void setGroupid(Long groupid)
    {
        this.groupid = groupid;
    }

    public Long getGroupid()
    {
        return groupid;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setSeq(Long seq)
    {
        this.seq = seq;
    }

    public Long getSeq()
    {
        return seq;
    }
    public void setDictSort(Integer dictSort)
    {
        this.dictSort = dictSort;
    }

    public Integer getDictSort()
    {
        return dictSort;
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
                .append("dictId", getDictId())
                .append("dictName", getDictName())
                .append("dictDefinition", getDictDefinition())
                .append("dictDataTypeLength", getDictDataTypeLength())
                .append("dictDataType", getDictDataType())
                .append("uomClass", getUomClass())
                .append("uomRequired", getUomRequired())
                .append("picklistname", getPicklistname())
                .append("picklistrequired", getPicklistrequired())
                .append("groupid", getGroupid())
                .append("content", getContent())
                .append("seq", getSeq())
                .append("dictSort", getDictSort())
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
