package com.crazy.java.ch06面向对象.s66Java9改进的接口;
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (var t : target) {
            cmd.process(t);
        }
    }
}