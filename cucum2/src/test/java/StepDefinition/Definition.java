package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	WebDriver driver;
	
	@Given("Open browser")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("Enter username")
	public void enter_username() {
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	@When("Enter pwd")
	public void enter_pwd() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("Click on loginbutton")
	public void click_on_loginbutton() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("Login should be successfull")
	public void login_should_be_successfull() {
		String Expectedname=driver.findElement(By.id("welcome")).getText();
		   String Actualname=Expectedname;
		   Assert.assertEquals(Expectedname, Actualname );
	}
}
		
