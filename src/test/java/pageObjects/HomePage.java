package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class HomePage {
    public String logo = "topMenu > div.topMenuLeft > a > img";
    public String shopSelector = "gdprTitle";
    public String shopList = "#Dropdown49-option > div > button";
    public String bergiShop = "#Dropdown49-list0";
    public String dpilsShop = "#Dropdown49-list1";
    public String dreiliniShop = "#Dropdown49-list2";
    public String jpilsShop = "#Dropdown49-list3";
    public String krasta36Shop = "#Dropdown49-list4";
    public String liepajaShop = "#Dropdown49-list5";
    public String ulmanaShop = "#Dropdown49-list6";
    public String valmieraShop = "#Dropdown49-list7";
    public String okButton = "body > div:nth-child(8) > div > div > div > div.ms-Dialog-main.main-98 > div.ms-Modal-scrollableContent.scrollableContent-99 > div > div.ms-Dialog-inner.inner-127 > div > button";
    public String ieietVaiRegistretiesButton = "a.userSignUpButton";

    public void shopSelectorIsVisible() { $(shopSelector).isDisplayed();}

    public void depoLogoIsVisible() { $(logo).isDisplayed();}

    public void selectShop(){
        $(shopList).click();
        $(dreiliniShop).click();
        $(okButton).click();
    }
    public void signUp(){ $(ieietVaiRegistretiesButton).click();}

    public void closeBrowser(){closeWebDriver();}


}
