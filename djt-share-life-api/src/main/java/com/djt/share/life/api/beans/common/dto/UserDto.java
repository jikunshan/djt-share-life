package com.djt.share.life.api.beans.common.dto;

import com.djt.share.life.api.beans.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018/10/8.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class UserDto extends BaseDto {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8464680643767299068L;
	/**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 验证码
     */
}
