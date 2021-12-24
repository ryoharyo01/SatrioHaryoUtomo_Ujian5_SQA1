package com.juaracoding.addtocart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.driver.Chrome;

public class shopping {
	private WebDriver driver;

	private JavascriptExecutor js;
	
	public shopping() {
		this.driver = Chrome.getDriver();
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
	}
	
	@FindBy(css = "#header_logo > a > img")
	private WebElement btnHome;
	
	@FindBy(css = "#search_query_top")
	private WebElement btnDresses;
	
	@FindBy(css = "#search_query_top")
	private WebElement btnTshirt;
	
	@FindBy(css = "div[id='best-sellers_block_right'] li:nth-child(1) a:nth-child(1) img:nth-child(1)")
	private WebElement btnItemDresses;

	@FindBy(css = "button[name='Submit']")
	private WebElement btnAddtocart;
	
	@FindBy(css = "div[id='best-sellers_block_right'] li:nth-child(2) a:nth-child(1) img:nth-child(1)")
	private WebElement btnItemTshirt;
	
	public void Dresses() {
		btnDresses.sendKeys("dresses");
		btnDresses.submit();
		btnItemDresses.click();
		btnAddtocart.click();
		btnTshirt.sendKeys("T-Shirt");
		btnTshirt.submit();
		btnItemTshirt.click();
		btnAddtocart.click();
		}
}
