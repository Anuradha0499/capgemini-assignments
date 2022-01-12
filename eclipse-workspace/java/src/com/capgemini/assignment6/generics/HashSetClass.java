package com.capgemini.assignment6.generics;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
public static void main(String[] args) {
		
		
		Employee ob1=new Employee(1001, "Mishti", 50000, "CSE");
		Employee ob2=new Employee(1002, "Anu", 60000, "ECM");
		Employee ob3=new Employee(1003, "Arjun", 40000, "ECE");
		Employee ob4=new Employee(1004, "Zensor", 150000, "ME");
		
		Set<Employee> set=new HashSet<>();
		set.add(ob1);
		set.add(ob2);
		set.add(ob3);
		set.add(ob4);
		
		for(Employee i:set) i.displayDetails();
		
		
	}
	
	static class Employee{
		int id;
		String name;
		int salary;
		String department;
		
		
		
		public Employee(int id, String name, int salary, String department) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.department = department;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void displayDetails() {
			System.out.println(getId()+" "+getName()+" "+getSalary()+" "+getDepartment());

		}
	}


}
