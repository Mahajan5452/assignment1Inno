package com.assignment2;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class Question10 {

	public static void serachClassIdNotExist(List<Class> classes ,List<Student> students) {
//		
//		List<Integer> classIds= classes.stream().map(a->a.getId()).collect(Collectors.toList());
//		List<Integer> deleteThisIds =classIds.stream().filter(a->students.co) 
		
	Set <Integer> set = students.stream()
			.map(a -> a.getClass_id())
			.collect(Collectors.toSet()) ; 
	List<Class>  addClasses =classes.stream()
		.filter(a -> set.contains(a.getId())).collect(Collectors.toList()) ; 
	addClasses.stream().forEach(a->System.out.println(a.getId()));
	
	
	try {
		
		FileWriter studFileWriter= new FileWriter("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\class.csv");
		 studFileWriter.write("id,name\n");

          
            for (Class cl : addClasses) {
                studFileWriter.write(cl.getId() + "," + cl.getName()+ "\n");
            }
            studFileWriter.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
