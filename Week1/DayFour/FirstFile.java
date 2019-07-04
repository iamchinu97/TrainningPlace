package com.sapient.week1.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstFile {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("File.csv"));
			BufferedWriter bw= new BufferedWriter(new FileWriter("File1.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
