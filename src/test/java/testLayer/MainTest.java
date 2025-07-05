package testLayer;

import pages.HomePage;
import pages.LoginPage;
import pages.PimPage;

public class MainTest {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();

		login.loginFunctionality("Admin", "admin123");

		HomePage home = new HomePage();

		home.validateLogo();

		home.validateHomePageTitle();

		PimPage pim = new PimPage();

		pim.clickOnPimLink();

		pim.clickOnAddEmployeeButton();
		
		pim.addEmployee("Suraj", "sonar");
	}

}
