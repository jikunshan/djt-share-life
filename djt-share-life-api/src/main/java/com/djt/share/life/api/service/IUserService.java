package com.djt.share.life.api.service;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.vo.UserVo;

/**
 * Created by Administrator on 2018/10/8.
 */
public interface IUserService {
    /**
     * 获取指定用户信息
     *
     * @param userDto
     * @return
     */
    UserVo get(UserDto userDto);
}
