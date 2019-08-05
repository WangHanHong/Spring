package com.whh.ch1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
public class MainConfig {

    @Bean("abcPerson")
    public Person person01(){
        return new Person("james",20);
    }


}
