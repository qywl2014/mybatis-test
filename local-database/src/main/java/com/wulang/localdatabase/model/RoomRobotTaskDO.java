package com.wulang.localdatabase.model;

import java.io.Serializable;
import java.util.Date;

/**
 * room_robot_task
 * @author 
 */
public class RoomRobotTaskDO implements Serializable {
    private Integer id;

    private Integer roomId;

    private Integer type;

    private Integer total;

    private Integer period;

    private Integer state;

    private Date updateTime;

    private Date createTime;

    private Date lastAddTime;

    private Date startTime;

    private Date endTime;

    private Integer multiple;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastAddTime() {
        return lastAddTime;
    }

    public void setLastAddTime(Date lastAddTime) {
        this.lastAddTime = lastAddTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    @Override
    public String toString() {
        return "RoomRobotTaskDO{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", type=" + type +
                ", total=" + total +
                ", period=" + period +
                ", state=" + state +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", lastAddTime=" + lastAddTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", multiple=" + multiple +
                '}';
    }
}