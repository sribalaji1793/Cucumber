package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.open google
		//2.with firefox
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	}

}
