package com.crazy.java.ch15输入输出.s158Java9改进的对象序列化.resolve;
import java.io.*;
public class Orientation implements java.io.Serializable {
    public static final Orientation HORIZONTAL = new Orientation(1);
    public static final Orientation VERTICAL = new Orientation(2);
    private int value;
    private Orientation(int value) {
        this.value = value;
    }
    // 为枚举类增加readResolve()方法
    private Object readResolve() throws ObjectStreamException {
        if (value == 1) {
            return HORIZONTAL;
        }
        if (value == 2) {
            return VERTICAL;
        }
        return null;
    }
}