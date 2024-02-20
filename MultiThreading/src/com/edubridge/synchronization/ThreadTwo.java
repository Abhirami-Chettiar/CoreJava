package com.edubridge.synchronization;

public class ThreadTwo extends Thread{
	SynchronizedMethod m2;

	public ThreadTwo(SynchronizedMethod m) {
		super();
		this.m2 = m;
	}
	public void run() {
		m2.print(10);
	}
	

}
