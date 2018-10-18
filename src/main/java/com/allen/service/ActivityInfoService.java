package com.allen.service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allen.dao.ActivityInfoMapper;
import com.allen.dao.ext.ActivityInfoExtendMapper;
import com.allen.dto.ActivityInfoQueryDto;
import com.allen.entity.ActivityInfo;
import com.allen.entity.ActivityInfoExample;
import com.allen.entity.ActivityInfoExample.Criteria;

/**
 * 
* @ClassName: ActivityInfoService
* @Description: 活动信息业务类
* @author chenliqiao
* @date 2018年10月18日 下午12:02:29
*
 */
@Service
public class ActivityInfoService {
    
    @Resource
    private ActivityInfoMapper activityInfoMapper;
    
    @Resource
    private ActivityInfoExtendMapper activityInfoExtendMapper;
    
    /**
     * 新增
     */
    @Transactional
    public void add(ActivityInfo activityInfo){
        activityInfo.setCreateTime(new Date());
        this.activityInfoMapper.insertSelective(activityInfo);
    }
    
    /**
     * 查询列表
     */
    public List<ActivityInfo> list(ActivityInfoQueryDto queryDto){
        return this.activityInfoExtendMapper.selectByCondition(queryDto);
    }
    
    /**
     * 查询列表（Example方式实现）
     */
    public List<ActivityInfo> listByExample(ActivityInfoQueryDto queryDto){
        ActivityInfoExample example=new ActivityInfoExample();
        Criteria criteria=example.createCriteria();
        if(queryDto.getProjectId()!=null){
            criteria.andProjectIdEqualTo(queryDto.getProjectId());
        }
        if(queryDto.getActivityName()!=null && !Objects.equals(queryDto.getActivityName(),"")){
            criteria.andActivityNameLike(queryDto.getActivityName());
        }
        if(queryDto.getStatus()!=null){
            criteria.andStatusEqualTo(queryDto.getStatus());
        }
        return this.activityInfoMapper.selectByExample(example);
    }
    
    /**
     * 详情
     */
    public ActivityInfo detail(Integer activityId){
        return this.activityInfoMapper.selectByPrimaryKey(activityId);
    }   

}
