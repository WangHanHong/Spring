package com.whh.ch6.config;

import com.whh.ch6.bean.Pig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @author whh
 * @date 2019/8/2
 */
public class WhhFactoryBean implements FactoryBean<Pig>{
    @Nullable
    @Override
    public Pig getObject() throws Exception {
        return new Pig();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Pig.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
