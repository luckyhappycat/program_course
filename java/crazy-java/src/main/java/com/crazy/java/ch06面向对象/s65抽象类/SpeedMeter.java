package com.crazy.java.ch06面向对象.s65抽象类;

public abstract class SpeedMeter {
    // 转速
    private double turnRate;

    public SpeedMeter() {
    }

    // 把计算车轮周长的方法定义成抽象方法
    public abstract double calGirth();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    // 定义计算速度的通用算法
    public double getSpeed() {
        // 速度等于 周长 * 转速
        return calGirth() * turnRate;
    }
}