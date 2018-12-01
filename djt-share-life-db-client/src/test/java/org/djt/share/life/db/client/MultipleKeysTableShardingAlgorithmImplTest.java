package org.djt.share.life.db.client;

import org.djt.share.life.db.CaseTest;
import org.djt.share.life.db.dao.DjtShareLifeUserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MultipleKeysTableShardingAlgorithmImplTest extends CaseTest{ 

	@Autowired
	DjtShareLifeUserMapper djtShareLifeUserMapper;
	
	@Test
	public void testMybatis() {
		 System.err.println(djtShareLifeUserMapper.selectByPrimaryKey(4l));  
//		 DjtShareLifeUser record = new DjtShareLifeUser();
//		 record.setUserId(3l);
//		 record.setCreateTime(new Date());
//		 record.setUserName("asdddd");
//		 record.setEnabled(true);
//		 record.setEmail("sad@sad.com");
//		 record.setPassword("1234");
//		 record.setUpdateTime(new Date());
//		 record.setStatus(true);
//		 System.err.println("-----"+djtShareLifeUserMapper.insert(record)+"-----");
	}

}
