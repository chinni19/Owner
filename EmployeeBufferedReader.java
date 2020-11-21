package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Id:");
		String str=br.readLine();
		int Id=Integer.parseInt(str);
		
		System.out.println("Enter your name:");
		String str1=br.readLine();
		
		System.out.println("Enter your total package:");
		String str2=br.readLine();
		int totalpackage=Integer.parseInt(str2);
		
		
		int sal=Integer.parseInt(str2);
		float basic=sal/100*40;
		float hra=sal/100*20;
		float da=sal/100*30;
		float pa=sal/100*10;
		float pf=sal/100*12;
		
		float total=basic+hra+da+pa-pf;
		float average=basic+hra+da+pa-pf/12;
		
		System.out.println("Enter total package:"+total);
		System.out.println("Enter total score:"+average);
		
	}

	}
