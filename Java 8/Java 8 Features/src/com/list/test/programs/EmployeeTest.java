package com.list.test.programs;

public class EmployeeTest {

	private int Id;
	private String name;
	private long websites;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "EmployeeTest [Id=" + Id + ", name=" + name + ", websites=" + websites + "]";
	}

	public EmployeeTest(int id, String name, long websites) {
		super();
		Id = id;
		this.name = name;
		this.websites = websites;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {
		this.websites = websites;
	}

}
