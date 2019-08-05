package com.whh.ch7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author whh
 * @date 2019/8/2
 */
@Component
public class Jeep {
    public Jeep(){
        System.out.println("Jeep...Constructor...");
    }
    /**
     * 对象创建并赋值后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("Jeep...init...");
    }

    /**
     * 容器移除对象之前回调通知,销毁bean
     */
    @PreDestroy
    public void destroy(){
        System.out.println("Jeep...Destroy...");
    }
}
