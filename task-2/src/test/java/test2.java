import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class test2 
{
	WebDriver driver;
	@BeforeClass
	@Given("^User is on Home Page$")
	public void user_is_on_home_page() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\web_driver_2\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
	}

	@When("^User navigate to Login Page$")
	public void user_navigate_to_login_page() 
	{
	   WebElement e=driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
	   e.click();
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	 driver.findElement(By.cssSelector("#ap_email")).sendKeys(string);
	 driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")).click();
	 driver.findElement(By.cssSelector("#ap_password")).sendKeys(string2);
	 driver.findElement(By.cssSelector("#signInSubmit")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
      System.out.println("User Logged in successfully");

	}

	@Then("Provide correct credentials")
	public void provide_correct_credentials() 
	{
	 System.out.println("Please provide correct credentials");

	}

	@Then("Keeping case as Invalid")
	public void keeping_case_as_invalid() 
	{
	System.out.println("This is an invalid login");

	}

}
