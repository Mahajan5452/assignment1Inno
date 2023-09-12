package com.assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class FailByAge {

public static List<Student> failedList( List<Student> students) {
		
		List<Student> returnList = students.stream().filter(a -> a.getAge()>20)
				.collect(Collectors.toList());

		return returnList;

}
}
