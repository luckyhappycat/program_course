package com.crazy.java.ch10异常处理.Java的异常跟踪栈105;
public class ThreadExceptionTest implements Runnable {
    @Override
    public void run() {
        firstMethod();
    }
    public void firstMethod() {
        secondMethod();
    }
    public void secondMethod() {
        var a = 5;
        var b = 0;
        var c = a / b;
    }
    public static void main(String[] args) {
        new Thread(new ThreadExceptionTest()).start();
    }
}