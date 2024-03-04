package com.edubridge.creational;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SelectNetworkPlan s2 =new SelectNetworkPlan();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the network which you want to install : ");
		String networkName = sc.next();
		System.out.println("Enter the number of minutes : ");
		int min = sc.nextInt();
		CellularPlan p = s2.getPlan(networkName);
		System.out.println("Bill amount for the "+networkName+" mins "+min);
		
		p.getRate();
		p.processBill(min);
		
	}

}
