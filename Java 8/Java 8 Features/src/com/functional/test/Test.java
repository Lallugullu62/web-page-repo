package com.functional.test;

public class Test {

	public static void main(String[] args) {

		/*
		 * FunctionalInterTest ft = () -> { System.out.println("Hello World "); };
		 * ft.lalithPrint();
		 */
		
		Company co = new Company();
		String address = co.employeeCompany().employeeAddress().originalAddress();
		System.out.println(address);
	}
}
