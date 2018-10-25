package com.djt.share.life.center.controller;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.core.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2018/10/24.
 */
@Controller
@RequestMapping("/login")
public class LoginController {


    @RequestMapping(value = "/001", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> login(@RequestBody UserDto dto) {
        return Result.create(null).toApiRestult();
    }
}
