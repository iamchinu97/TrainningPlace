package com.sapient.week1;

public class PrimeNumber {
	public static boolean checkPrime(long number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(14));
	}
}
