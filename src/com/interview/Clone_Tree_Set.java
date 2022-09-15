package com.interview;

import java.util.TreeSet;

public class Clone_Tree_Set {

	public static void main(String[] args) {

		TreeSet<String> tree_set = new TreeSet<String>();

		tree_set.add("Monday");
		tree_set.add("Tuesday");
		tree_set.add("Wednesday");
		tree_set.add("Thursday");
		tree_set.add("Friday");
		tree_set.add("Saturday");
		tree_set.add("Sunday");

		System.out.println("normal tree set :: " + tree_set);

		TreeSet<String> clone_tree_set = (TreeSet<String>) tree_set.clone();

		System.out.println("Clone tree set ::: " + clone_tree_set);

	}

}
