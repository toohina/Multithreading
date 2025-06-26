package com._5_threadMethods._2_interruptMethod;

/*
* Interrupt() Method: If the thread is sleeping wake it up!
* Vice Versa wont work.
* Correct Example
* */
public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Thread is put to sleep...");
            sleep(5000);
            System.out.println("Thread woke up from sleep");
        }catch(InterruptedException e){
            System.out.println("Thread got interrupted...");
        }
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("We are about to interrupt the thread...");
        myThread.interrupt();//Thread will be interrupted by the main thread
    }
}
