package com.wulang.localdatabase.domain;

public class UserInfo {
    private Integer id;

    private Integer point;

    private Integer lastMonthPoint;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getLastMonthPoint() {
        return lastMonthPoint;
    }

    public void setLastMonthPoint(Integer lastMonthPoint) {
        this.lastMonthPoint = lastMonthPoint;
    }
}
