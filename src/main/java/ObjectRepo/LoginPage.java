package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement usernameTbx;
	
	@FindBy(id = "password")
	private WebElement passwordTbx;
	
	@FindBy(id = "submit")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserNameTbx() {
		return usernameTbx;
	}
	
	public WebElement getPasswordTbx() {
		return passwordTbx;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
