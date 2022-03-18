package com.optional.programs;

import java.util.Optional;

public class OptionalMethods {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[2] = "Lalith is a god boy";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	}

}
