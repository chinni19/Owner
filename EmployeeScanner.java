package com.app;

import java.util.Scanner;

public class EmployeeScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Id:");
		int id=sc.nextInt();
		
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter your totalpackage:");
		float totalpackage=sc.nextFloat();
		
		System.out.println("Enter basic sal:");
		Float bsal=sc.nextFloat();
		bsal=(bsal/100)*40;
	
		System.out.println("Enter your hra:");
		Float hra=sc.nextFloat();
		hra=(hra/100)*20;
		
		System.out.println("Enter your da:");
		Float da=sc.nextFloat();
		da=(da/100)*30;
		
		System.out.println("enter your pa");
		Float pa=sc.nextFloat();
		pa=(pa/100)*10;
		
		System.out.println("Enter your pf:");
		Float pf=sc.nextFloat();
		pf=(pf/100)*12;
		
		float totalPack=bsal+hra+da+pa-pf;
		float msal=bsal+hra+da+pa-pf/12;
		
		System.out.println("Enter your totalpack:"+totalPack);
		System.out.println("Enter your toatlscore:"+msal);

	}

}
