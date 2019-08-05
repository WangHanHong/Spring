package com.whh.ch6.config;

import com.whh.ch6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author whh
 * @date 2019/8/2
 */
public class WhhImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition1 = registry.containsBeanDefinition("com.whh.ch6.bean.Dog");
        boolean definition2 = registry.containsBeanDefinition("com.whh.ch6.bean.Cat");
        if (definition1&&definition2) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",beanDefinition);
        }
    }
}
