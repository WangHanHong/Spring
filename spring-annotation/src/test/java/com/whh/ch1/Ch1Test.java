package com.whh.ch1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch1Test {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) app.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test01(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);

        // "person()"方法名默认为bean的id
        // 如何修改bean的id值:
        //     1.直接将person()修改成person01(),此时bean的id为person01
        //     2.直接在MainConfig类的@Bean("你要的bean名字")
        String[] beanNamesForType = app.getBeanNamesForType(Person.class);
        for (String beanName : beanNamesForType) {
            System.out.println(beanName);
        }
    }

}
