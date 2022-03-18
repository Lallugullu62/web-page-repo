package com.stream.test;

public class EmployeeList {
	private int id;
	private String name;
	private String compName;
	private double salInLakhs;

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

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public double getSalInLakhs() {
		return salInLakhs;
	}

	public void setSalInLakhs(double d) {
		this.salInLakhs = d;
	}

	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", compName=" + compName + ", salInLakhs=" + salInLakhs
				+ "]";
	}

}
