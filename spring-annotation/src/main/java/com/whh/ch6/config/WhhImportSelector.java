package com.whh.ch6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author whh
 * @date 2019/8/2
 */
public class WhhImportSelector implements ImportSelector{
    /**
     *
     * @param importingClassMetadata 当前标注@Import注解类的所有注解信息,
     *                               不止能获取到import注解,还能获取到其他注解
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.whh.ch6.bean.Fish","com.whh.ch6.bean.Tiger"};
    }
}
