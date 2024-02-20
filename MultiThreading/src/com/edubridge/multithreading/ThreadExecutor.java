package com.edubridge.multithreading;

public class ThreadExecutor implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("Thread "+i+" "+Thread.currentThread());
		}
		
		
	}
	public static void main(String[] args) {
		ThreadExecutor t1 = new ThreadExecutor();
		ThreadExecutor t2 = new ThreadExecutor();
		t1.run();
		t2.run();
	}

	

}
