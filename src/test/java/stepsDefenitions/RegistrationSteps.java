package stepsDefenitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.User;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    User user = new User();

    @Given("^I open web (.*)$")
    public void isOpenOnlineDepo(String url){
        Configuration.startMaximized = true;
        open(url);
    }

    @Given("Shop Selector is visible")
    public void shopSelecterIsVisible(){ homePage.shopSelectorIsVisible();}

    @Given("Depo logo is visible")
    public void depoLogoIsVisible(){ homePage.depoLogoIsVisible();
    }
    @When("I select shop")
    public void selectShop(){homePage.selectShop();}

    @When("I press ieietVaiRegistreties button")
    public void OpenSingUpPage(){homePage.signUp();}

    @When("I press Registreties button")
    public void openRegistrationForm(){loginPage.openRegistrationForm();}

    @When("I fill form")
    public void fillForm(){registrationPage.fillRegistrationForm(user.getEmail(),user.getPassword(),
            user.getNameAndLastnameInOneString(), user.getPhoneNumber());}

    @When("I confirm registration")
    public void confimRegistration(){registrationPage.confirmRegistration();}

    @Then("I check that registration is completed")
    public void registrationConformationIsVisible(){registrationPage.registrationConformationIsVisible();}

    @Then("I close browser")
    public void closeBrowser() {homePage.closeBrowser();}

}
