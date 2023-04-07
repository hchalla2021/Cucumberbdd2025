package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchProductPage {
    public WebDriver driver;
    public SearchProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchtext;
    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    WebElement searchbtn;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    WebElement clickiphone;

  public void Enterproduct(String prdtype) {
      searchtext.sendKeys(prdtype);
      searchbtn.click();
   }
    public void ClickSearchbutton() {
        searchbtn.click();
    }
}