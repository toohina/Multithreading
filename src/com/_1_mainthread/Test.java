package com._1_mainthread;

public class Test {
    public static void main(String[] args){
        System.out.println("This program is to demonstrate that when Java program starts," +
                "one thread starts running immediately, called the main thread");
        System.out.println(Thread.currentThread().getName());
    }
}
