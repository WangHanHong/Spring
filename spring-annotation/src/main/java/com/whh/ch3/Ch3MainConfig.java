package com.whh.ch3;

import com.whh.ch1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
public class Ch3MainConfig {

    @Bean
    public Person person02(){
        return new Person("james",20);
    }
}
