package com.app;

import java.util.Scanner;

public class StudentNew {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		
		System.out.println("Enter your name:");
		String str=sc.next();
		
		System.out.println("Enter your subject1:");
		int subject1=sc.nextInt();
		
		System.out.println("Enter your subject2:");
		int subject2=sc.nextInt();
		
		
		int total=subject1+subject2;
		float average=total/2*100;
		
		System.out.println("Enter your total marks:"+total);
		System.out.println("Enter your average:"+average);
		
	}

}
