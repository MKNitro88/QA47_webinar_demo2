package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), this);

    }
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement inputFirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement inputEmail;
    @FindBy(xpath = "//div[@id='genterWrapper']/div/div[1]")
    WebElement radioGenderMale;
    @FindBy(xpath = "//div[@id='genterWrapper']/div/div[2]")
    WebElement radioGenderFemale;
    @FindBy(xpath = "//div[@id='genterWrapper']/div/div[3]")
    WebElement radioGenderOther;
    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement inputMobileNumber;
    @FindBy(id ="dateOfBirthInput")
    WebElement inputDateOfBirth;
    @FindBy(id="subjectsInput")
    WebElement inputSubjects;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement inputCurrentAddress;


    public void typePracticeForm(){
        hideBanner();
        hideFooter();

    }
}
