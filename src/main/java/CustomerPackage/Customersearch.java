package CustomerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customersearch {

	public WebDriver driver;

	By mobileNumber = By.cssSelector("input[name='customerMobileNumber']");
	By orderNumber = By.cssSelector("input[name='customerOrderNumber']");
	By submitButton=By.id("inputField");
}
