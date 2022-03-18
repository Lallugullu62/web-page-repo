package com.stream.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<EmployeeList> empDetails = new ArrayList<EmployeeList>();
		EmployeeList emp1 = new EmployeeList();
		emp1.setId(101);
		emp1.setName("Lalith");
		emp1.setCompName("HCL");
		emp1.setSalInLakhs(9.0);
		EmployeeList emp2 = new EmployeeList();
		emp2.setId(105);
		emp2.setName("Srinu");
		emp2.setCompName("LNT");
		emp2.setSalInLakhs(10.0);
		EmployeeList emp3 = new EmployeeList();
		emp3.setId(103);
		emp3.setName("Surya");
		emp3.setCompName("LNT");
		emp3.setSalInLakhs(9.0);
		EmployeeList emp4 = new EmployeeList();
		emp4.setId(104);
		emp4.setName("Durga");
		emp4.setCompName("CTS");
		emp4.setSalInLakhs(8.5);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		empDetails.add(emp4);
		System.out.println(empDetails);
		empDetails = empDetails.stream().filter(e -> e.getCompName() == "LNT").collect(Collectors.toList());
		System.out.println(empDetails);
	}

}
