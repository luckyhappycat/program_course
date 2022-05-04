package com.crazy.java.ch06面向对象.s64final修饰符;
public class PrivateFinalMethodTest {
    private final void test() {
    }
}
class Sub1 extends PrivateFinalMethodTest {
    // 下面方法定义将不会出现问题
    public void test() {
    }
}