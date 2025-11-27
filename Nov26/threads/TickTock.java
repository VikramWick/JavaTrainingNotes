package com.threads;


class Chat {
    boolean isTickTurn = true; // Flag to track whose turn it is
    public synchronized void printTick() {
        if (!isTickTurn) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.print("Tick ");
        isTickTurn = false;
        notify();
    }

    public synchronized void printTock() {
        if (isTickTurn) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Tock ");
        isTickTurn = true;
        notify();
    }
}
class Tick implements Runnable{
    Chat c1;
    Tick(Chat c){this.c1=c;};
    public void run(){
        for(int i=0;i<=10;i++){
            c1.printTick();
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
    }

class Tock implements Runnable{
    Chat c2;
    Tock(Chat c){this.c2=c;};
    public void run(){
        for(int i=0;i<=10;i++){
            c2.printTock();
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}   
        }
        }
    }
public class TickTock {
    public static void main(String[] args) {
        Chat c=new Chat();
        Runnable r1=new Tick(c);
        Runnable r2=new Tock(c);

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
    
}
