package com.whh.ch7.config;

import com.whh.ch7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author whh
 * @date 2019/8/2
 */
@Configuration
@ComponentScan("com.whh.ch7.bean")
public class Ch7MainConfigOfLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("prototype")
    public Bike bike(){
        return new Bike();
    }
}
