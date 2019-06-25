package com.we;

import java.util.Date;

public class WhiteListDO extends WhiteListDOKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}