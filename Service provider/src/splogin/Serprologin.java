package splogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Serprologin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-R7\\Downloads\\eclipse-workspace\\eclipse-workspace\\Service provider\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://airportzo.com/service-provider-dashboard/login");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("business_id"));
		WebElement pwd = driver.findElement(By.id("password"));
		
		email.sendKeys("Encalm_AZ_02");
		pwd.sendKeys("encalm@123");
		
		WebElement login = driver.findElement(By.className("submit_btn"));
		login.click();
	}
}