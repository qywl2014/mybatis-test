package com.wulang.localdatabase.dao;

import com.wulang.localdatabase.model.RoomRobotTaskDO;
import com.wulang.localdatabase.model.RoomRobotTaskDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomRobotTaskDAO {
    long countByExample(RoomRobotTaskDOExample example);

    int deleteByExample(RoomRobotTaskDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomRobotTaskDO record);

    int insertSelective(RoomRobotTaskDO record);

    List<RoomRobotTaskDO> selectByExample(RoomRobotTaskDOExample example);

    RoomRobotTaskDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomRobotTaskDO record, @Param("example") RoomRobotTaskDOExample example);

    int updateByExample(@Param("record") RoomRobotTaskDO record, @Param("example") RoomRobotTaskDOExample example);

    int updateByPrimaryKeySelective(RoomRobotTaskDO record);

    int updateByPrimaryKey(RoomRobotTaskDO record);

    Integer insertList(@Param("list") List<RoomRobotTaskDO> roomRobotTaskDOList);
}