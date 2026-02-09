package demoWebShopEndToEnd;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import genricUtility.FileUtility;
import page_Object_repo.Page_object;
import page_Object_repo.Register;

public class DemoWebShopEndToEnd  {
	@Test
	public  void main() throws InterruptedException, EncryptedDocumentException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demowebshop.tricentis.com/");

        // ---------- Register ----------

        
        String xlFile = "./src/test/resources/DDTesting.xlsx";
        
         int rows =  FileUtility.getRowCount(xlFile,"user");
         
         Page_object PageObject  = new Page_object(driver);
         Register register = new Register(driver);
         
//         for(int i = 1;i<=rows;i++) {
//        	 // read data from excel
//        String fisrtName = FileUtility.getcellData(xlFile, "user", i, 0);
//        String lastName = FileUtility.getcellData(xlFile, "user", i, 1);
//        
//        // fiil the data in application 
//        
//        //Register register = new Register(driver);
//        register.getIconRegister().click();
//        register.getFirstname().sendKeys(fisrtName);
//        register.getLastname().sendKeys(lastName);
//        register.getEmail().sendKeys(fisrtName+ new Random().nextInt(10000) + System.currentTimeMillis()+"@gmail.com");
//        register.getPassword().sendKeys( fisrtName+"@123");
//        register.getConfirmpassword().sendKeys(fisrtName+"@123");
//        register.getRegisterBtn().click();
//        
//        PageObject.getLogout().click();
//        	 
//         }
        
         String fisrtName = FileUtility.getcellData(xlFile, "user", 1, 0);
         String lastName = FileUtility.getcellData(xlFile, "user", 1, 1);
        register.getIconRegister().click();
        register.getFirstname().sendKeys(fisrtName);
        register.getLastname().sendKeys(lastName);
        register.getEmail().sendKeys(fisrtName + System.currentTimeMillis()+"@gmail.com");
        register.getPassword().sendKeys(fisrtName+"@123");
        register.getConfirmpassword().sendKeys(fisrtName+"@123");
        register.getRegisterBtn().click();

        //  Go to Books 
       
   
        
        PageObject.getBookElement().click();

        // Sort

        WebElement productSort = PageObject.getProductSort();
        Select sort = new Select(productSort);
        sort.selectByVisibleText("Price: High to Low");

        // Display

        Select display = new Select(PageObject.getProductPageDisplay());
        display.selectByIndex(2);
//
//        //  Add multiple products
        List<WebElement> addToCartButtons =
                driver.findElements(By.cssSelector("input[value='Add to cart']"));

        for (int i = 0; i < 2; i++) {
            addToCartButtons.get(i).click();
            Thread.sleep(1000);
        }
        

        //  Go to Cart 

         PageObject.getShoppingCart().click();
//        
        
        // click on checkout button
        PageObject.getTermsofserviceBtn().click();
        
        Thread.sleep(2000);
        PageObject.getCheckOutBtn().click();
        
        
        // billing and shiping address
        
        
        // get test data from excel
       String countryName=   FileUtility.getcellData(xlFile, "Address", 1, 0);
       String cityName=   FileUtility.getcellData(xlFile, "Address", 1, 1);
       String Address=   FileUtility.getcellData(xlFile, "Address", 1, 2);
       String ZipNum=   FileUtility.getcellData(xlFile, "Address", 1, 3);
       String phoneNum=   FileUtility.getcellData(xlFile, "Address", 1, 4);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement  selectCountyDD=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_CountryId")));
       
       Select select = new Select(selectCountyDD);
       select.selectByVisibleText(countryName);
               PageObject.getBillingNewAddressCity().sendKeys(cityName);
        PageObject.getBillingNewAddressAddress1().sendKeys(Address);
        PageObject.getBillingNewAddressZipPostalCode().sendKeys(ZipNum);
        PageObject.getBillingNewAddressPhoneNumber().sendKeys(phoneNum);
        PageObject.getBillingbuttonscontainer().click();
        
        Thread.sleep(3000);
        
        // shipping address
        
        
        PageObject.getNewAddressNextStepButton().click();
        
       Thread.sleep(5000);
       
        // shippinh method
        
        

        PageObject.getPickUpInStore().click();
//        
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement continueBtn = waitt.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='checkout-step-shipping']//input[@value='Continue']")
            )
        );

        continueBtn.click();
        Thread.sleep(4000);
      
         // pyament method 
       
      

       WebElement codRadio = PageObject.getPaymentmethod();
//
        if (!codRadio.isSelected()) {
            codRadio.click();
        }
//
       PageObject.getPaymentmethodnextstepbutton().click();


        Thread.sleep(5000);
        
//        // payment information 
       
      PageObject.getPaymentinfonextstepbutton().click();

//        
//        // confirm order
      
      PageObject.getConfirmordernextstepbutton().click();


       PageObject.getOrders().click();
//       
       Thread.sleep(4000);
      PageObject.getClickhererderdetails().click();

      Thread.sleep(4000);
      
      // logout
      PageObject.getLogout().click();
      
        driver.close();
    }
}
