package com.whh.ch1;

import lombok.Data;

/**
 * todo 插件lombok包下的注解使用
 * @author whh
 * @date 2019/8/2
 */
@Data
public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
