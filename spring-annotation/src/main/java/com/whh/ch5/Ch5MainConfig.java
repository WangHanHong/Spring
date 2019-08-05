package com.whh.ch5;

import com.whh.ch1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
public class Ch5MainConfig {

    @Bean
    public Person person(){
        System.out.println("给容器中添加person...");
        return new Person("person",20);
    }

    @Bean
    @Conditional({})
    public Person lison(){
        System.out.println("给容器中添加lison...");
        return new Person("lison",30);
    }

    @Conditional({})
    @Bean
    public Person james(){
        System.out.println("给容器中添加james...");
        return new Person("james",30);
    }
}
