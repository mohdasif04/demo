package com.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeesAdd {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Rahul", 11, "active", 1000));
		list.add(new Employee(2, "Rakesh", 12, "inactive", 600));
		list.add(new Employee(3, "Asif", 12, "inactive", 1600));
		list.add(new Employee(4, "Asif", 11, "active", 1200));
		list.add(new Employee(5, "Zahid", 15, "inactive", 1100));
		list.add(new Employee(6, "Meghana", 16, "inactive", 1300));
		list.add(new Employee(7, "Swarna", 16, "active", 1400));

		List<String> names = list.parallelStream().filter(e -> e.getSalary() > 1000).map(Employee::getEmapName)
				.distinct().collect(Collectors.toList());

		System.out.println("names ::: " + names);

		System.out.println("=====================================================================");
		Integer[] intnum = new Integer[] { 200, 14, 200, 36, 47, 96, 58, 100 };
		List<Integer> arr = Arrays.asList(intnum);

		System.out.println("=====================================================================");

		List<Integer> square = arr.stream().map(n -> n * n).filter(n -> n > 2000).distinct()
				.collect(Collectors.toList());
		System.out.println("square :: " + square);

		List<String> listOfName = list.stream().map(Employee::getEmapName).distinct().collect(Collectors.toList());

		List<Integer> allSalary = list.stream().map(Employee::getSalary).collect(Collectors.toList());

		System.out.println("List of Names :::: " + listOfName);

		System.out.println("List of Salary :::: " + allSalary);

		int totalSalary = list.stream().collect(Collectors.summingInt(Employee::getSalary));

		System.out.println("Total salary ::: " + totalSalary);

		Map<Integer, List<Employee>> byId = list.stream().collect(Collectors.groupingBy(Employee::getDeptId));

		System.out.println("By Id's  : " + byId);

		Set<String> set = list.stream().map(Employee::getEmapName).collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Employees names are sorted ::" + set);

		Optional<Employee> maxSalary = list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		System.out.println("Max Salary ::: " + maxSalary);

		/*
		 * Map<Integer, List<Employee>> workingInEachDept = list.stream()
		 * .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
		 * 
		 * workingInEachDept.entrySet().forEach(entry -> {
		 * System.out.println(entry.getKey() + " ============== " + entry.getValue());
		 * });
		 * 
		 * Map<Integer, Long> countingEmpByDept = list.stream()
		 * .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
		 * 
		 * countingEmpByDept.entrySet().forEach(entry -> {
		 * 
		 * System.out.println(entry.getKey() + "  ============================  " +
		 * entry.getValue());
		 * 
		 * });
		 * 
		 */

		System.out.println("=====================================================================");

		List<Integer> nums = Arrays.asList(3, 4, 1, 7, 8, 5, 9, 2);

		int even = nums.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		nums.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).forEach(x -> System.out.println(x));

		System.out.println("even :: " + even);

		int sumOfEvenNums = IntStream.of(4, 7, 9, 3, 6, 4).filter(x -> x % 2 == 0).sum();
		System.out.println("Sum of All even numbers ::: " + sumOfEvenNums);

		System.out.println("=====================================================================");
		System.out.println("=====================================================================");

		List<String> name = Arrays.asList("Marsh", "will", "conduct", "interview", "tomorrow");

		String nameStringJoiner = name.stream().map(Object::toString).collect(Collectors.joining("* "));
		System.out.println("the names of are ::: " + nameStringJoiner);

	}

}
