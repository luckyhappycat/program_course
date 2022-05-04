package com.crazy.java.ch07Java基础类库.s72系统相关;
public class ExecTest {
    public static void main(String[] args) throws Exception {
        var rt = Runtime.getRuntime();
        // 运行记事本程序
        rt.exec("notepad.exe");
    }
}