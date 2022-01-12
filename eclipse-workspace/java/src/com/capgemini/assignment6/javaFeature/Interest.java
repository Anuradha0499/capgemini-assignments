package com.capgemini.assignment6.javaFeature;

 interface Interest {
	
		double calc(double a,double b,int c);
		}
 
		 class Simpleintrest{
			
		public static void main(String[] args) {
		var F=600000;
		var rate=7;
		var time=4;
		Interest i=(var a, var b, var c)->(a*b*c)/100;
		System.out.println(i.calc(F,rate,time));
		}
		}


