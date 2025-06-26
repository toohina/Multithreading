package com._6_Synchronization._2_SynchronizedBlock;


public class Main {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();
        //using join so that we get the count only after both thread finish updating count.
        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
//output without synchronized(should not have capital s) function: 1764
//Because there is a possibility that t1, t2 access count together and increment it together by 1.
//Instead of incrementing it EACH by 1 resulting in an increment of 2.


//Output with synchronized:2000