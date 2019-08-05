package com.whh.ch7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author whh
 * @date 2019/8/2
 */
@Component
public class WhhBeanPostProcessor implements BeanPostProcessor{
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..."+beanName+"--->"+bean);
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..."+beanName+"--->"+bean);
        return bean;
    }
}
