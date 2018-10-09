package com.djt.share.life.service.common.boot;

import com.djt.share.life.support.util.ClassLoaderUtils;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/10/8.
 */
public class ProviderBoot {
    private final static Logger logger = LoggerFactory.getLogger(ProviderBoot.class);

    public static void serverBoot() {
        PropertyConfigurator.configure(ClassLoaderUtils.getAbsolutePathByResource("config/log4j.properties").getPath());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-provider.xml"});
        context.start();
        logger.info("djt-share-life-service-common ProviderBoot startup.");
        while (true) {
            try {
                Thread.sleep(300000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        serverBoot();
    }
}
