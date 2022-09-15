package com.java8.feature;

import java.util.function.Consumer;
import java.util.List;

public class ConsumerPersonExample {

	static Consumer<Person> c1 = (p) -> System.out.println(p);

	static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());

	static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());

	static List<Person> personList = PersonRepo.getAllPerson();

	static  void printWithCondition() {
	//	personList.forEach()-> {
			
		//}
	}

	public static void main(String[] args) {

		// c1.accept(PersonRepo.getPersonDetails());
		// c2.accept(PersonRepo.getPersonDetails());
		// c3.accept(PersonRepo.getPersonDetails());

		c1.andThen(c2).andThen(c3).accept(PersonRepo.getPersonDetails());
	}

}
