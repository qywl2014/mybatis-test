package com.wulang.localdatabase.domain;

public class Userinfo {
    private Integer id;

    private Integer point;

    private Integer lastMonthPoint;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", point=" + point +
                ", lastMonthPoint=" + lastMonthPoint +
                ", name='" + name + '\'' +
                '}';
    }
}