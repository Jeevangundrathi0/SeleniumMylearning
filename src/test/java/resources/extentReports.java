package resources;

import com.relevantcodes.extentreports.ExtentReports;

public class extentReports {

	public static ExtentReports getExtentReports() {
		ExtentReports report;

		String Reportpath = System.getProperty("user.dir") + "\\ExtentRports\\Framework.html";
		report = new ExtentReports(Reportpath);
		report.config().reportName("HYPPRCRM Framework");
		report.config().documentTitle("Hyypr CRM");
		report.addSystemInfo("Framework Builder", "Jeevan");
		return report;

	}

}
