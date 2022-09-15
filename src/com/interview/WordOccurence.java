package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurence {

	public static void main(String[] args) {

		String str = "welcome to decode welcome to decode decode to here";

		List<String> list = Arrays.asList(str.split(" "));

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

	}

}