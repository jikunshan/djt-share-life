package org.djt.share.life.db;

import org.junit.After;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "classpath:/config/spring-database.xml")
public class CaseTest extends AbstractJUnit4SpringContextTests {

	@Before
	public void init() {
		System.err.println("------------------------测试开始------------------------");
	}
	@After
	public void initAfter() {
		System.err.println("------------------------测试结束------------------------");
	}
}
