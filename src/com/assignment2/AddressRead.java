package com.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AddressRead {

	public List<Address> readAddressFile(String addressFilePath) {
		List<Address> addressAllData= new ArrayList<Address>();
		String line="";
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(addressFilePath));
			bReader.readLine();
			while((line = bReader.readLine()) != null) {
				String[] employee = line.split(",");   
				addressAllData.add(new Address(Integer.parseInt(employee[0]), Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]))) ;
			}
			bReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return addressAllData;
	}
}
