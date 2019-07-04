package com.sapient.week1.day4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeData {
	public static void main(String[] args) {
		Map<Integer,Set<String>> ob = new LinkedHashMap<Integer, Set<String>>();
		ob.put(101, new LinkedHashSet<String>());
		ob.get(101).add("BE");
		ob.get(101).add("ME");
		ob.get(101).add("MEEE");
		System.out.println(ob.keySet());
		System.out.println(ob.values());
	}
}
