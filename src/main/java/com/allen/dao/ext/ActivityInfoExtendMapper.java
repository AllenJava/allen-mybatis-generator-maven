package com.allen.dao.ext;

import java.util.List;

import com.allen.dto.ActivityInfoQueryDto;
import com.allen.entity.ActivityInfo;

/**
 * 
* @ClassName: ActivityInfoExtendMapper
* @Description: 活动信息拓展Mapper
* @author chenliqiao
* @date 2018年10月18日 上午11:58:26
*
 */
public interface ActivityInfoExtendMapper {
    
    /**
     * 条件查询
     */
    List<ActivityInfo> selectByCondition(ActivityInfoQueryDto queryDto);
    
}