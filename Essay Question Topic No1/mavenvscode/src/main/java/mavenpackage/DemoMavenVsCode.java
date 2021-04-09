package mavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMavenVsCode {
    public static void main(String[] args) throws InterruptedException { 

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://jsonplaceholder.typicode.com/posts");

            Thread.sleep(3000);
            
            driver.quit();
    }

}

 