package com.constractor;

public class Prodect {
	int id;
	double price;
public Prodect(int id , double price ) {
	this.id=id;
	this.price=price;
	
}
public boolean isSame(Prodect p) {
	return this.id == p.id;
}
public static void main(String[] args) {
	Prodect pr = new Prodect(200, 22.0);
	Prodect pr1 = new Prodect(30, 33.3);
	Prodect pr3 = new Prodect(200, 22.4);
	
	System.out.println("prodect 1 is eqal to  prodect 2 "+ pr.isSame(pr1));
	System.out.println("prodect 1 is eqaul to prodect 3 "+ pr.isSame(pr3));
	
}
	
}

