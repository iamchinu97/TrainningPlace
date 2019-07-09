package com.sapient.demo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.*;

public class EmployeeTest {
	List<EmployeeBean> list;
	static EmployeeDAO employee;
	static Sample sample;
	static List<EmployeeBean> listOfEmployee;
	@BeforeClass
	public static void setup() throws NumberFormatException, IOException
	{
		employee = new EmployeeDAO();
		System.out.println("Inside before");
		FileReader fr= new FileReader("C:\\Users\\chishimp\\Documents\\employee.csv");
		BufferedReader br = new BufferedReader(fr);
		listOfEmployee= new ArrayList<EmployeeBean>();
		String line="";
		//Going line by line in a file and create object of a EmployeeBean
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			String[] words=line.split(",");
			int id=Integer.parseInt(words[0]);
			String name= words[1];
			float salary=Float.parseFloat(words[2]);
			EmployeeBean employee1= new EmployeeBean(id, name, salary);
			//Adding EmployeeBean objects to list
			listOfEmployee.add(employee1);
		}
		//employee=Mockito.mock(EmployeeDAO.class);
		sample= Mockito.mock(Sample.class);
		Mockito.when(sample.myFunc()).thenReturn(listOfEmployee);
	}
	@Test
	public void testForReadData() throws FileNotFoundException, IOException {
		Assert.assertArrayEquals(sample.myFunc().toArray(),employee.readData().toArray());
	}
	@Test
	public void testforGetEmployee() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(new EmployeeBean(21,"Chinmay",60000),employee.getEmployee(21));
		Assert.assertEquals(new EmployeeBean(18,"Rajat",50000),employee.getEmployee(18));
	}
	@Test
	public void testforGetTotSalary() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(190000.0, (double)employee.getTotSal(employee.readData()), 0.0000);
	}
	@Test
	public void testforGetCount() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(2,employee.getCount(employee.readData(), 60000.0f));
	}

}
