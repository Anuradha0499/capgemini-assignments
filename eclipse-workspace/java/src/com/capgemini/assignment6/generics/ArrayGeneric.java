package com.capgemini.assignment6.generics;

public class ArrayGeneric {


		public static void main(String[] args) {
			
			int[] arr= {11,22,33,55,44,66};
			
			change(arr,3,4);
			
			for(Integer i:arr) System.out.print(i+" ");

		}
		
		static void change(int[] arr,int x,int y) {
			if(x<0 || x>=arr.length || y<0 || y>=arr.length) System.out.println("invalid positions");
			
			else {
				int temp=arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
			}
		
	}

}
