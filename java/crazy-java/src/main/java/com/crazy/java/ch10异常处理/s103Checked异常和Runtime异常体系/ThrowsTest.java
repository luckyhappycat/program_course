package com.crazy.java.ch10异常处理.s103Checked异常和Runtime异常体系;
import java.io.*;
public class ThrowsTest {
    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("a.txt");
    }
}