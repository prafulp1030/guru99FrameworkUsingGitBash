package pages;

public class PimPage {

	
	public void clickOnPimLink()
	{
		System.out.println("User click on PIM Link");
	}
	
	public void clickOnAddEmployeeButton()
	{
		System.out.println("User click on add Employee button");
	}
	
	
	public void addEmployee(String firstName, String lastName)
	{
		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println("Employee is Created");
	}
	
	
	
}
