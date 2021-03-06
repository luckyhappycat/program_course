package com.crazy.java.ch16多线程.s166线程通信.synchronizeds;
public class DepositThread extends Thread {
    // 模拟用户账户
    private Account account;
    // 当前取钱线程所希望存款的钱数
    private double depositAmount;
    public DepositThread(String name, Account account, double depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }
    // 重复100次执行存款操作
    @Override
    public void run() {
        for (var i = 0; i < 100; i++) {
            account.deposit(depositAmount);
        }
    }
}