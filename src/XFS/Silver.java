package XFS;

public class Silver extends Members {
    private double balanceDue;
    private String memberTyepe = "Silver";

    public Silver(String name, String sSN, String gender, double age) {
	super(name, sSN, gender, age);
	customerID = "SLV-" + customerID;
	balanceDue = setBalanceDue();
	showInfo();
    }

    private double setBalanceDue() {
	return 1000;
    }

    public void showInfo() {
	super.showInfo();
	System.out.println("Customer ID: " + customerID + "\nMembership Type: " + memberTyepe + "\nBalance Due:"
		+ balanceDue + "\n*********************************");
    }
}
