package com.crazy.java.ch05面向对象.s52方法详解;
public class Overload {
    public void test() {
        System.out.println("无参数");
    }
    //重载
    public void test(String msg) {
        System.out.println("重载的test方法 " + msg);
    }
    public static void main(String[] args) {
        var ol = new Overload();
        ol.test();
        ol.test("hello");
    }
}