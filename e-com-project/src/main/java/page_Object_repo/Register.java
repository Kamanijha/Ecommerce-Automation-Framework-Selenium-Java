package page_Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "ico-register")
	private WebElement iconRegister;
	
	@FindBy(id = "FirstName")
	private WebElement Firstname;
	
	@FindBy(id = "LastName")
	private WebElement Lastname;
	
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id = "register-button")
	private WebElement registerBtn;
	
	public WebElement getIconRegister() {
		return iconRegister;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	

	

	
}
