package com.crazy.java.ch07Java基础类库.s71与用户互动;
public class ArgsTest {
    public static void main(String[] args) {
        // 输出args数组的长度
        System.out.println(args.length);
        // 遍历args数组的每个元素
        for (var arg : args) {
            System.out.println(arg);
        }
    }
}