package com.crazy.java.ch15输入输出.s158Java9改进的对象序列化.transients;
public class Person implements java.io.Serializable {
    private String name;
    private transient int age;
    // 注意此处没有提供无参数的构造器!
    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }
    // 省略name与age的setter和getter方法
    // name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // age的setter和getter方法
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
}