package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class XpathSelectors
{
    static WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsRadioPage(){
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hideBanner();
        hideFooter();

        WebElement yesRadioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBtn.click();
        pause(2);

        WebElement impressiveRadioBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioBtn.click();





    }
    @Test
    public void selectorsTextBox(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hideBanner();
        hideFooter();


        WebElement inputFullName = driver.findElement(By.xpath("//input[@id='userName']"));
        inputFullName.sendKeys("Test User");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@type='email']"));
        inputEmail.sendKeys("test123mail@gamil.com");
        WebElement inputCurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        inputCurrentAddress.sendKeys("Test Address, Test City");
        WebElement inputPermanentAddress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
        inputPermanentAddress.sendKeys("Test Address, Test City");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        submitBtn.click();
        WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
        System.out.println(output.getText());
        pause(2);
        driver.quit();

    }


    private void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    public static void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }
}
