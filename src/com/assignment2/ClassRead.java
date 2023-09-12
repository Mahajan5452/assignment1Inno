package com.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ClassRead {

	

	public List<Class> readclassFile(String classFilePath) {
		List<Class> classAllData= new ArrayList<Class>();
		String line="";
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(classFilePath));
			bReader.readLine();
			while((line = bReader.readLine()) != null) {
				
				String[] employee = line.split(",");   
				classAllData.add(new Class(Integer.parseInt(employee[0]), employee[1])) ;
			}
			bReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return classAllData;
		
	}
}
