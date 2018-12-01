package org.djt.share.life.db.client;

import java.util.Collection;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

@SuppressWarnings("rawtypes")
public class ComplexTableShardingAlgorithm implements PreciseShardingAlgorithm {

	



	@Override
	public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {
		System.err.println("-----------2---------");
		return null;
	}


}
