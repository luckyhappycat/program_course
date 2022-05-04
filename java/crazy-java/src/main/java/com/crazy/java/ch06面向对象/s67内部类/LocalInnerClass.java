package com.crazy.java.ch06面向对象.s67内部类;
public class LocalInnerClass {
    public static void main(String[] args) {
        // 定义局部内部类
        class InnerBase {
            int a;
        }
        // 定义局部内部类的子类
        class InnerSub extends InnerBase {
            int b;
        }
        // 创建局部内部类的对象
        var is = new InnerSub();
        is.a = 5;
        is.b = 8;
        System.out.println("InnerSub对象的a和b实例变量是：" + is.a + "," + is.b);
    }
}