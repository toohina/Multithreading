package com._2_creatingThread;

//Created a new class to create a thread
//Extend the Thread class

public class World extends Thread{
    /*
    Below is wrong:
    public void world(){
        for(;;)System.out.println("World");
    }
    Since you have to override the run() method of Thread class

    To see all the methods of the class Thread:
    -Right Click
    -Generate
    -Override methods
    */

    @Override
    public void run() { //Thread mei run kya karwana hai
        for(;;){
            System.out.println(Thread.currentThread().getName()); //Thread-0
            System.out.println("World");
        }
    }
}
