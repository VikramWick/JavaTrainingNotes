package com.threads;

public class Thread1Main {
    public static void main(String[] args) throws Exception{
        Thread1 th=new Thread1();
        Thread1 th1=new Thread1("check1",10);
        Thread1 th2=new Thread1("check2",15);

        th.start();
        th1.start();
        th2.start();

        th.join();
        th1.join();
        th2.join();
    }

    
    
}
