package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentOld {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter a id:");
		String s=br.readLine();
		int id=Integer.parseInt(s);
		
		/*System.out.println("Enter a name:");
		String s1=br.readLine();
		int name=Integer.parseInt(s1);*/
		
		System.out.println("Enter a Sub1:");
		String s2=br.readLine();
		int sub1=Integer.parseInt(s2);
		
		System.out.println("enter a sub2:");
		String s3=br.readLine();
		int sub2=Integer.parseInt(s2);
		
		System.out.println("enter a sub3:");
		String s4=br.readLine();
		int sub3=Integer.parseInt(s2);	
		
		
		int total=sub1+sub2+sub3;
		float average=total/3*100;
		
		System.out.println("Enter total marks:"+total);
		System.out.println("Enter total score:"+average);
		
	}
		
	}
		
	   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    