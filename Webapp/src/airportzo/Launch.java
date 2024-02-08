package airportzo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-R7\\Downloads\\Airportzo\\Airportzo\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://airportzo.com");
		driver.manage().window().maximize();
		
		//Thread.sleep(10000);
		
		WebElement Login = driver.findElement(By.xpath("/html/body/div/nav/div/div/div[2]/div/div[2]/div[4]/button[1]"));
		Login.click();
		
		//WebElement dep = driver.findElement(By.id("departure-terminal"));
		//dep.sendKeys("delhi");
		
		//WebElement iframeElement = driver.findElement(By.id("your-iframe-id"));
		//driver.switchTo().frame(iframeElement);
		
		//WebElement login = driver.findElement(By.className("cust-btn"));
		//login.click();
		
		//WebElement Phno = driver.findElement(By.id("login-phone"));
		//Phno.sendKeys("9841494839");
		
		//WebElement SendOTP = driver.findElement(By.id("send_otp"));
		//SendOTP.click();
	}
}