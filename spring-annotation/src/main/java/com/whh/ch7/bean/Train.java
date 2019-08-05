package com.whh.ch7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author whh
 * @date 2019/8/2
 */
@Component
public class Train implements InitializingBean,DisposableBean{
    public Train() {
        System.out.println("Train...Constructor...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Train...DisposableBean...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train...InitializationBean...");
    }
}
