package com.capgemini.assignment6.generics;
import java.util.*;
public class PairClassPart2 {
	
	

		public static void main(String[] args) {
			
			Pair myObj=new Pair();
			
			myObj.setKey("Today is: ");
			myObj.setValue(new Date());
			
			myObj.show();
			
		}
		static class Pair{
			private String key;
			private Date Value;
			
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			
			public Date getValue() {
				return Value;
			}
			public void setValue(Date value) {
				Value = value;
			}
			public void show() {
				System.out.println(getKey()+" "+getValue());
			}
		}
	

}
