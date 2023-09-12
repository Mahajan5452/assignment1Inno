package com.assignment2;

import java.io.FileWriter;
import java.util.List;

public class UpdateCSVFiles {

	public static void update(List<Address> addresses,List<Student> students) {
		
		try {
			
			FileWriter studFileWriter= new FileWriter("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\student.csv");
			 studFileWriter.write("id,Name,class_id,marks,gender,age\n");

	          
	            for (Student student : students) {
	                studFileWriter.write(student.getId() + "," + student.getName() + "," +
	                        student.getClass_id() + "," + student.getMarks() +","+ student.getGender()+","+student.getAge()+ "\n");
	            }
	            studFileWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
try {
			
			
			FileWriter addFileWriter = new FileWriter("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\address.csv");
			 addFileWriter.write("id,pin_code,city,student_id,\n");

	          
	            for (Address address : addresses) {
	                addFileWriter.write(address.getId() + "," + address.getPincode() + "," +
	                        address.getCity() + "," + address.getStudent_id() + "\n");
	            }
	            addFileWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
