package com.sapient.week1.day5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class BigFile {

	public static void main(String[] args) throws IOException {
		File file= new File("file2.csv");
		FileWriter fw= new FileWriter(file);
		Random r= new Random();
		BufferedWriter bw = new BufferedWriter(fw,8192*115);
		FileOutputStream fo = new FileOutputStream(file);
		double bytes=file.length(); 
		double giga=bytes/(1024*1024*1024);
		String comma=",";
		System.out.println("File writing started");
		while(giga<4.2)
		{
			for(int i=0;i<500;i++)
				bw.write(String.valueOf(r.nextLong())+","+r.nextInt(60));
			bw.newLine();
			bytes=file.length(); 
			giga=bytes/(1024*1024*1024);
			System.out.println("writing........"+giga+"/4");
			
		}
		System.out.println("success");
		fo.close();
	}

}
