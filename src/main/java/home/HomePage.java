package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
}
