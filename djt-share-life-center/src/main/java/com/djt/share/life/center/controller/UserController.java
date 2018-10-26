package com.djt.share.life.center.controller;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.vo.UserVo;
import com.djt.share.life.api.beans.core.Result;
import com.djt.share.life.api.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "restIUserService")
    private IUserService iUserService;

    @RequestMapping(value = "/001", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(@RequestBody UserDto dto) {
        //TODO 合法性校验
        UserVo userVo = iUserService.get(dto);
        if (null != userVo) {
            //TODO 更换为统一异常处理提醒+编码
            throw new RuntimeException("该用户名已被注册,请更换!");
        }
        return Result.create(iUserService.save(dto)).toApiRestult();
    }
}
