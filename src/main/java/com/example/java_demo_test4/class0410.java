package com.example.java_demo_test4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class0410 {

	
	public static void main(String[] args) {
		
		Map<String , Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put(null, null);// String & Integer 的預設值都是 null  
		// 除了 int byte short long float(fales) double char boolean其他的型帶預設值都是 null 
		
		for(Entry<String, Integer> item:map.entrySet()) {
			
		}
		
		//treeMap 不允許 null鍵 但允許 null值
	}
}
