package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SampleTest {
    WebDriver driver;
    @Given("launch browser")
    public void launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Given("enter the url")
    public void enter_the_url() {
      driver.get("https://demoqa.com/login");
    }
    @When("login page is displayed enter valid username and password")
    public void login_page_is_displayed_enter_valid_username_and_password() {
        driver.findElement(By.id("userName")).sendKeys("nithesh");
        driver.findElement(By.id("password")).sendKeys("password");
    }
    @When("click on submit button")
    public void click_on_submit_button() {
        driver.findElement(By.id("login")).click();
    }
    @Then("home page should be displayed")
    public void home_page_should_be_displayed() {
       String title =  driver.getTitle();
        System.out.println(title);
    }

    @When("login page is displayed enter invalid username and password")
    public void login_page_is_displayed_enter_invalid_username_and_password() {
        driver.findElement(By.id("userName")).sendKeys("nithesh");
        driver.findElement(By.id("password")).sendKeys("password");
    }
    @Then("Error message should display")
    public void error_message_should_display() {
        System.out.println("");
    }

    @When("login page is displayed enter invalid {string} and {string}")
    public void login_page_is_displayed_enter_invalid_and(String user, String password) {
        driver.findElement(By.id("userName")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
    }
}
