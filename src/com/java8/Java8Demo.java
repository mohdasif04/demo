package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Demo {
	public static void main(String[] args) {

		int total = IntStream.rangeClosed(0, 50).filter(x -> x % 2 != 0).map(Integer::new).sum();

		System.out.println("total sum of first 50 nums ::: " + total);

		List<String> names = Arrays.asList("asif", "ahmad", "dan");

		List<String> uniqueValue = new ArrayList<String>();

		// Before java 8
		for (String name : names) {
			if (!uniqueValue.contains(name)) {
				uniqueValue.add(name);
			}
		}
		System.out.println("names :::" + uniqueValue);

		// After java 8

		List<String> uniqueList = names.stream().distinct().collect(Collectors.toList());

		System.out.println("unique List :: " + uniqueList);
		
		// Project StudentRecords
		
		//Entity class Students.class
		//Repository interface StudentRepo.class
		
		// public interface StudentRepo extends JpaRepository<Integer> { }
		
		// Service class Student Service
								
		
				//				@RestController
		// Student Controller  Student.class
	/*	@getMapping("/student")
		public ResponseEntity<Student> getStudent() {
		Student st = studentrepo.findAll();
		return new ResponseEntity<>(e.getName(), HttpStatus.ok);
		}
		
		@GetMapping("/student/{sId}")
		public ResponseEntity<Student> getStudentRecordsById(@PathVariable("sId") Integer id) {
			
			Optional<Student> stById = StudentRepo.findById(id);
			if(!stById.isEmpty()) {
				Optional<Student> name = Optional.ofNullable(stById.get().getName());
				
			}
			
			return new ResponseEntity(emp.getName(), HttpStatus.ok);
		}
		*/
	}
}
