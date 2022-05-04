package com.crazy.java.ch15输入输出.输入输出流体系154;
import java.io.*;
public class PrintStreamTest {
    public static void main(String[] args) {
        try (
                var fos = new FileOutputStream("test.txt");
                var ps = new PrintStream(fos)) {
            // 使用PrintStream执行输出
            ps.println("普通字符串");
            // 直接使用PrintStream输出对象
            ps.println(new PrintStreamTest());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}