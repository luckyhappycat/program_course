package com.crazy.java.ch05面向对象.s53成员变量和局部变量;
public class ScopeTest3 {
    public static void main(String[] args) {
        // 定义一个代码块局部变量作为循环变量
        for (var i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}