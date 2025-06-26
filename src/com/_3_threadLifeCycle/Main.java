package com._3_threadLifeCycle;

/*
Click on getState() or any build in function to see their definition
state is an enum in code base and it has the values:
NEW
RUNNABLE
BLOCKED
WAITING
TIME_WAITING
TERMINATED
*/
public class Main extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Thread always represents the thread of that function.
            //Have to make try catch because we cannot add throws to the run function
            //as Run is overriden from Runnable interface
            //So main thread is also sleeping and this thread is too.
        }catch(InterruptedException e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) throws InterruptedException {
        Main m=new Main();
        System.out.println(m.getState());//NEW
        m.start();
        System.out.println(m.getState());//RUNNABLE
        System.out.println(Thread.currentThread().getState());// MAIN THREAD IS RUNNABLE
        Thread.sleep(200);
        System.out.println(m.getState()); //TIME-WAITING
        System.out.println("Okay Okay");
        m.join(); //Waits for thread m to get terminated
        System.out.println(m.getState()); //TERMINATED
    }
}
