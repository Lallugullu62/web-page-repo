package com.Static.methods.test;

public class MethodReference {
	public static void someThing() {
		System.out.println("Print Something ");
	}

	public static void main(String[] args) {
		Print p = MethodReference::someThing;
		p.print();
	}

}
