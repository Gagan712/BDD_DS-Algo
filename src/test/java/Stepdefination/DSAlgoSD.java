package Stepdefination;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgoSD {
	public static WebDriver driver;
	
	@Given("go to google page")
	public void go_to_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurg\\eclipse-workspace\\BDD_DS-Algo\\src\\test\\resources\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    
	}

	@When("click search textbox")
	public void click_search_textbox() {
		driver.findElement(By.name("q")).click();

	}

	@And("search for BDD")
	public void search_for_bdd() {
		driver.findElement(By.name("q")).sendKeys("BDD"+Keys.ENTER);
	}

	@Then("search result will be displayed")
	public void search_result_will_be_displayed() {
	    System.out.println("test verified");
	}

}
