package com.sapient.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public List<EmployeeBean> readData() throws FileNotFoundException,IOException
	{
		//Reading file from a system
		FileReader fr= new FileReader("C:\\Users\\chishimp\\Documents\\employee.csv");
		BufferedReader br = new BufferedReader(fr);
		List<EmployeeBean> listOfEmployee= new ArrayList<EmployeeBean>();
		String line="";
		//Going line by line in a file and create object of a EmployeeBean
		while((line=br.readLine())!=null)
		{
			String[] words=line.split(",");
			int id=Integer.parseInt(words[0]);
			String name= words[1];
			float salary=Float.parseFloat(words[2]);
			EmployeeBean employee= new EmployeeBean(id, name, salary);
			//Adding EmployeeBean objects to list
			listOfEmployee.add(employee);
		}
		fr.close();
		br.close();
		return listOfEmployee;
	}
	public float getTotSal(List<EmployeeBean> listOfEmployee)
	{
		float totalSalary=listOfEmployee.stream()
				.map((employee)->employee.getSalary())
				.reduce(0.0f, Float::sum);
		return totalSalary;
	}
	public long getCount(List<EmployeeBean> listOfEmployee,float Salary)
	{
		long employeeWithGivenSalary=listOfEmployee.stream()
				.filter(employee->employee.getSalary()==Salary)
				.count(); 
		
		return employeeWithGivenSalary;
	}
	public EmployeeBean getEmployee(int id) throws FileNotFoundException, IOException
	{
		List <EmployeeBean> listOfEmployeeBeans= new ArrayList<EmployeeBean>();
		listOfEmployeeBeans= this.readData();
		for(EmployeeBean eb : listOfEmployeeBeans)
		{
			if(eb.getId()==id)
			{
				return eb;
			}
		}
		return null;
	}
}
