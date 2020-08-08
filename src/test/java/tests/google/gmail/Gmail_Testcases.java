package tests.google.gmail;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.google.common.Home;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.tools.io.ExcelFileManager;

import io.qameta.allure.Description;

public class Gmail_Testcases {
	private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private ThreadLocal<ExcelFileManager> google = new ThreadLocal<>();
	String[] login;
	String[] EmailData;
	String[] verifyEmailData;

	// Test Cases
	@Test(description = "Gmail - Insert", groups = { "gui" })
	@Description("When I enter Gmail page, then user should login and be able to send an email")
	public void sendAnEmail() {
		new Home(driver).navigate().login(login).navigateToGmail().sendAnEmail(EmailData);
	}

	@Test(description = "Gmail - Verify", dependsOnMethods = { "sendAnEmail" }, groups = { "gui" })
	@Description("When I enter Gmail page, and navigates to sent tap then he should be verify his last email sent ")
	public void VerifySendingAnEmail() {
		new Home(driver).navigate().login(login).navigateToGmail().navigateToSentTap().openLastEmailSent()
				.VerifyDataOfLastEmailSent(verifyEmailData);
	}

	private String[] readLoginTestData() {
		ArrayList<String> login = new ArrayList<String>();
		String colName = "Data1";
		String sheetName = "login";
		login.add(google.get().getCellData(sheetName, "Email", colName));
		login.add(google.get().getCellData(sheetName, "Password", colName));
		return login.toArray(new String[0]);
	}

	private String[] readEmailDataTestData() {
		ArrayList<String> emailData = new ArrayList<String>();
		String colName = "Data1";
		String sheetName = "emailData";
		emailData.add(google.get().getCellData(sheetName, "email To", colName));
		emailData.add(google.get().getCellData(sheetName, "subject", colName));
		emailData.add(google.get().getCellData(sheetName, "message Body", colName));
		return emailData.toArray(new String[0]);
	}

	private String[] readEmailDataForVerificationTestData() {
		ArrayList<String> emailData = new ArrayList<String>();
		String colName = "Data1";
		String sheetName = "emailData";
		emailData.add(google.get().getCellData(sheetName, "email To", colName));
		emailData.add(google.get().getCellData(sheetName, "email by", colName));
		emailData.add(google.get().getCellData(sheetName, "subject", colName));
		emailData.add(google.get().getCellData(sheetName, "message Body", colName));

		return emailData.toArray(new String[0]);
	}

	@BeforeClass
	public void beforeClass() {
		google.set(new ExcelFileManager(System.getProperty("testDataFolderPath") + "Google.xlsx"));

		// read test data
		login = readLoginTestData();
		EmailData = readEmailDataTestData();
		verifyEmailData = readEmailDataForVerificationTestData();
	}

	@BeforeMethod(onlyForGroups = { "gui" })
	public void beforeMethod() {
		driver.set(BrowserFactory.getBrowser());
	}

	@AfterMethod(onlyForGroups = { "gui" })
	public void afterMethod() {
		BrowserActions.closeCurrentWindow(driver.get());
	}
}
