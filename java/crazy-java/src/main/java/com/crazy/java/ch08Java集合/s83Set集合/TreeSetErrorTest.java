package com.crazy.java.ch08Java集合.s83Set集合;
import java.util.*;
class Err {
}
public class TreeSetErrorTest {
    public static void main(String[] args) {
        var ts = new TreeSet();
        // 向TreeSet集合中添加Err对象
        // 自然排序时，Err没实现Comparable接口将会引发错误
        ts.add(new Err());
    }
}