package com._4_threadVsRunnable;

//If B already extends A then it cannot extend Thread class too
//Since Java does not support multiple inheritance
public class B extends A implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println("B");
        }
    }
}
