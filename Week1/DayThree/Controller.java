package com.sapient.week1.day2;

public class Controller {
	public static void main(String[] args) {
		Model<Integer> m= new Model<Integer>();
		View v= new View();
		v.Read(m);
		DAO d= new DAO();
		d.compute(m);
		v.display(m);
		System.out.println(m.getNum1());
		m=null;
		System.gc();
	}
}
