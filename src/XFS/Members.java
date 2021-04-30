package XFS;

public class Members {
	// Lists common functionalities
	private String name;
	protected String sSN;
	private String gender;
	private int age;
	protected String customerID;
	private int counter = 0;

	// Constructor
	public Members(String name, String sSN, String gender, double age) {
		this.name = name;
		this.sSN = sSN;
		this.age = (int) age;
		this.gender = gender;

		counter++;
		customerID = setRandomCustomerID();
	}

	// Lists common methods
	private String setRandomCustomerID() {
		int rand = (int) (Math.random() * Math.pow(10, 4));
		String lastFourOfSSN = sSN.substring(sSN.length() - 4, sSN.length());
		return rand + "-" + lastFourOfSSN + "-" + counter;
	}

	public void showInfo() {
		System.out.println("Name: " + name + "\nGender: " + gender + "\nAge: " + age);
	}
}
