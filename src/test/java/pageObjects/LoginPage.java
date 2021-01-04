package pageObjects;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public String email = "TextField140";
    public String password = "TextField64";
    public String registrationButton = "#app > div.body > div.alreadyHaveContSection > div > div > div";

    public void openRegistrationForm() {$(registrationButton).click();}
}
