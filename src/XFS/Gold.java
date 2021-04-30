package XFS;

public class Gold extends Members {
	// All unique Functionalities that only gold members have
	private String poolID;
	private double balanceDue;
	private String memberType = "Gold";

	// Constructor
	public Gold(String name, String sSN, String gender, double age) {
		super(name, sSN, gender, age);
		customerID = "GLD" + customerID;
		poolID = setPoolID();
		balanceDue = setBalanceDue();
		showInfo();
	}

	// lists unique method
	private String setPoolID() {
		String lastFourOfSSN = sSN.substring(sSN.length() - 4, sSN.length());
		return "PLT-" + lastFourOfSSN + "-PP";
	}

	private double setBalanceDue() {
		return 2500 - 2500 * 0.12;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("CustomerID: " + customerID + "\nMembership Type: " + memberType + "\nPool ID :" + poolID
				+ "\nBlance Due: " + balanceDue + "\n******************************");
	}

}
