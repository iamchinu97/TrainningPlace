package com.sapient.demo;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

public class SampleTest {
	
	 @BeforeClass  
	 public static void se() {               
		 System.out.println("ok");            
		 }  
	 
	 
	 @Test    
	 public void test() {       
		 System.out.println("test ok!");        
	 assertEquals(2, 2);   
	 }
}
