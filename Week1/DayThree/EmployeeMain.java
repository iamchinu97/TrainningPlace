/**
 * 
 */
package com.sapient.week1.day2;

import java.util.ArrayList;

import com.sapient.week1.Reader;


public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(420, "Rajat", 22));
		listOfEmployee.add(new Employee(612, "Ajay", 23));
		listOfEmployee.add(new Employee(323, "Siddhant", 25));
		listOfEmployee.add(new Employee(543, "Chinmay", 21));
		System.out.println("Enter Employee id to search");
		int id= Reader.sc.nextInt();
		
		
	}
}
