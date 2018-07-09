package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String giftrt) throws Throwable {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Topesho\\Documents\\Java Training\\src\\test\\resources\\Feature\\GeckoDriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Topesho\\Documents\\FirstWeb\\src\\test\\chromedriver.exe");

        //WebDriver Driver = new ChromeDriver();
        WebDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://dev.giftrt.com/");

        Driver.close();

    }

    @When("^I click on register$")
    public void iClickOnRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my first name$")
    public void iEnterMyFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my last name$")
    public void iEnterMyLastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my email$")
    public void iEnterMyEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I confirm my password$")
    public void iConfirmMyPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I click sign up button$")
    public void iClickSignUpButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be registered$")
    public void iShouldBeRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my invalid email$")
    public void iEnterMyInvalidEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my first name \"([^\"]*)\"$")
    public void iEnterMyFirstName(String firstname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my last name \"([^\"]*)\"$")
    public void iEnterMyLastName(String lastname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my email \"([^\"]*)\"$")
    public void iEnterMyEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter my password\"([^\"]*)\"$")
    public void iEnterMyPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I confirm my password \"([^\"]*)\"$")
    public void iConfirmMyPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
