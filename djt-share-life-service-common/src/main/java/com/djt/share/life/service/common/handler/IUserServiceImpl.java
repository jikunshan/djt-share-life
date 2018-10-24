package com.djt.share.life.service.common.handler;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.vo.UserVo;
import com.djt.share.life.api.service.IUserService;
import com.djt.share.life.orm.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/8.
 */
@Service("restIUserService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public UserVo get(UserDto userDto) {
        return userMapper.selectUserInfo(userDto);
    }
}
