package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java_8_program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Riyaz", 10, 5500, "acitive"));
		list.add(new Employee(2, "Rahul", 20, 4500, "active"));
		list.add(new Employee(3, "Alex", 10, 4800, "inactive"));

		list.add(new Employee(4, "Max", 10, 6000, "active"));
		list.add(new Employee(5, "Mimi", 30, 4200, "active"));
		list.add(new Employee(6, "Jack", 20, 6300, "inactive"));
		list.add(new Employee(7, "Steve", 20, 3500, "active"));
		list.add(new Employee(8, "William", 30, 4500, "active"));

		System.out.println("List of Employee ::: " + list);

		Map<Integer, List<Employee>> groupByDeptId = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

		groupByDeptId.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + "-------------" + entry.getValue()));

		System.out.println("==================================================");

		Map<Integer, Long> empListBasedOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

		empListBasedOnDept.entrySet().forEach(
				empCountByDept -> System.out.println(empCountByDept.getKey() + " ------ " + empCountByDept.getValue())

		);

		System.out.println("===================================");

		Long empActiveList = list.stream().filter(empActive -> "active".equals(empActive.getStatus())).count();
		System.out.println("Active Employees ::: " + empActiveList);

		Long empInActiveList = list.stream().filter(empInActive -> "inactive".equals(empInActive.getStatus())).count();
		System.out.println("InActive Employees :::  " + empInActiveList);

		System.out.println("===================================");

		Optional<Employee> maxSal = list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Employee Max Salary :::: " + maxSal);

		Optional<Employee> minSal = list.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Employe Min Salary :::: " + minSal);

		System.out.println("==================================");

		Map<Integer, Optional<Employee>> highestSalOfDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		highestSalOfDept.entrySet().forEach(e -> System.out.println(e.getKey() + "----" + e.getValue()));
	}

}
