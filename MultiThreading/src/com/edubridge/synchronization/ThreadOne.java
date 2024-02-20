package com.edubridge.synchronization;

public class ThreadOne extends Thread {
	SynchronizedMethod m1;

	public ThreadOne(SynchronizedMethod m) {
		super();
		this.m1 = m;
	}
	public void run() {
		m1.print(10);
	}

}
