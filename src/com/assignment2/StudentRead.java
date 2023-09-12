package com.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentRead {


	public List<Student> readStudentFile(String studentFilePath) {
		List<Student> studentAllData= new ArrayList<Student>();
		String line="";
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(studentFilePath));
			bReader.readLine();
			while((line = bReader.readLine()) != null) {
				String[] employee = line.split(",");   
				studentAllData.add(new Student(Integer.parseInt(employee[0]), employee[1], Integer.parseInt(employee[2]), Integer.parseInt(employee[3]), employee[4], Integer.parseInt(employee[5]))) ;
			}
			bReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return studentAllData;
		
	}
}
