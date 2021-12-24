package com.juaracoding.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.driver.Chrome;

public class Checkout {
	private WebDriver driver;
	
	public Checkout() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[title='View my shopping cart']")
	private WebElement btnCheckout1;		
		
	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'] span")
	private WebElement btnCheckoutSummary;

	@FindBy(css = "textarea[name='message']")
	private WebElement txtAddress;

	@FindBy(css = "#center_column > form > p > button")
	private WebElement btnAddress;

	@FindBy(id = "cgv")
	private WebElement chkTOS;
	
	@FindBy(css = "button[name='processCarrier'] span")
	private WebElement btnShipping;
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	private WebElement btnPayment;

	@FindBy(css = "button[class='button btn btn-default button-medium'] span")
	private WebElement btnBankWire;
	
	public void Chkout() {
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	wait.until(ExpectedConditions.elementToBeClickable(btnCheckout1));
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", btnCheckout1);
	btnCheckout1.click();
	btnCheckoutSummary.click();
	js.executeScript("arguments[0].scrollIntoView();", btnCheckout1);
	txtAddress.sendKeys("If necessary");
	btnAddress.click();
	chkTOS.click();
	btnShipping.click();
	btnPayment.click();
	btnBankWire.click();
	}
	
}
