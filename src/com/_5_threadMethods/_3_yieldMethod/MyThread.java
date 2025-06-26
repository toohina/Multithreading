package com._5_threadMethods._3_yieldMethod;

/*
YIELD: Does nothing but tell the Scheduler that you can give time to the other threads.
 */
public class MyThread extends Thread{
        MyThread(String name){
            super(name);
        }
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" is running.");
                Thread.yield();
            }
        }

        public static void main(String[] args) {
            MyThread t1=new MyThread("t1");
            MyThread t2 =new MyThread("t2");
            t1.start();
            t2.start();
        }
}
//WITHOUT YIELD
//t2 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t2 is running.
//t2 is running.
//t2 is running.
//t1 is running.
//t1 is running.
//t1 is running.
//t1 is running.
//t2 is running.
//t2 is running.
//t2 is running.
//t2 is running.
//t1 is running.
//t1 is running.
//t1 is running.
//t1 is running.
//t1 is running.


//WITH YIELD
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
//t1 is running.
//t2 is running.
