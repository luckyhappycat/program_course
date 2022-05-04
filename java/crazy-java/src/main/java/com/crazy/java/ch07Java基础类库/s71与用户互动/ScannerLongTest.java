package com.crazy.java.ch07Java基础类库.s71与用户互动;
import java.util.*;
public class ScannerLongTest {
    public static void main(String[] args) {
        // System.in代表标准输入，就是键盘输入
        var sc = new Scanner(System.in);
        // 判断是否还有下一个long型整数
        while (sc.hasNextLong()) {
            // 输出输入项
            System.out.println("键盘输入的内容是：" + sc.nextLong());
        }
    }
}