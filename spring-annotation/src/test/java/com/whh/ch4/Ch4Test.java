package com.whh.ch4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch4Test {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Ch4MainConfig.class);
        System.out.println("IOC的容器创建完成...");
        app.getBean("person");
    }
}
