package com.Static.methods.test;

import java.util.function.BiFunction;

public class MethodRefTest {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> addition = ArithmeticTest::add;
		int sum = addition.apply(10, 20);
		System.out.println(sum);
	}

}
