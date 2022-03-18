package com.list.test.programs;

public class Employee {
	private int id;
	private String eName;
	private int age;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String eName, int age, int salary) {
		super();
		this.id = id;
		this.eName = eName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", age=" + age + ", salary=" + salary + "]";
	}

}
