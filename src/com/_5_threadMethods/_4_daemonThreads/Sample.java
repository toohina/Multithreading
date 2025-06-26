package com._5_threadMethods._4_daemonThreads;

/*
USER THREADS: They are the threads that handle business logic.
They need to be completed before the program ends.
Example: MyThread t= new MyThread(); //without setting it to daemon
and main Thread

DAEMON THREADS: These threads do not need to be completed before program ends.
If all the user threads of the program finish executing then the
program closes or ends automatically irrespective of the completion/ incompletion of daemon thread.
Example: Garbage collector in Java.
 */
public class Sample extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I am a daemon thread.");
        }
    }

    public static void main(String[] args) {
        Sample s=new Sample();
        s.setDaemon(true);
        s.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("I am user thread.");
        }
    } // The program ends the moment the user thread completes 10 iterations and reaches the end.
    //without waiting for the daemon thread to finish executing (infinite loop
    // so the program should have not ended)
}
