package com._6_Synchronization._2_SynchronizedBlock;

//SYNCHRONIZED BLOCK

public class Counter {
    private int count=0;
    public void increment(){
        System.out.println("Thread entering function: "+Thread.currentThread().getName());
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName()+" updated count to: "+this.getCount());
        }
    }
    public int getCount(){
        return count;
    }
}
