package com.crazy.java.ch05面向对象.s56类的继承;
public class Ostrich extends Bird {
    // 重写Bird类的fly()方法
    public void fly() {
        System.out.println("我只能在地上奔跑...");
    }
    public void callOverridedMethod() {
        // 在子类方法中通过super来显式调用父类被覆盖的方法。
        super.fly();
    }
    public static void main(String[] args) {
        // 创建Ostrich对象
        var os = new Ostrich();
        // 执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
        os.fly();
    }
}