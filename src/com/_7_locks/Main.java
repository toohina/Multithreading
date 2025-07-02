package com._7_locks;

public class Main {
    public static void main(String[] args) {
        BankAccount SBI=new BankAccount();
        //Anonymous class
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                SBI.withdraw(50);
            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }
}
