package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class AutomationPractice {
//declare webdriver as global
    WebDriver driver;
    @Given("launch browser {string}")
    public void launch_browser(String browserName) {
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            System.out.println("Invalid browser name: "+browserName);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @And("enter the url {string} and close login popup")
    public void enter_the_url_and_close_login_popup(String url) {
        driver.get(url);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
    }
    @When("in search bar enter {string} as item name")
    public void in_search_bar_enter_as_item_name(String itemName) {
        driver.findElement(By.name("q")).sendKeys(itemName, Keys.ENTER);
    }
    @Then("print all the iphone device names")
    public void print_all_the_iphone_device_names() {
        List<WebElement> items = driver.findElements(By.xpath("//div[contains(text(), 'APPLE iPhone')]"));
        for(WebElement item: items){
            System.out.println(item.getText());
        }
        driver.close();
    }
}
