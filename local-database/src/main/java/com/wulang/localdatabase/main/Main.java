package com.wulang.localdatabase.main;

import com.wulang.localdatabase.dao.RoomRobotTaskDAO;
import com.wulang.localdatabase.domain.RoomRobotTask;
import com.wulang.localdatabase.model.RoomRobotTaskDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Main {
    @Autowired
    RoomRobotTaskDAO roomRobotTaskDAO;

    @PostConstruct
    public void init(){
        List<RoomRobotTaskDO> roomRobotTaskList = new ArrayList<>();
        for(int i=2200;i<2300;i++){
            RoomRobotTaskDO roomRobotTaskDO=new RoomRobotTaskDO();
            roomRobotTaskDO.setId(i);
            roomRobotTaskDO.setRoomId(i);
            roomRobotTaskDO.setType(i);
            roomRobotTaskDO.setPeriod(i);
            roomRobotTaskDO.setState(i);
            roomRobotTaskList.add(roomRobotTaskDO);
        }
        roomRobotTaskDAO.insertList(roomRobotTaskList);
    }
}

