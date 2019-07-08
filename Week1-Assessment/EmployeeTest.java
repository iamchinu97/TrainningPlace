package com.sapient.week1.assessment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testForReadData() throws FileNotFoundException, IOException {
		EmployeeDAO employee= new EmployeeDAO();
		List<EmployeeBean> list=new ArrayList<EmployeeBean>();
		list.add(new EmployeeBean(18,"Rajat",50000));
		list.add(new EmployeeBean(21,"Chinmay",60000));
		list.add(new EmployeeBean(19,"Ajay",20000));
		list.add(new EmployeeBean(57, "Gurpal", 60000));
		Assert.assertArrayEquals(list.toArray(),employee.readData().toArray());
	}
	@Test
	void testforGetEmployee() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(new EmployeeBean(21,"Chinmay",60000),employee.getEmployee(21));
		Assert.assertEquals(new EmployeeBean(18,"Rajat",50000),employee.getEmployee(18));
	}
	@Test
	void testforGetTotSalary() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(190000.0, (double)employee.getTotSal(employee.readData()), 0.0000);
	}
	@Test
	void testforGetCount() throws FileNotFoundException, IOException
	{
		EmployeeDAO employee= new EmployeeDAO();
		Assert.assertEquals(2,employee.getCount(employee.readData(), 60000.0f));
	}

}
