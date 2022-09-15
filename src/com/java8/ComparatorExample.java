package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {

	public static void main(String[] args) {

		String s1 = "asif";
		s1.concat("ahmad");
		System.out.println("s1.. " + s1);

		List<String> list1 = List.of("aa", "aa1", "aa2", "aa4", "aa6", "aa5");

		System.out.println("list.... :: " + list1);

		System.out.println("=====================================================");

		List<Integer> listInteger = Arrays.asList(7, 1, 2, 3, 5, 4, 6);

		List<Integer> resultStream = listInteger.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println("result of stream :: " + resultStream);

		// it will through exception bcoz List.of is a immutable
		// list1.add(0, "aa4");
		System.out.println("list.... :: " + list1);
		/*
		 * Comparator<Integer> comparator = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return
		 * o1.compareTo(o2); } };
		 * 
		 * System.out.println("comparator :: " + comparator.compare(15, 15));
		 * 
		 * Comparator<Integer> java8Comparator = (Integer x, Integer y) ->
		 * x.compareTo(y); System.out.println("compairing with java 8 :: " +
		 * java8Comparator.compare(50, 50));
		 */

		List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
		System.out.println("Original list : " + cities);
		List<String> names = cities.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("names :: .. " + names);

		System.out.println("=====================================================");

		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		List<List<String>> playersInWorldCup2016 = new ArrayList<List<String>>();
		playersInWorldCup2016.add(teamIndia);
		playersInWorldCup2016.add(teamAustralia);
		playersInWorldCup2016.add(teamEngland);
		playersInWorldCup2016.add(teamNewZeland);

		playersInWorldCup2016.add(teamSouthAfrica);
		playersInWorldCup2016.add(teamWestIndies);
		playersInWorldCup2016.add(teamSriLanka);
		playersInWorldCup2016.add(teamPakistan);

		// Read more:
		// https://www.java67.com/2016/03/how-to-use-flatmap-in-java-8-stream.html#ixzz7Lz5MOV6o

	}
}
