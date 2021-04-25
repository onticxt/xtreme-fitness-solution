package XFS;

public abstract class Members{
    protected String customerID;
    private String sSN;
    private String name;
    private String gender;
    private int age;
    private int counter = 0;
    
    public Members(String name, String sSN, String gender, double age) {
	this.name = name;
	this.sSN = sSN;
	this.gender = gender;
	this.age = (int)age;
	
	counter++;
	customerID = setRandomCustomerID();
    }

  private String setRandomCustomerID() {
      int rand = (int) (Math.random() * Math.pow(10, 4));
	String lastFourOfSSN = sSN.substring(sSN.length() - 4, sSN.length());
	return rand + "-" + lastFourOfSSN + "-" + counter;
  }
    
  public void showInfo() {
      System.out.println(
      "Name: " + name + 
      "\nGender: " + gender +
      "\nage: " + age
	      );
  }
  
  public String getsSN() {
      return sSN;
  }
  
    
}
