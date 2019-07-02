package com.sapient.week1;

public class FigureToWords {
	public static String getWords(long amt)
	{
		String word="";
		String[] unit = {"","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {"","ten","twenty","thirty","fourty","fify","sixty","seventy","eighty","ninety"};
		
		String[] vunit= {"crores","lakhs","Thousands","Hundreads","only"};
		long[] nunit={10000000L,100000L,1000L,100L,1};
		for(int i=0;i<nunit.length;i++)
		{
			int n=(int)(amt/nunit[i]);
			amt=amt%nunit[i];
			if(n>0)
			{
				if(n>19)
				{
					word+=tens[n/10]+unit[n%10]+vunit[i];
				}
				else
				{
					word+=unit[n]+vunit[i];
				}
			}
		}
		return word;
	}
	
}
