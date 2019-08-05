package com.whh.ch2;

import com.whh.ch2.Ch2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch2Test {

    @Test
    public void test(){
        // 声明容器,将Ch2MainConfig的配置信息加载到容器中
        ApplicationContext app = new AnnotationConfigApplicationContext(Ch2MainConfig.class);

        // 从容器中获取bean定义的名称
        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        // 遍历打印名称
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
