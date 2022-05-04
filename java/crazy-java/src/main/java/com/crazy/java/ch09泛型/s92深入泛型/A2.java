package com.crazy.java.ch09泛型.s92深入泛型;
public class A2 extends Apple {
    // 重写父类的方法
    @Override
    public String getInfo() {
        // super.getInfo()方法返回值是Object类型，
        // 所以加toString()才返回String类型
        return super.getInfo().toString();
    }
}