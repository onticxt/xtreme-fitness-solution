package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	// This method will read a CSV file
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(","); // here .split method splits all values by comma and returns
															// them as array elements to dataRecords array
				data.add(dataRecords); // here we are adding each array to the Linked List which is called data here.
			}

		} catch (FileNotFoundException e) { // exception handling to handle if file is not found.
			System.out.println("Could Not Find File");
			e.printStackTrace();
		} catch (IOException e) { // exception handling to handle if file exists but it cannot be read may be due
									// to incorrect file format
			// TODO Auto-generated catch block
			System.out.println("Could Not read File");
			e.printStackTrace();
		}
		return data; // returning the LinkedList of arrays
	}
}
