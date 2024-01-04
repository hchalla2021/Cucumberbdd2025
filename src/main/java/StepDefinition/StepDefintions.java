package StepDefinition;
import PageObjects.SearchProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class StepDefintions {
    public WebDriver driver;
    public SearchProductPage searchprd;
    @Given("User launch amazon application using chrome browser")
    public void user_launch_amazon_application_using_chrome_browser() {
        driver = new ChromeDriver();
        searchprd = new SearchProductPage(driver);
    }
    @When("User navigate  to url {string}")
    public void user_navigate_to_url(String url) {
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @When("User Enter product name is {string}")
    public void user_enter_product_name_is(String prdtype) {
        searchprd.Enterproduct(prdtype);
    }
    @When("User click on Search button")
    public void user_click_on_search_button() {
        searchprd.ClickSearchbutton();
    }
    @Then("close the browser")
    public void close_the_browser() {
      driver.close();
    }
}
