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
		System.err.println(djtShareLifeUserMapper.selectByPrimaryKey(1l));
	}

}
