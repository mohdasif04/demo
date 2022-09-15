package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingNumbers {

	public static void main(String[] args) {

		int total = 0;

		for (int num = 0; num <= 50; num++) {
			total = total + num;
		}

		System.out.println("total ::: " + total);

		int totalWithJava8 = IntStream.rangeClosed(0, 50).map(Integer::new).sum();

		System.out.println("total using java8 :: " + totalWithJava8);

		List<String> names = Arrays.asList("asif", "riyaz", "zahed", "asif");

		List<String> uniqueName = new ArrayList<>();

		for (String name : names) {
			if (!uniqueName.contains(name)) {
				uniqueName.add(name);
			}
		}

		System.out.println("unique names ::: " + uniqueName);

		List<String> uniqueName1 = names.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueName1 :: " + uniqueName1);

		List<String> startsWithA = names.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());

		List<String> startsWithA1 = names.stream().distinct().filter(s -> s.endsWith("d"))
				.collect(Collectors.toList());

		System.out.println("starts with A1 :: " + startsWithA1);

		System.out.println("starts With A ::: " + startsWithA);

	}

}
