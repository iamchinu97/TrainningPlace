package com.sapient.week1.day2;

import java.util.ArrayList;

import com.sapient.week1.Reader;

public class View {
	public void Read(Model<Integer> m)
	{
		m.setNum1(Reader.sc.nextInt());
		m.setNum2(Reader.sc.nextInt());
	}
	public void display(Model<Integer> m)
	{
		System.out.println(m.getNum1());
		System.out.println(m.getNum2());
		System.out.println("Ans ="+m.getNum3());
	}
}