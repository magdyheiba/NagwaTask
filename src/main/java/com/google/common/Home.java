package com.google.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.ReportManager;
import com.shaft.validation.Verifications;

public class Home {
	private WebDriver driver;
	private static String url = System.getProperty("gui.baseURL");

	private By changeLanguage_button = By.xpath("//a[text()='English']");
	private By signIn_button = By.xpath("//a[text()='Sign in']");
	private By email_input = By.xpath("//input[@type='email']");
	private By password_input = By.xpath("//input[@type='password']");
	private By next_button = By.xpath("//span[text()='Next']");
	private By gmail_button = By.xpath("//a[text()='Gmail']");
	private By compose_button = By.xpath("//div[text()='Compose']");
	private By to_input = By.xpath("//textarea[@name='to']");
	private By subject_input = By.xpath("//input[@name='subjectbox']");
	private By messageBody_input = By.xpath("//div[@aria-label='Message Body']");
	private By sendMessage_button = By.xpath("//div[contains(@aria-label,'Send')and contains(@data-tooltip,'Send')]");
	private By sent_button = By.xpath("//a[text()='Sent']");
	private By lastEmailSent_div = By.xpath("//div[@class='aeF']/div//table[@id=':1u']//tr[1]");
	private By emailToName_text = By.xpath("//span[contains(.,'to ')]/span[@dir]");
	private By emailTo_text = By.xpath("//a[contains(@href,'mailto')]");
	private By emailBy_text = By.xpath("//span[@class='go']/span[1]");
	private By subject_text = By.xpath("//h2[@class='hP']");
	private By messageBody_text = By.xpath("//div[@id=':6e']/div[@dir='ltr']");

	// constructor
	public Home(ThreadLocal<WebDriver> driver) {
		this.driver = driver.get();
	}

	// login method
	public Home login(String[] login) {
		ElementActions.click(driver, changeLanguage_button);
		ElementActions.click(driver, signIn_button);
		ElementActions.type(driver, email_input, login[0]);
		ElementActions.click(driver, next_button);
		ElementActions.type(driver, password_input, login[1]);
		ElementActions.click(driver, next_button);
		return this;
	}

	// navigate to gmail method
	public Home navigateToGmail() {
		ReportManager.logDiscrete("Openning Gmail : ");
		ElementActions.click(driver, gmail_button);
		return this;
	}

	// send an Email method
	public Home sendAnEmail(String[] Email) {
		ReportManager.logDiscrete("Sending an email : ");
		ElementActions.click(driver, compose_button);
		ElementActions.type(driver, to_input, Email[0]);
		ElementActions.type(driver, subject_input, Email[1]);
		ElementActions.type(driver, messageBody_input, Email[2]);
		ElementActions.click(driver, sendMessage_button);
		return this;
	}

	// navigate To Sent Tap method
	public Home navigateToSentTap() {
		ReportManager.logDiscrete("Navigating to sent tap : ");
		ElementActions.click(driver, sent_button);
		return this;
	}

	// open Last Email Sent Tap method
	public Home openLastEmailSent() {
		ReportManager.logDiscrete("Openning last email sent : ");
		ElementActions.click(driver, lastEmailSent_div);
		return this;
	}

	// Navigate to the URL method
	public Home navigate() {
		BrowserActions.navigateToURL(driver, url);
		return this;
	}

	public Home VerifyDataOfLastEmailSent(String[] Email) {
		ReportManager.logDiscrete("Verifying The data of last email sent : ");
		ElementActions.hover(driver, emailToName_text);
		Verifications.verifyElementAttribute(driver, emailTo_text, "text", Email[0]);
		Verifications.verifyElementAttribute(driver, emailBy_text, "text", Email[1]);
		Verifications.verifyElementAttribute(driver, subject_text, "text", Email[2]);
		Verifications.verifyElementAttribute(driver, messageBody_text, "text", Email[3]);
		return this;
	}
}
