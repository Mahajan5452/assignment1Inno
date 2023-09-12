package com.assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class SearchDataBy {

	public static List<Student> searchByPincode(int pincode, List<Address> addressList, List<Student> students) {
		List<Integer> studentIndex = addressList.stream().filter(address -> address.getPincode() == pincode)
				.map(address -> address.getStudent_id()).collect(Collectors.toList());
		List<Student> returnList = students.stream().filter(a -> studentIndex.contains(a.getId()))
				.collect(Collectors.toList());

		return returnList;

	}

	public static List<Student> searchByCity(String city, List<Address> addressList, List<Student> students) {
		List<Integer> studentIndex = addressList.stream().filter(address -> address.getCity().equalsIgnoreCase(city))
				.map(address -> address.getStudent_id()).collect(Collectors.toList());
		List<Student> returnList = students.stream().filter(a -> studentIndex.contains(a.getId()))
				.collect(Collectors.toList());

		return returnList;

	}

	public List<Student> getStudentWithAge(List<Student> studentlist, int age) {

		List<Student> list = studentlist.stream().filter(p -> p.getAge() == age).collect(Collectors.toList());

		return list;

	}

	public List<Student> getStudentWithGender(List<Student> studentlist, String gender) {
		List<Student> list = studentlist.stream().filter(p -> p.getGender().equals(gender))
				.collect(Collectors.toList());
		return list;

	}

	public List<Student> getStudentWithClass(List<Student> studentlist, int class_id) {
		List<Student> list = studentlist.stream().filter(p -> p.getClass_id() == class_id).collect(Collectors.toList());
		return list;

	}
}
