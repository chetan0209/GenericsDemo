package com.typesafety.demo;

public class Gen<T> {
	T ob;

	public Gen(T ob) {

		this.ob = ob;
	}
	public void show() {
		System.out.println("The Type of ob :"+ob.getClass().getName());
	}

	public T getOb() {
		return ob;
	}
}
