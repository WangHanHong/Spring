package com.whh.ch7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author whh
 * @date 2019/8/5
 */
@Component
public class Plane implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    public Plane(){
        System.out.println("Plane...Constructor...");
    }

    /**
     * 对象创建并赋值之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("Plane...@PostConstructor");
    }

    /**
     * 容器移除对象之前回调通知,销毁bean
     */
    @PreDestroy
    public void destroy(){
        System.out.println("Plane...@PreDestroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 容器初始化,将applicationContext传进来,那么其他方法就可以使用到IOC容器了
        // 这个功能是ApplicationContextAwareProcess做的
        this.applicationContext = applicationContext;
    }
}
