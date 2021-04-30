package XFS;

public class Silver extends Members {
	// All unique Functionalities that only Silver members have
	private double balanceDue;
	private String memberType = "Silver";

	// Constructor
	public Silver(String name, String sSN, String gender, double age) {
		super(name, sSN, gender, age);
		customerID = "SLV" + customerID;
		balanceDue = setBalanceDue();
		showInfo();
	}
	// lists unique method

	private double setBalanceDue() {
		return 1000;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("CustomerID: " + customerID + "\nMembership Type: " + memberType + "\nBlance Due: "
				+ balanceDue + "\n******************************");
	}
}
