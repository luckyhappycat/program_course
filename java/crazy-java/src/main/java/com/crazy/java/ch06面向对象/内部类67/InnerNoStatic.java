package com.crazy.java.ch06面向对象.内部类67;
public class InnerNoStatic {
    private class InnerClass {
        /*
        下面三个静态声明都将引发如下编译错误:
        非静态内部类不能有静态声明
        */
//        static {
//            System.out.println("==========");
//        }
//        private static int inProp;
//        private static void test() {
//        }
    }
}