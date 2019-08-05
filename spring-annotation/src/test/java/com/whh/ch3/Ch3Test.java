package com.whh.ch3;

import com.whh.ch3.Ch3MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch3Test {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Ch3MainConfig.class);

        //从容器中获取bean的名称
        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Object person1 = app.getBean("person02");
        Object person2 = app.getBean("person02");
        System.out.println(person1 == person2);
    }
}
