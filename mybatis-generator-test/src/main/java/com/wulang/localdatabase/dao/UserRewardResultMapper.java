package com.wulang.localdatabase.dao;

import com.wulang.localdatabase.model.UserRewardResultDO;
import com.wulang.localdatabase.model.UserRewardResultDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRewardResultMapper {
    long countByExample(UserRewardResultDOExample example);

    int deleteByExample(UserRewardResultDOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserRewardResultDO record);

    int insertSelective(UserRewardResultDO record);

    List<UserRewardResultDO> selectByExample(UserRewardResultDOExample example);

    UserRewardResultDO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserRewardResultDO record, @Param("example") UserRewardResultDOExample example);

    int updateByExample(@Param("record") UserRewardResultDO record, @Param("example") UserRewardResultDOExample example);

    int updateByPrimaryKeySelective(UserRewardResultDO record);

    int updateByPrimaryKey(UserRewardResultDO record);
}