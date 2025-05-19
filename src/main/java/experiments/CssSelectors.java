package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class CssSelectors {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        pause(2);
        hideBanner();
        hideFooter();
        pause(2);
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));
        WebElement divElement = driver.findElement(By.cssSelector(".card-up"));
        divElement.click();
        hideFooter();
        WebElement radioBtn = driver.findElement(By.id("item-2"));
        radioBtn.click();
        hideFooter();
//        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
//        new Actions(driver)
//                .click(yesRadioBtn)
//                .perform();
        WebElement yesRadioBtn2 = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesRadioBtn2.click();
        pause(2);
        driver.navigate().back();
        pause(2);
        driver.navigate().back();
        pause(2);
        WebElement divBookStore = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:last-child"));
        divBookStore.click();
        pause(3);
        driver.navigate().back();
        WebElement divWidgets = driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:nth-child(4)"));
        divWidgets.click();
        //driver.quit();

    }

    public static void pause(int seconds) {
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