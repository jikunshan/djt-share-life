package org.djt.share.life.db.client;

import java.util.Collection;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;

public class MultipleKeysTableShardingAlgorithmImpl implements SingleKeyDatabaseShardingAlgorithm {


	@Override
	public String doEqualSharding(Collection availableTargetNames, ShardingValue shardingValue) {

		System.err.println("---------------");
		return null;
	}

	@Override
	public Collection doInSharding(Collection availableTargetNames, ShardingValue shardingValue) {
		System.err.println("---------------");
		return null;
	}

	@Override
	public Collection doBetweenSharding(Collection availableTargetNames, ShardingValue shardingValue) {
		System.err.println("---------------");
		return null;
	}
    
}
