package com.crazy.java.ch06面向对象.s64final修饰符;
public class FinalMethodTest {
    public final void test() {
    }
}
class Sub extends FinalMethodTest {
    // 下面方法定义将出现编译错误，不能重写final方法
//    public void test() {
//    }
}