package com.app;

public class Student {
	private int sid;
	private String sname;
	private String scourse;
	
	public Student(int sid, String sname, String scourse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
	
	
	
}