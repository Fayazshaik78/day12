package com.constractor;

public class Box{
	int length;
	
	public Box (int length ) {
		this.length = length;
		
	}
	public  Box setLength(int length) {
		this.length = length;
		return this;
		
	}
	public void display () {
		System.out.println("print lenghth "+ this.length);
	}
	public static void main(String[] args) {
		Box b = new Box(2);
		b.setLength(22).display();
		System.out.println("........after update .........");
		Box b1 = new Box(4);
		b.setLength(6).display();

		
	}
}

