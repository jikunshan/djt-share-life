package com.djt.share.life.center.controller;

import com.alibaba.fastjson.JSONObject;
import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2018/10/8.
 */
@Controller
@RequestMapping("/test")
public class IndexController {

    @Resource(name = "restIUserService")
    private IUserService iUserService;

    @RequestMapping(value = "index", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String index() {
        return "欢迎进入共享生活接口测试!";
    }


    @RequestMapping(value = "dubbo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String dubbo() {
        System.out.println("dubbo接口调用测试,测试结果>>>" + iUserService.get(new UserDto()));
        System.out.println(1 / 0);
        return JSONObject.toJSONString(iUserService.get(new UserDto()));
    }


}