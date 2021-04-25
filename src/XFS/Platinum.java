package XFS;

public class Platinum extends Members {

    private String poolID;
    private String lockerID;
    private double balanceDue;
    private String memberTyepe = "Platinum";

    public Platinum(String name, String sSN, String gender, double age) {
	super(name, sSN, gender, age);
	customerID = "PLT-" + customerID;
	poolID = setPoolID();
	lockerID = setlockerID();
	balanceDue = setBalanceDue();
	showInfo();
    }

    private String setPoolID() {
	String lastFourOfSSN = getsSN().substring(getsSN().length() - 4, getsSN().length());
	return "PLT-" + lastFourOfSSN + "-PP";
    }

    private String setlockerID() {
	String lastFourOfSSN = getsSN().substring(getsSN().length() - 4, getsSN().length());
	return "PLT-" + lastFourOfSSN + "-LKR";
    }

    private double setBalanceDue() {
	return 3700 - 3700 * 0.15;
    }

    public void showInfo() {
	super.showInfo();
	System.out.println("Customer ID: " + customerID + "\nMembership Type: " + memberTyepe + "\nPool ID: " + poolID
		+ "\nLocker ID: " + lockerID + "\nBalance Due: " + balanceDue + "\n*********************************");
    }
}
