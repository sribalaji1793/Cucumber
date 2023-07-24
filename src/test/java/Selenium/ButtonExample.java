package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Maven_All\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
				
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleclick).perform();
		
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();
		
		//to perform Scroll on application using Selenium
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement clickme = driver.findElement(By.xpath("//*[@id='8xO16']"));
		action.click(clickme).perform();
		
		
		
		//1. Get the xy position
		WebElement getPositionButton=driver.findElement(By.id("position")); 
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is :"+ xValue+"Y value is :"+ yValue);
		
		//2. find the color
		WebElement colorButton= driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Button color is :"+color);
		
		//3. find the size
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height= sizeButton.getSize().getHeight(); 
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is :"+ height + "Width is :"+ width);
		
		//4. go to home
		WebElement homeButton = driver.findElement(By.id("home")); 
		homeButton.click();

	}

}
