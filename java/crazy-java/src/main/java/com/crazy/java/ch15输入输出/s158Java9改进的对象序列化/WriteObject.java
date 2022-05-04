package com.crazy.java.ch15输入输出.s158Java9改进的对象序列化;
import java.io.*;
/**
 * 下面程序使用ObjectOutputStream将一个Person对象写入磁盘文件。
 * @author mzk
 */
public class WriteObject {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输出流
                var oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            var per = new Person("孙悟空", 500);
            // 将per对象写入输出流
            oos.writeObject(per);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}