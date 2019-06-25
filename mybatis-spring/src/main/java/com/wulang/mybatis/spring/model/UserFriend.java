package com.wulang.mybatis.spring.model;

import java.util.Date;

public class UserFriend extends UserFriendKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserFriend{" +
                "createTime=" + createTime +
                "} " + super.toString();
    }
}