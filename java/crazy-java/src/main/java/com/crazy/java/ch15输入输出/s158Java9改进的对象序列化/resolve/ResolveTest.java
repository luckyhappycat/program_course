package com.crazy.java.ch15输入输出.s158Java9改进的对象序列化.resolve;
import java.io.*;
public class ResolveTest {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输入流
                var oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("transient.txt"))) {
            oos.writeObject(Orientation.HORIZONTAL);
            var ori = (Orientation) ois.readObject();
            System.out.println(ori == Orientation.HORIZONTAL);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}