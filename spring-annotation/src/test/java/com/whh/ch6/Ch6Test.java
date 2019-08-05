package com.whh.ch6;

import com.whh.ch6.config.Ch6MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch6Test {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Ch6MainConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Object whhFactoryBean = app.getBean("whhFactoryBean");
        System.out.println(whhFactoryBean);

        Object bean = app.getBean("&whhFactoryBean");
        System.out.println(bean);
    }
}
