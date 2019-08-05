package com.whh.ch5;

import com.whh.ch1.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch5Test {

    @Test
    public void test(){
        // 当申明IOC容器时
        ApplicationContext app = new AnnotationConfigApplicationContext(Ch5MainConfig.class);
        // 先去容器中拿到所有Person的定义,看容器现在有几个bean
        String[] beanNamesForType = app.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
        // 把所有bean打印出来,把所有对象和id放到Map里
        Map<String, Person> beansOfType = app.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

}
