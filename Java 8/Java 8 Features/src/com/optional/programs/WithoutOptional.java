package com.optional.programs;

import java.util.Optional;

public class WithoutOptional {
	public static void main(String[] args) {
		String words[] = new String[10];
		//Optional<String> oneWord = Optional.ofNullable(words[5]);
		String oneWord = words[5].toLowerCase();
		if (oneWord.contains("Lalith")) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		} else
			System.out.println("Nothing is there in string ");
		/*
		 * String[] words = new String[10]; String oneWord = words[5].toLowerCase();
		 * System.out.println(oneWord);
		 */
	}

}
