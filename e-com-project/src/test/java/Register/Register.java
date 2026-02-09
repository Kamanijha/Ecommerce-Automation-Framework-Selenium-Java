package Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("kamani");
		driver.findElement(By.id("LastName")).sendKeys("jha");
		driver.findElement(By.id("Email")).sendKeys("kamani@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("kamani@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("kamani@123"); 
		driver.findElement(By.id("register-button")).submit();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
