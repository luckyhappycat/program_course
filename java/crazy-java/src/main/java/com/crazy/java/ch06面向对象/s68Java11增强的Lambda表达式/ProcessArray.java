package com.crazy.java.ch06面向对象.s68Java11增强的Lambda表达式;
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (var t : target) {
            cmd.process(t);
        }
    }
}