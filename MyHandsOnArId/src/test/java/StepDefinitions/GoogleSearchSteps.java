package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	RemoteWebDriver driver = null;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- Browser is Open");
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step- user is on google search page");
		
		driver.navigate().to("https://www.google.com");
	
		
	}

	@When("user enters a text in search box and hits enter")
	public void user_enters_a_text_in_search_box_and_hits_enter() {
		System.out.println("Inside Step- User enters a text in search box and hits entern");
		
//		if(driver.findElements(By.xpath("//div[text()='Accept all']")).size() !=0) {
//			driver.findElement(By.xpath("//div[text()='Accept all']")).click();
//		}
//		if(driver.findElements(By.xpath("//div[text()='I Agree']")).size() !=0) {
			driver.findElement(By.xpath("//div[text()='I Agree']")).click();
//		}
//		
		
		driver.findElement(By.name("q")).sendKeys("Ratha yatra Reading 2022g");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("Inside Step- user is navigated to search result");
		driver.getPageSource().contains("Jagannath Rath Yatra 2022: Important dates");
		driver.close();
		driver.quit();
	}



}
