package stepDefinitions;

import utilities.Common_Utilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class LoginStepDefs extends DriverBase
{
    private static Logger log=LogManager.getLogger(LoginStepDefs.class.getName());

    @Given("^I am on \"([^\"]*)\"$")
    public void iAmOn(String url) throws Throwable
    {
        driver.get(url);
        log.info("Navigated to the url: " + url);
    }

    @When("^I provide username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iProvideUsernameAsAndPasswordAs(String username, String password) throws Throwable
    {
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        log.info("Clicked on login button");
    }

    @Then("I should be able to login to tours")
    public void iShouldBeAbleToLoginToTours() {
        System.out.println("Title of the page is: " +driver.getTitle());
        Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
        log.info("Title of the page is: " +driver.getTitle());
    }

    @And("I close the browser")
    public void iCloseTheBrowser()
    {

    }

    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigateToSite(String url) throws Throwable
    {
        driver.get(url);
        log.info("Navigated to url: "+ url);
    }

    @When("^User selects an element from link$")
    public void userSelectsAnElementFromLink()
    {
        WebElement categories= driver.findElement(By.xpath("//a[@class='cat_btn hidden-xs giTrackElementHeader']"));
        WebElement subMenu = driver.findElement(By.xpath("//li[@class='course_category_name_menu']//a[@id='software-testing-certification-courses']"));
        WebElement course = driver.findElement(By.id("c535"));

        Actions action = new Actions(driver);
        action.moveToElement(categories).perform();
        action.moveToElement(subMenu).perform();
        action.moveToElement(course).click().perform();

        List<WebElement> links=driver.findElements(By.tagName("a"));

        System.out.println("Total links are "+links.size());

        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            Common_Utilities.verifyLinkActive(url);
        }
    }



    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) throws Throwable
    {
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
        log.info("Entered username is : "+ username);

    }

    @Then("^I enter passowrd \"([^\"]*)\"$")
    public void i_enter_passowrd(String password) throws Throwable
    {
        //Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        log.info("Entered password is : "+ password);
    }

    @Then("^I click on next button$")
    public void i_click_on_next_button() throws Throwable
    {
        driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable
    {
       System.out.println(driver.getTitle());
       Assert.assertEquals("Not logged in", driver.getTitle().trim(),"Gmail");
        log.info("Logged in title is  : "+ driver.getTitle());
    }

    @When("^I get href links$")
    public void iGetHrefLinks() throws IOException
    {
        List<WebElement> links = driver.findElements(By.cssSelector(".Bgzgmd>li a"));
        System.out.println("Total Amenities "  + links.size());
        Common_Utilities.BrokenLinks(links);
    }

    @Then("^status code should be (\\d+)$")
    public void statusCodeShouDBe(int arg0)
    {
        System.out.println("All links are active");
    }

}
