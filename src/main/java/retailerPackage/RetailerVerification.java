package retailerPackage;

import org.openqa.selenium.By;

public class RetailerVerification {
	By retailerModule = By.xpath("//div[conatins(text(),Retailer )]");
	By retailerVerification = By.xpath("//ul //li[contains(text(),Retailer verification]");
	By editAction = By.className("MuiSvgIcon-root.EditPendingVerification.cursorPointer.MuiSvgIcon-colorPrimary");
	By pending = By.id("wrapped-tab-PendingDetails");
	By approvedTab = By.id("wrapped-tab-ApprovedDetails");
	By rejectedTab = By.id("wrapped-tab-RejectedDetails");
	By search = By.cssSelector("input[id='input-with-icon-textfield']");
	By registrationDownload = By.xpath("//td //u[contains(text(),Registration)]");
	By gstDownload = By.xpath("//td //u[contains(text(),GST Number)]");
	By kycDownload = By.xpath("//td //u[contains(text(),KYC)]");
	By ApprovedButton = By.xpath("//span //span[contains(text(),Approved)]");
	By rejectedButton = By.xpath("//button[@class='buttonSizeorder'] //span");
	By reasonBox = By.cssSelector("textarea[placeholder='Minimum 3 rows']");
	By cancelButton = By.xpath("//button[@class='buttonSizeordercancle']");
	By rejectButton = By.xpath("//span[@class='MuiButton-label'] //span");

}
