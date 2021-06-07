package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Credentials {

	public WebDriver driver;
	public Properties pros;

	public WebDriver initializedriver() throws IOException {
		pros = new Properties();
		FileInputStream fileio = new FileInputStream(
				"D:\\Selenium_automation\\Leaning_automation\\src\\test\\java\\resources\\data.properties");
		pros.load(fileio);
		String Browsername = pros.getProperty("Browser");
		if (Browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium_automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	// for taking screen shots of failed methods
	public void screenshots(String methodName, WebDriver driver) throws IOException {
		TakesScreenshot Screenshots = (TakesScreenshot) driver;
		File Source = Screenshots.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir") + "\\Screenshots\\" + methodName + ".png";
		FileUtils.copyFile(Source, new File(destinationfile));
	}

}
