package org.djt.share.life.db.model.dto;


import org.djt.share.life.db.CaseTest;
import org.djt.share.life.db.dao.DjtShareLifeUserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DjtShareLifeUserMapperTest extends CaseTest {
	
	@Autowired
	DjtShareLifeUserMapper djtShareLifeUserMapper;
	
	@Test
	public void testMybatis() {
		System.out.println(djtShareLifeUserMapper.selectByPrimaryKey(1l));
	}
	
//	public static void main(String[] args) {
//		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DjtShareLifeUserMapper djtShareLifeUserMapper = applicationContext.getBean(DjtShareLifeUserMapper.class);
//		System.out.println(djtShareLifeUserMapper.selectByPrimaryKey(1l));
//	}
}
