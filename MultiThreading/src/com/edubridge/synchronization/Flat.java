package com.edubridge.synchronization;

public class Flat {
	public void print(int num) {
		synchronized(this)
		{
			for(int i=0;i<5;i++) {
				System.out.println(i*num);
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}

}
