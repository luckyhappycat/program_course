package com.crazy.java.ch09泛型.s95擦除和转换;
class Apple<T extends Number> {
    T size;
    public Apple() {
    }
    public Apple(T size) {
        this.size = size;
    }
    public void setSize(T size) {
        this.size = size;
    }
    public T getSize() {
        return this.size;
    }
}
public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<>(6);    // ①
        // a的getSize方法返回Integer对象
        Integer as = a.getSize();
        // 把a对象赋给Apple变量，丢失尖括号里的类型信息
        Apple b = a;      // ②
        // b只知道size的类型是Number
        Number size1 = b.getSize();
        // 下面代码引起编译错误
//		Integer size2 = b.getSize();  // ③
    }
}