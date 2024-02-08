package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Azo {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-R7\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airportzo.com/");
		driver.manage().window().maximize();
		
		//WebElement loginButton = driver.findElement(By.xpath("//button[@class='cust-btn btn-green hidden' and @onclick='login()']"));

        // Use JavaScript to trigger the click event on the login button
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
		
	//	WebElement loginButton = driver.findElement(By.xpath("//button[@class='cust-btn btn-green hidden' and @onclick='login()']"));

        // Create Actions object
     //   Actions actions = new Actions(driver);

        // Perform mouse click action on the login button
    //    actions.moveToElement(loginButton).click().perform();
		
	WebElement Login = driver.findElement(By.xpath("/html/body/div/nav/div/div/div[1]/a/img"));                                  
	Login.click();
	
	}

}
