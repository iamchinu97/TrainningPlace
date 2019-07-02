package com.sapient.week1;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class integerArray {
	int size;
	private int arr[];
	public integerArray() {
		this.size=5;
		arr = new int[5];
	}
	public integerArray(int size) {
		arr = new int[size];
		this.size=size;
	}
	public integerArray(integerArray obj) {
		this.arr=obj.arr;
		this.size=obj.size;
	}
	public void setArr() {
		for(int i=0;i<this.size;i++)
		{
			this.arr[i]=Reader.sc.nextInt();
		}
	}
	public int avgArr()
	{
		int sum=0;
		for(int i=0;i<this.size;i++)
			sum+=this.arr[i];
		
		return sum/this.size;
	}
	public String searchArr(int key)
	{
		int index=Arrays.binarySearch(this.arr,key);
		if(index>0)
			return String.valueOf(index);
		else
			return "Not found";
	}
	public void getArr() {
		for(int i=0;i<this.size;i++)
		{
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
	public void sortArr() {
		Arrays.sort(this.arr);
		getArr();
	}
}
