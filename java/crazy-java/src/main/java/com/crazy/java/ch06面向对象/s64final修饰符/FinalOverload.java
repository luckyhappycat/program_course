package com.crazy.java.ch06面向对象.s64final修饰符;
public class FinalOverload {
    // final修饰的方法只是不能被重写，完全可以被重载
    public final void test() {
    }
    public final void test(String arg) {
    }
}