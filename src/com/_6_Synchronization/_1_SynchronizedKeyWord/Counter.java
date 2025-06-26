package com._6_Synchronization._1_SynchronizedKeyWord;

//SYNCHRONIZED FUNCTIONS: DONT allow a thread to access the contents of the function if another
//thread is working on the shared resources.

public class Counter {
    private int count=0;
    //CRITICAL SECTION: Part where shared resources are used
    public synchronized void increment(){
        count++;
        //RACE CONDITION: When we don't use synchronized on a critical section, we get a race condition
        //MUTUAL EXCLUSION: We achieve it by using synchronized on race condition so that threads dont access
        //shared resources at same time.
        //Mutual exclusion assures that multiple threads cannot access the critical section simultaneously.
    }
    public int getCount(){
        return count;
    }
}
