package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {

	public WebDriver driver;
	
	@Given("Open the browser")
	public void open_browser() {
		
		driver = new ChromeDriver();
		
	}
	
	@And("Launch the URL")
	public void launch_URL() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@When("Click on Login button")
	public void click_login_link() {
		
		driver.findElement(By.className("ico-login")).click();
		
	}
	
	@And("Enter the email (.*)$")
	public void enter_email(String email) {
		
		driver.findElement(By.id("Email")).sendKeys(email);
	}
	
	@And("Enter the password (.*)$")
	public void enter_password(String password) {
		
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	
	@And("Click login button")
	public void click_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@Then("Home page should be displayed")
	public void login_validate() {
		
		String text = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		System.out.println(text);
	}
}
