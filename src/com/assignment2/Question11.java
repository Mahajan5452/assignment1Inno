package com.assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
 
	 public static List<Student> findFemale(List<Student> students, int start, int end, String gender){
	        return students.stream()
	                .skip(start)
	                .limit(end)
	                .filter(s -> s.getGender().equals(gender))
	                .collect(Collectors.toList());
	    }
	 public static List<Student> sort(List<Student> students, int start, int end, String gender){
		 List<Student> filteredStudents = students.stream()
			        .skip(start - 1)
			        .limit(end - start + 1)
			        .filter(s -> s.getGender().equals(gender))
			        .sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
			        .collect(Collectors.toList());
	        return filteredStudents;
	    }
	 
	 public List<Student> femaleOrderByMarks(List<Student> students, int start, int end, String gender) {
		    return students.stream()
		            .skip(start - 1)
		            .limit(end - start + 1)
		            .filter(s -> s.getGender().equals(gender))
		            .sorted((student1, student2) -> Integer.compare(student2.getMarks(), student1.getMarks()))
		            .collect(Collectors.toList());
		}

}
