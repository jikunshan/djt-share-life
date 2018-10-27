package org.djt.share.life.db.model.dto;


import org.djt.share.life.db.dao.DjtShareLifeUserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DjtShareLifeUserMapperTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	DjtShareLifeUserMapper djtShareLifeUserMapper;
	
	@Test
	public void testMybatis() {
		System.err.println(djtShareLifeUserMapper.selectByPrimaryKey(1l));
	}
	
//	public static void main(String[] args) {
//		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DjtShareLifeUserMapper djtShareLifeUserMapper = applicationContext.getBean(DjtShareLifeUserMapper.class);
//		System.out.println(djtShareLifeUserMapper.selectByPrimaryKey(1l));
//	}
}
