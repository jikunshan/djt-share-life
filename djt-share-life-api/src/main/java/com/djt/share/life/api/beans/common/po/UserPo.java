package com.djt.share.life.api.beans.common.po;

import com.djt.share.life.api.beans.base.BasePo;

/**
 * Created by Administrator on 2018/10/8.
 */
public class UserPo extends BasePo {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
