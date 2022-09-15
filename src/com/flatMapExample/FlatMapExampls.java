package com.flatMapExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExampls {

	public static void main(String[] args) {

		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		List<List<String>> playersInWorldCup2016 = new ArrayList<List<String>>();

		playersInWorldCup2016.add(teamPakistan);
		playersInWorldCup2016.add(teamAustralia);
		playersInWorldCup2016.add(teamEngland);
		playersInWorldCup2016.add(teamNewZeland);
		playersInWorldCup2016.add(teamSouthAfrica);
		playersInWorldCup2016.add(teamWestIndies);
		playersInWorldCup2016.add(teamSriLanka);
		playersInWorldCup2016.add(teamPakistan);

		List<String> listBeforeJava8 = new ArrayList<String>();

		for (List<String> team : playersInWorldCup2016) {
			for (String name : team) {
				listBeforeJava8.add(name);
			}
		}

		System.out.println("Player in the word cup 2016");
		System.out.println(listBeforeJava8);

		List<String> flatMapList = playersInWorldCup2016.stream().flatMap(pList -> pList.stream())
				.collect(Collectors.toList());

		System.out.println(flatMapList);

		System.out.println("+======================================================");

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		List<Integer> evenNums = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		List<Integer> squareNums = nums.stream().map(x -> x * x).filter(x -> x >= 49).collect(Collectors.toList());
		
		List<Integer> squareNums1 = nums.stream().filter(x -> x <= 5).map(x -> x * x).skip(2).collect(Collectors.toList());

		System.out.println(evenNums);
		System.out.println(squareNums);
		System.out.println(squareNums1);


	}

}
