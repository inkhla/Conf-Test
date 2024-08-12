package setup;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Setup {
    private WebDriver driver;
    private ChromeOptions chromeOptions;
    protected static ExtentReports extent;
    protected static ExtentSparkReporter htmlReporter;

    @BeforeSuite
    public void setupReport() {
        extent = new ExtentReports();
        htmlReporter = new ExtentSparkReporter("src/test/resources/reports/API_test_report.html");
        extent.attachReporter(htmlReporter);
    }

    @BeforeClass
    public void setup() {
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--ignore-ssl-errors=yes");
        driver = new ChromeDriver(chromeOptions);
        goHome();
    }

    public HomePage goHome() {
        driver.get("");
        return new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}
