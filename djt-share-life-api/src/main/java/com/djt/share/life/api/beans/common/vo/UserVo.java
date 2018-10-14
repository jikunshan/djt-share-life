package com.djt.share.life.api.beans.common.vo;

import com.djt.share.life.api.beans.common.po.UserPo;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018/10/8.
 */
@NoArgsConstructor
public class UserVo extends UserPo {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserVo(String userName) {
        super.setUserName(userName);
    }
}
