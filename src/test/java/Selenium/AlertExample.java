package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement clickbutton = driver.findElement(By.id("alertButton"));
		clickbutton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement timealertbutton = driver.findElement(By.id("timerAlertButton"));
		timealertbutton.click();
		
		Thread.sleep(6000);
		Alert timealertbutton5 = driver.switchTo().alert();
		timealertbutton5.accept();
		
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\'confirmButton\']"));
		confirmButton.click();
		
		Alert confirmButton1 = driver.switchTo().alert();
		confirmButton1.dismiss();
		
		//to perform Scroll on application using Selenium
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		
		//selenium.getEval("scrollBy(0, 250)");
		
		WebElement promtButton = driver.findElement(By.id("promtButton"));
		promtButton.click();
		
		Alert promtButton1 = driver.switchTo().alert();
		promtButton1.sendKeys("hi");
		//promtButton1.accept();
		
}

}
