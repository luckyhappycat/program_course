package com.crazy.java.ch06面向对象.s61包装类;
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // 直接把一个基本类型变量赋给Integer对象
        Integer inObj = 5;
        // 直接把一个boolean类型变量赋给一个Object类型的变量
        Object boolObj = true;
        // 直接把一个Integer对象赋给int类型的变量
        int it = inObj;
        if (boolObj instanceof Boolean) {
            // 先把Object对象强制类型转换为Boolean类型，再赋给boolean变量
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }
    }
}