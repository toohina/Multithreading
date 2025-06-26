package com._5_threadMethods._1_getAndSetPriority;

public class MyThread extends Thread{
    MyThread(String name){
        super(name); //Changing the name of the thread from thread-0 to something else.
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i+" "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
            //All have same priority. 10 priority is higher than 5 priority.
        }

    }

    public static void main(String[] args) {
        MyThread t1=new MyThread("Min Priority Thread");
        MyThread t2=new MyThread("Medium Priority Thread");
        MyThread t3=new MyThread("High Priority Thread");
        //setPriority usually gives hint to Scheduler and JVM that which thread should complete first.
        t1.setPriority(MIN_PRIORITY);//1
        t2.setPriority(NORM_PRIORITY);//5
        t3.setPriority(MAX_PRIORITY);//10
        t1.start();
        t2.start();
        t3.start();

    }
}
