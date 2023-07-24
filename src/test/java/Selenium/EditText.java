package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Maven_All\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		
		driver.findElement(By.className("text")).click();
		
		WebElement usernamebox = driver.findElement(By.id("userName"));
		usernamebox.sendKeys("Sri Balaji");
		
		WebElement useremailbox = driver.findElement(By.id("userEmail"));
		useremailbox.sendKeys("sribalajimuthu1793@gmai.com");
		
		WebElement currentadddressbox = FindElement(By.id("currentAddress"));
		currentadddressbox.sendKeys("plot no 5 sri meenakshi nagar");
		
		WebElement preads =	driver.findElement(By.id("permanentAddress"));
		preads.sendKeys("Plot no 5");
		
		driver.findElement(By.id("submit")).click();
		
		//type EMail
		//WebElement emailBox-driver.findElement(By.id("email")); 
		//emailBox.sendKeys("test@duck.com");
		//Append means already input in textbox example sri is here then sendkey (balaji) result in textbox sri balaji
		//WebElement appendBox-driver.findElement(By.xpath("//*[@id='contentblock'] "
		//appendBox.sendKeys("Text");
		//gettextbox means already text in textbox we get the text attribute value
		//WebElement getTextBox-driver.findElement(By.name("username")); 
		//String value= getTextBox.getAttribute("value");
		//System.out.println(value);//balaji
		//clear text
		//WebElement clearBox= driver.findElement(By.xpath("//*[@id='contentbloc
		//clearBox.clear();
		//textbox disable is turre or flase use isenabled() key this key both answer
		//WebElement disabledBox= driver.findElement(By.xpath("//*[@id='contentbloc "
		//boolean enabled= disabledBox.isEnabled(); "
		//System.out.println(enabled);
		
		
		

	}

	private static WebElement FindElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
