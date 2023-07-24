package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement homedown = driver.findElement(By.
				xpath("//*[@id=\'tree-node\']/ol/li/span/button"));
		homedown.click();
		
		WebElement desktopdown = driver.findElement(By.
				xpath("//*[@id=\'tree-node\']/ol/li/ol/li[1]/span/button"));
		desktopdown.click();
		
		WebElement documentdown = driver.findElement(By.
				xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
		documentdown.click();
		
		//to perform Scroll on application using Selenium
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement downloaddown = driver.findElement(By.
				xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
		downloaddown.click();
		
		WebElement notes = driver.findElement(By.
				xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
		notes.click();
		
		WebElement commands = driver.findElement(By.
				xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
		commands.click();
		
		
		
		
		
		
		
		
		
	}

}
