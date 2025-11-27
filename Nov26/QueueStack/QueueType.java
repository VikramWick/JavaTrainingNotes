package com.QueueStack;

import java.util.Scanner;

public class QueueType {
    Integer arr[];
    int fe=-1;
    int re=-1;
    public QueueType(){
        arr=new Integer[10];
    }
    public QueueType(int n){
        arr=new Integer[n];
    }

    private boolean isEmpty(){
        if(re==-1 && fe==-1){
            return true;
        }
        else{
            return false;
        } 
    }

    private boolean isFull(){
        if(re==arr.length-1) return true;
        else return false;
    }

    private void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(fe==-1){
            fe=0;
        }
        re++;
        arr[re]=data;
    }

    private void dequeue(int data){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        if(fe==re){
            fe=-1;
            re=-1;
        }
        fe++;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the size of queue");
        int n=new Scanner(System.in).nextInt();
    }
}
