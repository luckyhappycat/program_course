package com.crazy.java.ch14注解Annotation.JDK的元注解142;
public class MyTest {
    // 使用@Test修饰info方法
    @Testable
    public void info() {
        System.out.println("info方法...");
    }
}