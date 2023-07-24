package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktexxtLinkPartial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		
		//driver.findElement(By.linkText("Home")).click();

		driver.findElement(By.partialLinkText("Hom")).click();
	}

}
