package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import logincredentials.LoginDetails;
import resources.AlertMessages;
import resources.Credentials;

public class LoginValidations extends Credentials {
	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@Given("^enter into the application with URL$")
	public void enter_into_the_application_with_url() throws Throwable {
		driver = initializedriver();
		driver.get("https://test-crm.hyppr.com/");
	}

	@When("^Enter username (.+) and  password (.+) and click on login$")
	public void enter_valid_and_valid_password(String username, String password) throws Throwable {
		LoginDetails logins = new LoginDetails(driver);
		logins.getemail().sendKeys(username);
		logins.getpassword().sendKeys(password);
		logins.getlogin().click();

	}

	@Then("^check Dashboard is displaying or not$")
	public void check_dashboard_is_displaying_or_not() throws Throwable {
		driver.quit();
	}

}
