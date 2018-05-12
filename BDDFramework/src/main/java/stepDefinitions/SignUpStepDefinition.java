package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignUpStepDefinition {
	
	WebDriver driver;
	
	@Given("^User should lounch the chrome browser$")
	public void shouldLounchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/mukka/Desktop/Selenium Projects/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
	}

	@When("^User should navigaet to FreeCRM webpage$")
	public void shouldNavigaetToFreeCRMWebpage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Then("^User should click on Sing up button$")
	public void shouldClickSingUpButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='navbar-collapse']//a[@href='https://www.freecrm.com/register/' and text() = 'Sign Up']")).click();
	}
	
	@Then("^User should select Free Edition$")
	public void user_should_select_Free_Edition(){
		WebElement listbox = driver.findElement(By.name("payment_plan_id"));
		listbox.sendKeys("F");
		listbox.sendKeys(Keys.DOWN);
		listbox.sendKeys(Keys.ENTER);
	}
	
	@Then("^User should enter FirstName$")
	public void user_should_enter_FirstName() throws InterruptedException{
		driver.findElement(By.name("first_name")).sendKeys("bhaskar");
	}
	@Then("^User should enter ListName$")
	public void user_should_enter_ListName() throws Throwable {
		driver.findElement(By.name("surname")).sendKeys("mukka");
	}

	@Then("^User should enter Email$")
	public void user_should_enter_Email() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("nagabhaskarsharma1@gmail.com");
	}

	@Then("^User should enter Confirm Email$")
	public void user_should_enter_Confirm_Email() throws Throwable {
		driver.findElement(By.name("email_confirm")).sendKeys("nagabhaskarsharma1@gmail.com");
	}

	@Then("^User should enter Username$")
	public void user_should_enter_Username() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("bhaskarmukka");
	}

	@Then("^User should enter Password$")
	public void user_should_enter_Password() {
		driver.findElement(By.name("password")).sendKeys("Panduiloveu@7");
	}
	@Then("^User should enter Confirm Password$")
	public void user_should_enter_Confirm_Password(){
		driver.findElement(By.name("passwordconfirm")).sendKeys("Panduiloveu@7");
	}
	@Then("^User should select check box$")
	public void user_should_select_check_box(){
		driver.findElement(By.name("agreeTerms")).click();
	}

	@Then("^User should click submit button$")
	public void user_should_click_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
}
