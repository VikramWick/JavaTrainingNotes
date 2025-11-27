package com.threads;

public class Thread1 extends Thread{
	String n1;
	int n;
	
	public Thread1() {
		n1 = "Vikram Industries";
		n = 10;
	}
	
	public Thread1(String n1, int n) {
		this.n1 = n1;
		this.n = n;
	}
	
	@Override
	public void run() {
		 for(int i=0;i<n;i++) {
			 System.out.println(n1+" ... "+i);
		 }
	}
}
 