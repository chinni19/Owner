package com.app;

import java.util.Scanner;

public class StudentGrades {
	
	public static void main(String[] args) {
		
		int i,count,tm=0;
		float avg;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id=sc.nextInt();
		
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("enter your subjs:");
		count=sc.nextInt();
		
		System.out.println("Enter your totalmarks:");
		for(i=0;i<count;i++) {
			tm=tm+sc.nextInt();
		}
		avg=tm/count;
		if(avg>90) {
			System.out.println("grade O");
		}
		else if(avg>80) {
			System.out.println("grade A+");
		}
		else if(avg>70) {
			System.out.println("grade A");
		}
		else if(avg>60) {
			System.out.println("grade B");
		}
		else {
			System.out.println("failed");
			
		}
		
		}
		

	}


