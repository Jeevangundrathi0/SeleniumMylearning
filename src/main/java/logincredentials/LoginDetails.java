package logincredentials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetails {

	public WebDriver driver;

	By Email = By.cssSelector("input[type='email']");
	By password = By.cssSelector("input[type='password']");
	By loginButton = By.cssSelector("button[type='button']");
	By rememberMe = By.cssSelector("input[name='checkedA']");
	By dashboard = By.xpath("//div[@class='active dashboard']");
	By errorMessage = By.xpath("//div[@class='MuiAlert-message']");

	public LoginDetails(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getemail() {
		return driver.findElement(Email);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}

	public WebElement getlogin() {
		return driver.findElement(loginButton);
	}

	public WebElement getDashboard() {
		return driver.findElement(dashboard);
	}
	public String geterrorMessage() {
		return driver.findElement(errorMessage).getText();
	}
}
