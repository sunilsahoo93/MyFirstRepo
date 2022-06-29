package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver ;

	private By txt_username = By.id("name");
	private By txt_password = By.id("password");
	private By btn_login =  By.id("login");
	private By btn_logout = By.id("logout");

	//Below is a constructor used to pass the webdriver instance from another class (where LoginPage class will be instantiated) to this class
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not log in page. Current Page is " + driver.getCurrentUrl());
		}
	}

	public void enterUserName(String userName) {
		driver.findElement(txt_username).sendKeys(userName);

	}

	public void enterPassword( String password) {

		driver.findElement(txt_password).sendKeys(password);
	}
	
	
	public void clickLogin() {

		driver.findElement(btn_login).click();

	}
	
	public void checkLogOutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}

}
