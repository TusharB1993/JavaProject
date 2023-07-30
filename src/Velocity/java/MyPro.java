package Velocity.java;

import java.util.HashMap;
import java.util.Set;

public class MyPro {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(01, "Mohan");
		hashmap.put(02,"Rosahn");
		hashmap.put(03, "leela");
		Set<Integer> map = hashmap.keySet();
		
		for(int i:map) {
			System.out.println("Key=="+i);
			System.out.println("Value== "+hashmap.get(i));
			
		}
		
	}

}
