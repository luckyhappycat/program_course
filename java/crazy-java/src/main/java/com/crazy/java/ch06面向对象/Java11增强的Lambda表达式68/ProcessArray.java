package com.crazy.java.ch06面向对象.Java11增强的Lambda表达式68;
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (var t : target) {
            cmd.process(t);
        }
    }
}