package com.crazy.java.ch06面向对象.Java9改进的接口66;
public class PrintCommand implements Command {
    @Override
    public void process(int element) {
        System.out.println("迭代输出目标数组的元素:" + element);
    }
}