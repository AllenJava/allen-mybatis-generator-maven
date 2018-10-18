package com.allen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.allen.dto.ActivityInfoQueryDto;
import com.allen.entity.ActivityInfo;
import com.allen.service.ActivityInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
    
    @Autowired
    private ActivityInfoService activityInfoService;

	@Test
	public void contextLoads() {
	    
	    //test activity add
//	    ActivityInfo entity=new ActivityInfo();
//	    entity.setProjectId(4);
//	    entity.setActivityName("活动4");
//	    entity.setDescription("活动4描述");
//	    this.activityInfoService.add(entity);
	    
	    //test activity list query
	    ActivityInfoQueryDto queryDto=new ActivityInfoQueryDto();
	    queryDto.setProjectId(1);
	    queryDto.setActivityName("活动1");
	    queryDto.setStatus(0);
	    System.out.println(this.activityInfoService.list(queryDto));
	    
	    //test activity detail query
	    System.out.println(this.activityInfoService.detail(3));
	    
	    //test activity listByExample
	    ActivityInfoQueryDto queryDto2=new ActivityInfoQueryDto();
	    queryDto2.setStatus(1); 
	    System.out.println(this.activityInfoService.listByExample(queryDto2));
	}

}
