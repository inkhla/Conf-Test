package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    // header elements locators
    protected By aboutConfHeader = By.xpath("(//a[@class='menu_item'])[1]");
    protected By confGoalsHeader = By.xpath("(//a[@class='menu_item'])[2]");
    protected By confTopicsHeader = By.xpath("(//a[@class='menu_item'])[3]");
    protected By forYouHeader = By.xpath("(//a[@class='menu_item'])[4]");

    // header methods
    /*
    1 ---> About Conference - عن المؤتمر
    2 ---> Conference Goals - أهداف المؤتمر
    3 ---> Conference Topics - محاور المؤتمر
    4 ---> For You - معلومات تهمك
    * */
    public String getHeaderElementText(int elementIndex) {
        String result = "";
        switch (elementIndex) {
            case 1:
                result = wait.until(ExpectedConditions.visibilityOfElementLocated(aboutConfHeader)).getText();
                break;
            case 2:
                result = wait.until(ExpectedConditions.visibilityOfElementLocated(confGoalsHeader)).getText();
                break;
            case 3:
                result = wait.until(ExpectedConditions.visibilityOfElementLocated(confTopicsHeader)).getText();
                break;
            case 4:
                result = wait.until(ExpectedConditions.visibilityOfElementLocated(forYouHeader)).getText();
                break;
            default:
                break;
        }
        return result;
    }
}
