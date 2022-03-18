package com.list.test.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		List<EmployeeTest> list = new ArrayList<>();
		list.add(new EmployeeTest(1, "liquidweb.com", 80000));
		list.add(new EmployeeTest(2, "linode.com", 90000));
		list.add(new EmployeeTest(3, "digitalocean.com", 120000));
		list.add(new EmployeeTest(4, "aws.amazon.com", 200000));
		list.add(new EmployeeTest(5, "mkyong.com", 1));

		// key = id, value - websites
		Map<Integer, String> result1 = list.stream()
				.collect(Collectors.toMap(EmployeeTest::getId, EmployeeTest::getName));

		System.out.println("Result 1 : " + result1);

		// key = name, value - websites
		Map<String, Long> result2 = list.stream()
				.collect(Collectors.toMap(EmployeeTest::getName, EmployeeTest::getWebsites));

		System.out.println("Result 2 : " + result2);
		Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));

		System.out.println("Result 3 : " + result3);
	}

}
