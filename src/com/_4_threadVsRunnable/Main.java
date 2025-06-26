package com._4_threadVsRunnable;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        Thread t=new Thread(b);
        t.start();
        for(;;){
            System.out.println("main");
            b.statement();
        }
    }
}
