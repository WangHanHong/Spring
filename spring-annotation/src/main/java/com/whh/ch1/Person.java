package com.whh.ch1;

import org.springframework.stereotype.Component;

/**
 * todo 插件lombok包下的注解使用
 * @author whh
 * @date 2019/8/2
 */
@Component
public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
