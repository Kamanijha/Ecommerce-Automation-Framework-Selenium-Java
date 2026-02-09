package page_Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_object {
	public Page_object(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Books")
	private WebElement bookElement;
	
	@FindBy(id = "products-orderby")
	private WebElement ProductSort;
	
	@FindBy(id = "products-pagesize")
	private WebElement ProductPageDisplay;
	
	
	@FindBy(linkText  = "Shopping cart")
	private WebElement shoppingCart;
	
	@FindBy(id = "termsofservice")
	private WebElement termsofserviceBtn;
	
	@FindBy(id = "checkout")
	private WebElement checkOutBtn;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement billingNewAddressCountryId;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement billingNewAddressCity;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement billingNewAddressAddress1;
	
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement billingNewAddressZipPostalCode;
	
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement billingNewAddressPhoneNumber;
	
	@FindBy(id="billing-buttons-container")
	private WebElement billingbuttonscontainer;
	
	@FindBy(css = ".button-1.new-address-next-step-button")
	private WebElement newAddressNextStepButton;
	
	@FindBy(id = "PickUpInStore")
	private WebElement pickUpInStore;
	
	@FindBy(xpath = "//div[@id='checkout-step-shipping']//input[@value='Continue']")
	private WebElement CheckoutStepShippingBtn;
	
	
	@FindBy(id="paymentmethod_0")
	private WebElement paymentmethod;
	
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement paymentmethodnextstepbutton;
	
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement paymentinfonextstepbutton;
	
	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirmordernextstepbutton;
	 
	@FindBy(linkText = "Orders")
	private WebElement orders;
	
	@FindBy(linkText = "Click here for order details.")
	private WebElement  Clickhererderdetails;
	
	@FindBy(linkText = "Log out")
	private WebElement  Logout;

	public WebElement getBookElement() {
		return bookElement;
	}

	public WebElement getProductSort() {
		return ProductSort;
	}

	public WebElement getProductPageDisplay() {
		return ProductPageDisplay;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getTermsofserviceBtn() {
		return termsofserviceBtn;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public WebElement getBillingNewAddressCountryId() {
		return billingNewAddressCountryId;
	}

	public WebElement getBillingNewAddressCity() {
		return billingNewAddressCity;
	}

	public WebElement getBillingNewAddressAddress1() {
		return billingNewAddressAddress1;
	}

	public WebElement getBillingNewAddressZipPostalCode() {
		return billingNewAddressZipPostalCode;
	}

	public WebElement getBillingNewAddressPhoneNumber() {
		return billingNewAddressPhoneNumber;
	}

	public WebElement getBillingbuttonscontainer() {
		return billingbuttonscontainer;
	}

	public WebElement getNewAddressNextStepButton() {
		return newAddressNextStepButton;
	}

	public WebElement getPickUpInStore() {
		return pickUpInStore;
	}

	public WebElement getCheckoutStepShippingBtn() {
		return CheckoutStepShippingBtn;
	}

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	public WebElement getPaymentmethodnextstepbutton() {
		return paymentmethodnextstepbutton;
	}

	public WebElement getPaymentinfonextstepbutton() {
		return paymentinfonextstepbutton;
	}

	public WebElement getConfirmordernextstepbutton() {
		return confirmordernextstepbutton;
	}

	public WebElement getOrders() {
		return orders;
	}

	public WebElement getClickhererderdetails() {
		return Clickhererderdetails;
	}

	public WebElement getLogout() {
		return Logout;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
