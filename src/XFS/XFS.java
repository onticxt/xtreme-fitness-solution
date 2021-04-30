package XFS;

import java.util.LinkedList;
import java.util.List;

public class XFS {

	public static void main(String[] args) {

		System.out.println("*****************************************************"
				+ "\n**********Welcome To Xtreame Fitness Solution*************"
				+ "\n*****************************************************");

		List<Members> members = new LinkedList<Members>();

		// Read a CSV File then create new account based on that data
		String file = "C:\\Users\\syedu\\OneDrive\\Desktop\\Customers.csv";
		List<String[]> newCustomers = utilities.CSV.read(file);
		for (String[] customer : newCustomers) {
			String name = customer[0];
			String sSN = customer[1];
			String gender = customer[2];
			double age = Double.parseDouble(customer[3]);
			String accountType = customer[4];
			if (accountType.equals("Platinum")) {
				members.add(new Platinum(name, sSN, gender, age));
			} else if (accountType.equals("Gold")) {
				members.add(new Gold(name, sSN, gender, age));
			} else if (accountType.equals("Silver")) {

				members.add(new Silver(name, sSN, gender, age));
			} else {
				System.out.println("Error Reading Account Type");
			}
		}

		for (Members mem : members) {
			mem.showInfo();
		}
	}

}
