package com.sapient.week1.day2;

public class Model <T>{
	private T num1;
	private T num2;
	private T num3;
	public T getNum1() {
		return num1;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public T getNum2() {
		return num2;
	}
	public void setNum2(T num2) {
		this.num2 = num2;
	}
	public T getNum3() {
		return num3;
	}
	public void setNum3(T num3) {
		this.num3 = num3;
	}
	public void finalize()
	{
		num1=null;num2=null;num3=null;
		System.out.println("overriden");
	}
}
