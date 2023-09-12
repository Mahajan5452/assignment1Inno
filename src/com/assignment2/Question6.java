package com.assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class Question6 {

	public static List<Student> searchB(Class class1 ,List<Student> students) {
		
		List<Student> returnList = students.stream().filter(a->a.getClass_id()==class1.getId())
				.collect(Collectors.toList());

		return returnList;

	}
}
