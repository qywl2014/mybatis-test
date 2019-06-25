package com.wulang.mybatis.spring.model;

public class UserFriendKey {
    private Integer userId;

    private Integer friendId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    @Override
    public String toString() {
        return "UserFriendKey{" +
                "userId=" + userId +
                ", friendId=" + friendId +
                '}';
    }
}