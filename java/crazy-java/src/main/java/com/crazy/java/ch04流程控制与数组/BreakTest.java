package com.crazy.java.ch04流程控制与数组;
public class BreakTest {
    public static void main(String[] args) {
        // 一个简单的for循环
        for (var i = 0; i < 10; i++) {
            System.out.println("i的值是" + i);
            if (i == 2) {
                // 执行该语句时将结束循环
                break;
            }
        }
    }
}