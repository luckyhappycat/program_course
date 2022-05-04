package com.crazy.java.ch08Java集合.s88操作集合的工具类Collections;
import java.util.*;
public class SynchronizedTest {
    public static void main(String[] args) {
        // 下面程序创建了四个线程安全的集合对象
        var c = Collections.synchronizedCollection(new ArrayList());
        var list = Collections.synchronizedList(new ArrayList());
        var s = Collections.synchronizedSet(new HashSet());
        var m = Collections.synchronizedMap(new HashMap());
    }
}