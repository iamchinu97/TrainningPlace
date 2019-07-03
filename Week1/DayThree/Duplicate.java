package com.sapient.week1.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.sapient.week1.Reader;

public class Duplicate { 
	public static void main(String[] args) {
		LinkedHashSet<Integer> arr= new LinkedHashSet<Integer>();
		System.out.println("Enter the size of Array:");
		int size=Reader.sc.nextInt();
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
		{
			arr.add(Reader.sc.nextInt());
		}
		Iterator<Integer> itr=arr.iterator();  
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
	}
}
