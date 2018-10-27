package step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Files {

	
	static WebDriver driver=null;
@Given("^User is in fb log in page$")
public void user_is_in_fb_log_in_page()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\eclipse-workspace\\new\\Cucumber-Selenium\\src\\Drivers\\chromedriver.exe");
    driver.get("https://www.facebook.com/");
 


}

@When("^The user enters userid and password$")
public void the_user_enters_userid_and_password(DataTable credentials) throws Throwable {
	List<String> credentiallist=credentials.asList(String.class);
	 driver.findElement(By.id("email")).sendKeys(credentiallist.get(0));
	 driver.findElement(By.id("pass")).sendKeys(credentiallist.get(1));
	 
}

@When("^The user clicks submit button$")
public void the_user_clicks_submit_button() throws Throwable {
	driver.findElement(By.id("u_0_8")).click();
}

@Then("^The user should see thee home page of fb$")
public void the_user_should_see_thee_home_page_of_fb() throws Throwable {
	System.out.println("done");



	
}
}