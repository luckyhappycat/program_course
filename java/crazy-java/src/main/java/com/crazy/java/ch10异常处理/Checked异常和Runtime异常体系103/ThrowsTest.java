package com.crazy.java.ch10异常处理.Checked异常和Runtime异常体系103;
import java.io.*;
public class ThrowsTest {
    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("a.txt");
    }
}