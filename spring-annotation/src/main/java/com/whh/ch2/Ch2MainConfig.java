package com.whh.ch2;

import com.whh.ch1.Person;
import com.whh.ch2.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author whh
 * @date 2019/8/2
 */
//includeFilters = {
//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
//        }
@Configuration
@ComponentScan(value = "com.whh.ch2")
public class Ch2MainConfig {

    @Bean
    public Person person01(){
        return new Person("kobe",11);
    }

}
