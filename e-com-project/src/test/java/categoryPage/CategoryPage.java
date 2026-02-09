package categoryPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CategoryPage {
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Books")).click();
		
		WebElement sortDropdown = driver.findElement(By.id("products-orderby"));
		Select select = new Select(sortDropdown);
		select.selectByVisibleText("Price: High to Low");
		
		WebElement displayNoOfProduct = driver.findElement(By.id("products-pagesize"));
		Select select2 = new Select(displayNoOfProduct);
		select2.selectByIndex(2);
		
		List<WebElement> addToCartButtons =
		        driver.findElements(By.cssSelector("input[value='Add to cart']"));

		// Add first 3 products to cart
		for (int i = 0; i < 3; i++) {
		    addToCartButtons.get(i).click();
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
