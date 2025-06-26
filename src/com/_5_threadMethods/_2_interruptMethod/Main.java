package com._5_threadMethods._2_interruptMethod;
/*
 * Interrupt() Method: If the thread is sleeping wake it up!
 * Vice Versa wont work.
 * Wrong Example
 * */
public class Main extends Thread{
    @Override
    public void run() {
        System.out.println("Running an infinite loop:");
        for(;;)System.out.println(".");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.start();
        System.out.println("We are about to interrupt the thread...");
        m.interrupt();//Thread will be interrupted by the main thread
    }
}
