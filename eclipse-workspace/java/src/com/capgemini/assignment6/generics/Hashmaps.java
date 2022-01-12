package com.capgemini.assignment6.generics;
import java.util.*;
public class Hashmaps {
	
	

		public static void main(String[] args) {
			
			Map<Integer,Double> map=new HashMap<>();
			
			for(int i=0;i<10;i++) map.put(i+1, Math.random());
			
			for(int i=0;i<10;i++) System.out.println(map.keySet().toArray()[i]+" : "+map.get(map.keySet().toArray()[i]));

		}

	}


