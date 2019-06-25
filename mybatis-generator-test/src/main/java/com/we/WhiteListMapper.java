package com.we;

import com.we.WhiteListDO;
import com.we.WhiteListDOExample;
import com.we.WhiteListDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WhiteListMapper {
    long countByExample(WhiteListDOExample example);

    int deleteByExample(WhiteListDOExample example);

    int deleteByPrimaryKey(WhiteListDOKey key);

    int insert(WhiteListDO record);

    int insertSelective(WhiteListDO record);

    List<WhiteListDO> selectByExample(WhiteListDOExample example);

    WhiteListDO selectByPrimaryKey(WhiteListDOKey key);

    int updateByExampleSelective(@Param("record") WhiteListDO record, @Param("example") WhiteListDOExample example);

    int updateByExample(@Param("record") WhiteListDO record, @Param("example") WhiteListDOExample example);

    int updateByPrimaryKeySelective(WhiteListDO record);

    int updateByPrimaryKey(WhiteListDO record);
}