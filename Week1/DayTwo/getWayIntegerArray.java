package com.sapient.week1;

public class getWayIntegerArray {

	public static void main(String[] args) {
		System.out.println("Enter Array Size :");
		String size=Reader.sc.nextLine();
		//Creating reference for integerArray object
		integerArray ia;
		//checking if user entered size or not
		if(size.isEmpty())
		{
			ia=new integerArray();
			System.out.println("Size Not entered: default size: "+ ia.size);
		}
		else
		{
			System.out.println("Array Size entered : "+ size);
			ia=new integerArray(Integer.valueOf(size));
		}
		System.out.println("Enter array:");
		//Taking array input
		ia.setArr();
		
		//Sorting the Array
		ia.sortArr();
		System.out.println("Which number you want to Search?");
		int key=Reader.sc.nextInt();
		
		//Searching the Key inside array
		System.out.println("Element at: "+ia.searchArr(key));
		//Finding average value of array
		System.out.println("Average : "+ia.avgArr());
		
		//Copy constructor called
		integerArray ia2=new integerArray(ia);
		System.out.println("Object2 = ");
		ia2.getArr();
	}

}
