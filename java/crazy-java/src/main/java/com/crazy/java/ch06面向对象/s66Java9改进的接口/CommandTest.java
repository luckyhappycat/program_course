package com.crazy.java.ch06面向对象.s66Java9改进的接口;
public class CommandTest {
    public static void main(String[] args) {
        var pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        // 第一次处理数组，具体处理行为取决于PrintCommand
        pa.process(target, new PrintCommand());
        System.out.println("------------------");
        // 第二次处理数组，具体处理行为取决于SquareCommand
        pa.process(target, new SquareCommand());
    }
}