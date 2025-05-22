package com.constractor;

public class Student {
	
		int rollNo;
		String name;

		public Student(int rollNo , String name) {
			this.name = name;
		this.rollNo = rollNo;
		}
		
			
	public void updateDetails(String name) 	{
		System.out.println(" old name "+ this.name);
		this.name = name;
		System.out.println("new name "+ this.name);
		
		
	}
	public void display() {
		System.out.println("Student name "+ name);
		System.out.println("student roll number "+ rollNo);
		

	}
public static void main(String[] args) {
	Student s = new Student( 2 , " Fayaz");
	s.display();
	s.updateDetails("rahul");
}

}
