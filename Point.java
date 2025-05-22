package com.constractor;

public class Point {
int x;
int y;

public Point (int x , int y) {
	this.x  = x;
	this.y=y;
	
}
public void print () {
	System.out.println("value of x is ="+this.x +"\n value of y is ="+this.y);

}

public static void main(String[] args) {
	Point p = new Point(20, 30);
	p.print();
}
}
