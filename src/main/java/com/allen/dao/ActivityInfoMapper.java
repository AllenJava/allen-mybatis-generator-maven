package com.allen.dao;

import com.allen.entity.ActivityInfo;
import com.allen.entity.ActivityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityInfoMapper {
    long countByExample(ActivityInfoExample example);

    int deleteByExample(ActivityInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityInfo record);

    int insertSelective(ActivityInfo record);

    List<ActivityInfo> selectByExample(ActivityInfoExample example);

    ActivityInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByExample(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByPrimaryKeySelective(ActivityInfo record);

    int updateByPrimaryKey(ActivityInfo record);
}