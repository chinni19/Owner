package com.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		
		Student stu=new Student();
		System.out.println("class name:"+stu.getClass());
		
		Class c=stu.getClass();
		
		//cal variables or fields
		Field[] variablesList=c.getDeclaredFields();
		for(Field f:variablesList) {
			System.out.println("Student Fields:"+f);
		}
		//cal Methods 
		Method[] methodsList=c.getDeclaredMethods();
		for(Method m:methodsList) {
			System.out.println("Student Methods:"+m);
		}
		//cal constructors
		Constructor[] con=c.getDeclaredConstructors();
		for(Constructor c1:con) {
			System.out.println("Return Constructors:"+c1);
		}
	}
	
	}