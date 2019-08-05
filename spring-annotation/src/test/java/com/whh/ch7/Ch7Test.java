package com.whh.ch7;

import com.whh.ch7.bean.Bike;
import com.whh.ch7.config.Ch7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author whh
 * @date 2019/8/2
 */
public class Ch7Test {

    @Test
    public void test(){
        // 创建容器
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Ch7MainConfigOfLifeCycle.class);

        Bike bean = app.getBean(Bike.class);

        System.out.println("容器创建完成...");

        //单例模式下,当关闭的时候,调用destroy()方法
        //app.close();

    }
}
