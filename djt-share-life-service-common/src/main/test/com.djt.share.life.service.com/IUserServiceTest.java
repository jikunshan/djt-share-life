package com.djt.share.life.service.com;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.vo.UserVo;
import com.djt.share.life.api.service.IUserService;
import com.djt.share.life.support.util.ClassLoaderUtils;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/10/8.
 */
public class IUserServiceTest {
    private ClassPathXmlApplicationContext context;
    IUserService iUserService;

    @Before
    public void before() {
        PropertyConfigurator.configure(ClassLoaderUtils.getAbsolutePathByResource("config/log4j.properties").getPath());
        context = new ClassPathXmlApplicationContext("classpath:spring/spring-provider.xml");
        iUserService = (IUserService) context.getBean("iUserServiceImpl");
    }


    @Test
    public void user() throws Exception {
        UserDto dto = new UserDto();
        dto.setUsId(4986408L);
        UserVo userVo = iUserService.get(dto);
        System.out.println(userVo.getUserName());
    }
}
