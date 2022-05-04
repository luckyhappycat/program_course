package com.crazy.java.ch05面向对象.s54隐藏和封装.lee;
import com.crazy.java.ch05面向对象.s54隐藏和封装.lee.sub.Apple;
public class HelloTest {
    public static void main(String[] args) {
        var h = new Hello();
        // 使用类全名的写法
        var a = new Apple();
        // 如果使用import语句来导入Apple类后，就可以不再使用类全名
        var aa = new Apple();
    }
}