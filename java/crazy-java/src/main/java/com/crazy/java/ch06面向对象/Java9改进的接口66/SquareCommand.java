package com.crazy.java.ch06面向对象.Java9改进的接口66;
public class SquareCommand implements Command {
    @Override
    public void process(int element) {
        System.out.println("数组元素的平方是:" + element * element);
    }
}