package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gooutdoors.co.uk/womens/clothing/baselayers/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		WebElement productlist = driver.findElement(By.id("productlist_sort_by_top"));
		
		Select select = new Select(productlist);
		
		select.selectByIndex(2);
		
		select.selectByValue("13");
		
		select.selectByVisibleText("Latest Arrivals");
		
		//getlist
		List<WebElement> listoptions = select.getOptions();
		int size = listoptions.size();
		System.out.println("Number of Elements" + size);
		
		//dropdown use sendkeys
		productlist.sendKeys("Latest Arrivals");
		
		//multiselect dropdown
		WebElement multiselect = driver.findElement(By.id("productlist_sort_by_top"));
		
		Select multiselect1 = new Select(multiselect);
		
		multiselect1.selectByIndex(1);
		multiselect1.selectByIndex(2);
		multiselect1.selectByIndex(3);
		
		
		
		
	}

}
