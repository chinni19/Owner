package com.app;

import java.util.Scanner;

public class StudentGradeMyPractice {
	public static void main(String[] args) {
		
	int marks[]=new int[5];
	int i;
	float total=0,avg;
	
	Scanner sc=new Scanner(System.in);
	
	for(i=0;i<5;i++) {
		System.out.println("enter to student marks"+(i+1)+":");
		marks[i]=sc.nextInt();
		total=total+marks[i];
	}
	sc.close();
	avg=total/5;
	System.out.println("Enter student grade:");
	
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
