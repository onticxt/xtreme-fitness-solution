package XFS;

public class Platinum extends Members {
	// All unique Functionalities that only platinum members have
	private String poolID;
	private String lockerID;
	private double balanceDue;
	private String memberType = "Platinum";

	// Constructor
	public Platinum(String name, String sSN, String gender, double age) {
		super(name, sSN, gender, age);
		customerID = "PLT-" + customerID;
		poolID = setPoolID();
		lockerID = setLockerID();
		balanceDue = setBalanceDue();
		showInfo();
	}

	// lists unique method
	private String setPoolID() {
		String lastFourOfSSN = sSN.substring(sSN.length() - 4, sSN.length());
		return "PLT-" + lastFourOfSSN + "-PP";
	}

	private String setLockerID() {
		String lastFourOfSSN = sSN.substring(sSN.length() - 4, sSN.length());
		return "PLT-" + lastFourOfSSN + "-LKR";
	}

	private double setBalanceDue() {
		return 3700 - 3700 * 0.15;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("CustomerID: " + customerID + "\nMembership Type: " + memberType + "\nPool ID :" + poolID
				+ "\nLocker ID: " + lockerID + "\nBlance Due: " + balanceDue + "\n******************************"

		);
	}

}
