package com.assignment2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
//		   String classFilePath = new String("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\class.csv"); 
//		  ClassRead cl = new ClassRead();
//		 List<Class>list= cl.readclassFile(classFilePath);
//		   list.forEach(a->System.out.println(a.getId() +"  " + a.getName()));
		   
		       String classFilePath = new String("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\class.csv"); 
		       String studentFilePath = new String("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\student.csv");
			   String addressFilePath = new String("C:\\Users\\jayma\\Desktop\\Innogent Assignment\\ASSIGNMENT_1\\address.csv"); 
				  
			   List<Address> allAddresses= new AddressRead().readAddressFile(addressFilePath);
			   List<Student> allStudents = new StudentRead().readStudentFile(studentFilePath);
			   List<Class> allClasses = new ClassRead().readclassFile(classFilePath);
				/*
				 * int samplePincode=482002; String cityString="INDore";
				 * SearchDataBy.searchByCity(cityString, allAddresses,
				 * allStudents).forEach(a->System.out.println(a));
				 */
			   
			 //List<Student> passedStudents=  PassedStudents.passedList(allStudents);
				/*
				 * String class_name="A"; Class class1=
				 * allClasses.stream().filter(a->a.getName().equals(class_name)).findFirst().
				 * orElse(null); Question6.searchB(class1,
				 * allStudents).forEach(a->System.out.println(a));
				 * System.out.println(class1.getName());
				 */
			 //  FailByAge.failedList(allStudents).forEach(a->System.out.println(a));
				/*
				 * int stud_id=7; allStudents.removeIf(student -> student.getId() == stud_id);
				 * allAddresses.removeIf(add->add.getStudent_id()== stud_id);
				 * UpdateCSVFiles.update(allAddresses, allStudents);
				 * System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
				 */
			// Question10.serachClassIdNotExist(allClasses, allStudents);
			   Question11.findFemale(allStudents, 1, 9, "F").stream().forEach(a->System.out.println(a));
		  
	}
}