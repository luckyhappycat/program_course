package com.crazy.java.ch10异常处理.s102异常处理机制;
import java.io.*;
public class AccessExceptionMsg {
    public static void main(String[] args) {
        try {
            var fis = new FileInputStream("a.txt");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}