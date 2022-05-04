package com.crazy.java.ch06面向对象.内部类67;
public class SubClass extends Out.In {
    //显示定义SubClass的构造器
    public SubClass(Out out) {
        //通过传入的Out对象显式调用In的构造器
        out.super("hello");
    }
}