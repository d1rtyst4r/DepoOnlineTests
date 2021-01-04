package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public String inputEmail = "/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/input";
    public String inputPassword = "/html/body/div[1]/div[1]/div[2]/div[2]/div[3]/div/div/input";
    public String inputNameAndLastname = "/html/body/div[1]/div[1]/div[2]/div[2]/div[4]/div/div/input";
    public String inputPhone = "#app > div.body > div.loginComponentWrapper > div.loginAreaWrapper.ms-Grid-col.ms-sm10.ms-md6.ms-lg6 > div.juridicalLoginAreaWrapper > div.loginInputValue.inputPhoneWrapper > div > input";
    public String emailHitBox = "#app > div.body > div.loginComponentWrapper > div.loginAreaWrapper.ms-Grid-col.ms-sm10.ms-md6.ms-lg6 > div.juridicalLoginAreaWrapper > div:nth-child(2) > label > div > i";
    public String phoneHitBox = "#app > div.body > div.loginComponentWrapper > div.loginAreaWrapper.ms-Grid-col.ms-sm10.ms-md6.ms-lg6 > div.juridicalLoginAreaWrapper > div:nth-child(3) > label > div > i";
    public String applyHitBox = "/html/body/div[1]/div[1]/div[2]/div[2]/div[5]/div[6]/div[2]/label/div/i";
    public String registrationButton = "#app > div.body > div.loginComponentWrapper > div.loginAreaWrapper.ms-Grid-col.ms-sm10.ms-md6.ms-lg6 > div.loginButtonWrapper > button";
    public String conformationOfRegistration = "//*[contains(text(),'Lietotāja profils izveidots. Uz reģistrācijas formā norādīto e-pasta adresi nosūtīta instrukcija profila aktivizēšanai.')]";
    public void fillRegistrationForm(String email, String password, String nameAndLastname, String phone){
        $(By.xpath(inputEmail)).setValue(email);
        $(By.xpath(inputPassword)).setValue(password);
        $(By.xpath(inputNameAndLastname)).setValue(nameAndLastname);
        $(inputPhone).setValue(phone);
        $(emailHitBox).click();
        $(By.xpath(applyHitBox)).click();
    }
    public void confirmRegistration(){$(registrationButton).click();}

    public void registrationConformationIsVisible(){$(By.xpath(conformationOfRegistration)).isDisplayed();}
}
