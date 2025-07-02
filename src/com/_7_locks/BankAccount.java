package com._7_locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=1000;
    private final Lock lock=new ReentrantLock();

    public void withdraw(int amount){
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        //some process that takes 3000 milliseconds
                        Thread.sleep(500);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                    balance=balance-amount;
                    System.out.println("Rs "+amount+" Withdrawn by thread "+Thread.currentThread().getName()+". Remaining balance: Rs"+ balance);
                }else{
                    System.out.println("Thread "+Thread.currentThread().getName()+" tried to withdraw but there is " +
                            "Insufficient balance");
                }
            }else{
                System.out.println("Thread "+Thread.currentThread().getName()+" tried acquiring lock " +
                        "after waiting for 1000 milliseconds " +
                        ". But could not acquire lock since the previous thread runs for 3000 milliseconds. " +
                        "Thus it will move on and not withdraw");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
        }
    }
}
