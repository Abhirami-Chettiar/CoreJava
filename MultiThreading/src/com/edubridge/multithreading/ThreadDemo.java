package com.edubridge.multithreading;

public class ThreadDemo extends Thread{

	public void run() {
		System.out.println("Thread is in the running state :" + Thread.currentThread());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		for(int i=1;i<4;i++) {
			System.out.println(t1.getName()+" "+ t2.getName());
		}
		t1.start();
		t2.start();
	
}
}