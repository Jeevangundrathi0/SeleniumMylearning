package retailerPackage;

import org.openqa.selenium.By;

public class Retailersearch {
	
	By retailerModule=By.xpath("//div[conatins(text(),Retailer )]");
	By retailer=By.xpath("//ul //li[contains(text(),Retailer )]");
	By retailerSearch=By.cssSelector("input[name='retailerMobileNumber']");
	By retailerOrdersearch=By.cssSelector("input[name='retailerOrderNumber']");
	By submitButton=By.id("inputField");

}
