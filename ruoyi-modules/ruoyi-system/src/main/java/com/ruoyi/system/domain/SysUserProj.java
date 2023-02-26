package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户和项目关联 sys_user_proj
 *
 * @author daichao
 */
public class SysUserProj {

    private Long UserId;

    private  Long ProjId;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getProjId() {
        return ProjId;
    }

    public void setProjId(Long projId) {
        ProjId = projId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("userId", getUserId())
                .append("ProjId", getProjId())
                .toString();
    }
}
