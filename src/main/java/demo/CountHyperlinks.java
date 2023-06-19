package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class CountHyperlinks {
    ChromeDriver driver;
    public CountHyperlinks()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        driver.close();
        driver.quit();

    }

    
    public  void count() throws InterruptedException{
        System.out.println("Start Test case: CountHyperlinks");

        // Navigate to URL  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");

        // Locate & store all the links Using Locator "XPath" //a[@href]
        List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
        Thread.sleep(5000);

        // count all the links Using Locator "XPath" //a[@href]
        System.out.println("No. of links: " + links.size());
        
        System.out.println("end Test case: CountHyperlinks");
    }


}
