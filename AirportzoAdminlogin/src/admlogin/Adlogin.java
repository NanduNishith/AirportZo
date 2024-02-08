package admlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adlogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL-R7\\Downloads\\eclipse-workspace\\eclipse-workspace\\AirportzoAdminlogin\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://airportzo.com/admin_dashboard/login.php");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("user_email1"));
		WebElement pwd = driver.findElement(By.id("user_password1"));
		
		email.sendKeys("admin@gmail.com");
		pwd.sendKeys("admin@123");
		
		WebElement login = driver.findElement(By.id("login_button"));
		login.click();
	}
}