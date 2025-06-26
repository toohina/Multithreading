package com._2_creatingThread;

//This is the main thread
//Create a new class to create a thread
public class Hello {
    public static void main(String[] args) {

        //Create instance of the class that is made the thread for multithreading
        World world=new World();
        world.start(); //thread create karna hai
        for(;;){
            System.out.println(Thread.currentThread().getName()); //main
            System.out.println("Hello");
        }

        //When we run the program we see Hello and World are printed Randomly

        /*
        for(;;)System.out.println("You can't reach this if you keep the above infinite loop" +
                "Because: in a class all the other components/methods run sequentially" +
                "Hence, this can only be executed when the previous loop ends" +
                "Which it won't end" +
                "Hence giving an error and we are gonna keep this commented");
         */
    }
}
