package com.crazy.java.ch10异常处理.s102异常处理机制;
import java.io.*;
public class AutoCloseTest {
    public static void main(String[] args) throws IOException {
        try (
                // 声明、初始化两个可关闭的资源
                // try语句会自动关闭这两个资源。
                var br = new BufferedReader(
                        new FileReader("AutoCloseTest.java"));
                var ps = new PrintStream(new
                        FileOutputStream("a.txt"))) {
            // 使用两个资源
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }
    }
}