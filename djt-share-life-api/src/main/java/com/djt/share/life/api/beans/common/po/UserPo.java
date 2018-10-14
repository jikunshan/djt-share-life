package com.djt.share.life.api.beans.common.po;

import com.djt.share.life.api.beans.base.BasePo;
import lombok.Data;

/**
 * Created by Administrator on 2018/10/8.
 */
@Data
public class UserPo extends BasePo {

    private Long usId;

    private String userName;

	public Long getUsId() {
		return usId;
	}

	public void setUsId(Long usId) {
		this.usId = usId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
