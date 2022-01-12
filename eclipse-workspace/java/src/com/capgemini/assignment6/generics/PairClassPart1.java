package com.capgemini.assignment6.generics;

public class PairClassPart1 {


		public static void main(String[] args) {
			
			Pair myObj=new Pair();
			
			myObj.setKey("1");
			myObj.setValue("Hello");
			
			myObj.show();
			
		}
		static class Pair{
			private String key;
			private String Value;
			
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return Value;
			}
			public void setValue(String value) {
				Value = value;
			}
			
			public void show() {
				System.out.println(getKey()+" "+getValue());
			}
		}
	

}
