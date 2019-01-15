package com.wulang.localdatabase.domain;

public class RoomRobotTask {
    private Integer id;

    private Integer roomId;

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

    @Override
    public String toString() {
        return "RoomRobotTask{" +
                "id=" + id +
                ", roomId=" + roomId +
                '}';
    }
}

