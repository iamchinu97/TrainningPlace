package com.sapient.week1;

public class Student {
	public void add(float a,float b)
	{
		System.out.println("Type casted or long arguments");
		System.out.println(a+b);
	}
	public void add(int a,float b)
	{
		System.out.println("Type casted or int, float arguments");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.add(2, 2);
	}

}
