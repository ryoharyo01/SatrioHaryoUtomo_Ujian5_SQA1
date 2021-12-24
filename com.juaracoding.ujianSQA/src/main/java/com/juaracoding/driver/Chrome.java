package com.juaracoding.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.juaracoding.driver.Chrome;


	public class Chrome {
		private static Chrome instance = null;
		private static WebDriver driver;
		
		public Chrome() {
			driverChrome();
		}
		
		
		@SuppressWarnings("deprecation")
		public WebDriver driverChrome() {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
			
		}
		
		public static Chrome getInstance() {
			if (instance == null) {
				instance = new Chrome();
			}
			return instance;

		}
		
		public static WebDriver getDriver() {
			Chrome.getInstance();
			return driver;
		}

	}