package XFS;

public class Gold extends Members {
    private String poolID;
    private double balanceDue;
    private String memberTyepe = "Gold";

    public Gold(String name, String sSN, String gender, double age) {
	super(name, sSN, gender, age);
	customerID = "GLD-" + customerID;
	poolID = setPoolID();
	balanceDue = setBalanceDue();
	showInfo();
    }

    private String setPoolID() {
	String lastFourOfSSN = getsSN().substring(getsSN().length() - 4, getsSN().length());
	return "GLD-" + lastFourOfSSN + "-PP";
    }

    private double setBalanceDue() {
	return 2500 - 2500 * 0.12;
    }

    public void showInfo() {
	super.showInfo();
	System.out.println("Customer ID: " + customerID + "\nMembership Type: " + memberTyepe + "\nPool ID: " + poolID
		+ "\nBalance Due: " + balanceDue + "\n*********************************");
    }

}
