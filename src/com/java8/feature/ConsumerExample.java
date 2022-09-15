package com.java8.feature;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> cons = (s)-> System.out.println(s.toUpperCase());
		cons.accept("asif");
		
		Consumer<String> cons1 = (s)-> System.out.println(s.toLowerCase());
		cons1.accept("asif");
		
		cons.andThen(cons1).accept("feature");
	}
}
