package com.wulang.localdatabase.model;

import java.util.Date;

public class UserFollowBak extends UserFollowBakKey {
    private Date dtime;

    private Integer confirmtag;

    private String oggtag;

    private Integer followEachOther;

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Integer getConfirmtag() {
        return confirmtag;
    }

    public void setConfirmtag(Integer confirmtag) {
        this.confirmtag = confirmtag;
    }

    public String getOggtag() {
        return oggtag;
    }

    public void setOggtag(String oggtag) {
        this.oggtag = oggtag == null ? null : oggtag.trim();
    }

    public Integer getFollowEachOther() {
        return followEachOther;
    }

    public void setFollowEachOther(Integer followEachOther) {
        this.followEachOther = followEachOther;
    }
}