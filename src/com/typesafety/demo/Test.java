package com.typesafety.demo;

public class Test {
public static void main(String[] args) {
	Gen<String> g1=new Gen<String>("Durga");
	g1.show();
	System.out.println(g1.getOb());
	
	//
	Gen<Integer> i1=new Gen<Integer>(10);
	i1.show();
	System.out.println(i1.getOb());
	//
	Gen<Double> d1=new Gen<Double>(10.10);
	d1.show();
	System.out.println(d1.getOb());
}
}
