package com.crazy.java.ch06面向对象.Java9改进的接口66;
public class Computer {
    private Output out;

    public Computer(Output out) {
        this.out = out;
    }

    // 定义一个模拟获取字符串输入的方法
    public void keyIn(String msg) {
        out.getData(msg);
    }

    // 定义一个模拟打印的方法
    public void print() {
        out.out();
    }
}