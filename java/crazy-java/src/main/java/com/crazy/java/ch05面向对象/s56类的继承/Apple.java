package com.crazy.java.ch05面向对象.s56类的继承;
public class Apple extends Fruit {
    public static void main(String[] args) {
        // 创建Apple对象
        var a = new Apple();
        // Apple对象本身没有weight成员变量
        // 因为Apple的父类有weight成员变量，也可以访问Apple对象的weight成员变量
        a.weight = 56;
        // 调用Apple对象的info()方法
        a.info();
    }
}