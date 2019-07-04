package com.sapient.week1.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.sapient.week1.Reader;

public class EmployeeFile {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter query");
		String query= Reader.sc.nextLine();
		//System.out.println(query);
		String[] splitQuery= query.split(" ");
		FileReader file=new FileReader("C:\\Users\\chishimp\\Documents\\"+splitQuery[3]+".csv");
		BufferedReader br = new BufferedReader(file);
		String line = null;
		String[] result= new String[50];
		int linenum=0;
		System.out.println(splitQuery[1]);
		String[] comQuery= splitQuery[1].split(",");
		line=br.readLine();
		//System.out.println(line);
		String[] fields=line.split(",");
		while((line=br.readLine())!=null) {
			//System.out.println(line);
			result[linenum]="";
			String[] lineSplit=line.split(",");
			for(int j=0;j<comQuery.length;j++) { 
				for(int i=0;i<fields.length;i++)
				{
					if(comQuery[j].equals(fields[i])) 
					{
						result[linenum]=result[linenum]+lineSplit[i]+" "; 
					} 
				} 
			}
			linenum++;
		} 	
		for(int i=0;i<linenum;i++) { 
			System.out.println(result[i]); 
		}
		br.close();
		file.close();
	}
}
