package com.constractor;

public class Employee {
String name;
double salary;
public Employee(String name , double salary) {
	this.name = name;
	this.salary=salary;
	
			
}
public void setSalry(String name , double salary ) {
	this.name = name;
	this.salary=salary;
	
	
}
public String toString() {
 return "employe name :"+ name +"\nemploye salary :"+salary; 
}
public static void main(String[] args) {
	Employee em = new Employee("Fayaz ",350000);
	System.out.println(em);
	 
	 em.setSalry("rahul", 400000);
	System.out.println(em);
	
	
	
	
	
}
}
