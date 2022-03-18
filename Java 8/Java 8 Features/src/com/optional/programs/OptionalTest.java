package com.optional.programs;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String words[] = new String[10];
		Optional<String> oneWord = Optional.ofNullable(words[5]);
		if (oneWord.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		} else
			System.out.println("Nothing is there in string ");
	}

}
