package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_All\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement clickyes = driver.findElement(By.className("custom-control-label"));
		clickyes.click();
		
		WebElement clickimpressive = driver.findElement(By.
				xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		clickimpressive.click();
		
		WebElement no = driver.findElement(By.
				xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/div[4]/label"));
		boolean noselected=	no.isSelected();
		System.out.println(noselected);
		
//		WebElement unchecked=driver.findElement(
//				By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]")); 
//		WebElement checked= driver.findElement(By.
//				xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
//				boolean status1=unchecked.isSelected();
//				boolean status2=checked.isSelected();
//				System.out.println(status1);
//				System.out.println(status2);

	}

}
