package com.wulang.localdatabase.dao;

import com.wulang.localdatabase.model.UserFollow;
import com.wulang.localdatabase.model.UserFollowExample;
import com.wulang.localdatabase.model.UserFollowKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFollowMapper {
    List<UserFollow> selectByUserId(int userId);

    List<UserFollow> selectByFollowedId(int followId);

    List<UserFollow> selectInterFollowByIn(int userId);

    List<UserFollow> selectInterFollowByInFansFirst(int userId);

    List<UserFollow> selectInterFollowByIntersect(int userId);

    List<UserFollow> selectByEachOtherColumn(int userId);

    Integer count();

    Integer isFollowed(Integer userId,Integer followedId);

    long countByExample(UserFollowExample example);

    int deleteByExample(UserFollowExample example);

    int deleteByPrimaryKey(UserFollowKey key);

    int insert(UserFollow record);

    int insertSelective(UserFollow record);

    List<UserFollow> selectByExample(UserFollowExample example);

    UserFollow selectByPrimaryKey(UserFollowKey key);

    int updateByExampleSelective(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

    int updateByExample(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

    int updateByPrimaryKeySelective(UserFollow record);

    int updateByPrimaryKey(UserFollow record);
}