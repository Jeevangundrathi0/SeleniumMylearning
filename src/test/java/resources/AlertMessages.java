package resources;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMessages {
	public WebDriver driver;

	public AlertMessages(WebDriver driver) {
		this.driver = driver;
	}

	Alert alert = new Alert() {

		public void sendKeys(String keysToSend) {
			// TODO Auto-generated method stub

		}

		public String getText() {
			
			return null;
		}

		public void dismiss() {
			// TODO Auto-generated method stub

		}

		public void accept() {
			// TODO Auto-generated method stub

		}
	};

}
