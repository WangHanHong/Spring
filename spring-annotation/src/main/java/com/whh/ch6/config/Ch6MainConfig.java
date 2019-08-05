package com.whh.ch6.config;

import com.whh.ch1.Person;
import com.whh.ch6.bean.Cat;
import com.whh.ch6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
@Import({Cat.class, Dog.class,WhhImportSelector.class,WhhImportBeanDefinitionRegistrar.class})
public class Ch6MainConfig {

    @Bean
    public Person person(){
        return new Person("james",20);
    }

    @Bean
    public WhhFactoryBean whhFactoryBean(){
        return new WhhFactoryBean();
    }

}
