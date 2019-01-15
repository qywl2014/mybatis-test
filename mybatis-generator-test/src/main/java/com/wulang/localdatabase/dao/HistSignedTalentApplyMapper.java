package com.wulang.localdatabase.dao;

import com.wulang.localdatabase.model.HistSignedTalentApplyDO;
import com.wulang.localdatabase.model.HistSignedTalentApplyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistSignedTalentApplyMapper {
    long countByExample(HistSignedTalentApplyDOExample example);

    int deleteByExample(HistSignedTalentApplyDOExample example);

    int deleteByPrimaryKey(Integer histid);

    int insert(HistSignedTalentApplyDO record);

    int insertSelective(HistSignedTalentApplyDO record);

    List<HistSignedTalentApplyDO> selectByExample(HistSignedTalentApplyDOExample example);

    HistSignedTalentApplyDO selectByPrimaryKey(Integer histid);

    int updateByExampleSelective(@Param("record") HistSignedTalentApplyDO record, @Param("example") HistSignedTalentApplyDOExample example);

    int updateByExample(@Param("record") HistSignedTalentApplyDO record, @Param("example") HistSignedTalentApplyDOExample example);

    int updateByPrimaryKeySelective(HistSignedTalentApplyDO record);

    int updateByPrimaryKey(HistSignedTalentApplyDO record);
}