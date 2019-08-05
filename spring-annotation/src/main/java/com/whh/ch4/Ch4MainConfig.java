package com.whh.ch4;

import com.whh.ch1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
public class Ch4MainConfig {

    @Bean
    public Person person(){
        System.out.println("给容器中添加person");
        return new Person("james",20);
    }
}
