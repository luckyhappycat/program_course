package com.crazy.java.ch06面向对象.s65抽象类;

public class CarSpeedMeter extends SpeedMeter {
    private double radius;

    public CarSpeedMeter(double radius) {
        this.radius = radius;
    }

    @Override
    public double calGirth() {
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        var csm = new CarSpeedMeter(0.34);
        csm.setTurnRate(15);
        System.out.println(csm.getSpeed());
    }
}