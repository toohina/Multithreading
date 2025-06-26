package com._5_threadMethods._1_getAndSetPriority;

/*THREAD METHODS:
run
start
sleep
join
getPriority
setPriority
 */

public class Intro extends Thread{

    Intro(String name){
        super(name); //Changing the name of the thread from thread-0 to something else.
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
        //All have same priority. 10 priority is higher than 5 priority.
        }

    }

    public static void main(String[] args) {
        Intro introThread=new Intro("Jallaad");
        introThread.start();
    }
}
