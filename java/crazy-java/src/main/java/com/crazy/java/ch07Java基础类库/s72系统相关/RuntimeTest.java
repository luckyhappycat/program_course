package com.crazy.java.ch07Java基础类库.s72系统相关;

public class RuntimeTest {
    public static void main(String[] args) {
        // 获取Java程序关联的运行时对象
        var rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors());
        System.out.println("空闲内存数：" + rt.freeMemory());
        System.out.println("总内存数：" + rt.totalMemory());
        System.out.println("可用最大内存数：" + rt.maxMemory());
    }
}