package com._6_Synchronization._2_SynchronizedBlock;


public class MyThread extends Thread{
    private Counter counter;
    MyThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)counter.increment();
    }
}
