package com.crazy.java.ch05面向对象.s58继承与组合;

class Base {
    public Base() {
        test(); // 在父类构造器中调用将要被子类重写的方法
    }
    public void test() {
        System.out.println("将被子类重写的方法");
    }
}

public class Sub extends Base {
    private String name;
    public void test() {
        System.out.println("子类重写父类的方法，其name字符串长度" + name.length());
    }
    public static void main(String[] args) {
        // 下面代码会引发空指针异常
        var s = new Sub();
        // 当创建Sub对象时，先执行Base类的构造器，但Base()中调用了test()方法，这时是调用子类的test()方法。
        // 此时Sub对象的name是null，因此将引发空指针异常。
    }
}