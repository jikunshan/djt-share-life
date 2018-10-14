package com.djt.share.life.center.interceptor;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.djt.share.life.api.beans.core.Result;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理
 * Created by Administrator on 2018/10/8.
 */
@Slf4j
@Component
public class ShareLifeExceptionResolver implements HandlerExceptionResolver {

    @Resource(name = "messageConverter")
    private FastJsonHttpMessageConverter messageConverter;

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception exception) {
        ModelAndView modelAndView = new ModelAndView();
        log.warn("统一异常捕获", exception);
        HttpOutputMessage outputMessage = new ServletServerHttpResponse(httpServletResponse);
        try {
            messageConverter.write(Result.createFail("600060082999999", exception.getMessage()).toApiRestult(), MediaType.APPLICATION_JSON, outputMessage);
        } catch (Exception e) {
            log.error("[djt-share-life-center]  CONVER  FAIL", e);
        }
        return modelAndView;
    }
}
