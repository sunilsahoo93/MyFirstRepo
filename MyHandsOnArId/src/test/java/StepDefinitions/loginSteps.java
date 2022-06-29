//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import io.cucumber.java.en.And;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//
//
//public class loginSteps {
//
//	RemoteWebDriver driver = null;
//
//
//	@Given("^user is on login page$")
//	public void user_is_on_login_page() throws Throwable {
//		System.out.println("user is on login page-----");
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String userName, String password) throws Throwable {
//		System.out.println("user enters username and password-----");
//		driver.findElement(By.id("name")).sendKeys(userName);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//		
//	}
//	
//	@And("^clicks on login button$")
//	public void clicks_on_login_button() throws Throwable {
//		System.out.println("clicks on the login button-----");
//		
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("^user is navigated to the home page$")
//	public void user_is_navigated_to_the_home_page() throws Throwable {
//		System.out.println("user is navigated to the home page-----");
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
//
//	
//
//
//
//
//
//
//}
