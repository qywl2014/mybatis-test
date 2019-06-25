package com.wulang.localdatabase.model;

public class UserFollowBakKey {
    private Integer userid;

    private Integer followedid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFollowedid() {
        return followedid;
    }

    public void setFollowedid(Integer followedid) {
        this.followedid = followedid;
    }
}