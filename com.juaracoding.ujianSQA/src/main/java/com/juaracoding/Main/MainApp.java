package com.juaracoding.Main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.addtocart.shopping;
import com.juaracoding.checkout.Checkout;
import com.juaracoding.driver.Chrome;
import com.juaracoding.regis.SignUp;
import com.juaracoding.regis.SignIn;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = Chrome.getDriver();
		driver.get("http://automationpractice.com/index.php");

		SignIn sign = new SignIn();
		sign.createAccount("SeleniumTest1@juaracoding.com"); 

		SignUp input = new SignUp();
		input._inputForm("Ryo", "Haryo", "112233", "PT maju mundur", "Bekasi", "Bekasi Juga", "Kota Bekasi", "17125",
		"Test Selenium", "72777777", "73777777", "Mana Aja");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		shopping mystore = new shopping();
		mystore.Dresses();
		
		Checkout checkout = new Checkout();
		checkout.Chkout();
		
	}
}
