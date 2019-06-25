package com.wulang.mybatis.model;

import java.util.Date;

public class UserFriend extends UserFriendKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}