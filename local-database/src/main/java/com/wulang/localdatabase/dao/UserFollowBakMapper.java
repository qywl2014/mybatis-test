package com.wulang.localdatabase.dao;

import com.wulang.localdatabase.model.UserFollowBak;
import com.wulang.localdatabase.model.UserFollowBakExample;
import com.wulang.localdatabase.model.UserFollowBakKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFollowBakMapper {
    long countByExample(UserFollowBakExample example);

    int deleteByExample(UserFollowBakExample example);

    int deleteByPrimaryKey(UserFollowBakKey key);

    int insert(UserFollowBak record);

    int insertSelective(UserFollowBak record);

    List<UserFollowBak> selectByExample(UserFollowBakExample example);

    UserFollowBak selectByPrimaryKey(UserFollowBakKey key);

    int updateByExampleSelective(@Param("record") UserFollowBak record, @Param("example") UserFollowBakExample example);

    int updateByExample(@Param("record") UserFollowBak record, @Param("example") UserFollowBakExample example);

    int updateByPrimaryKeySelective(UserFollowBak record);

    int updateByPrimaryKey(UserFollowBak record);
}