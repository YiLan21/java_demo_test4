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
		map.put(null, null);// String & Integer ���w�]�ȳ��O null  
		// ���F int byte short long float(fales) double char boolean��L�����a�w�]�ȳ��O null 
		
		for(Entry<String, Integer> item:map.entrySet()) {
			
		}
		
		//treeMap �����\ null�� �����\ null��
	}
}
