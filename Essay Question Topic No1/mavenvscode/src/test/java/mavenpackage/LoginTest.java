package mavenpackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    
    @Test
    public void sampleTestMethod() throws InterruptedException 
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.bukalapak.com/login");
        driver.findElement(By.id("user_session_username")).sendKeys("test@mail.com");
        driver.findElement(By.id("user_session_password")).sendKeys("cobatest");
        driver.findElement(By.id("body > main > div > div.form-container.bordered > div.form-box > form > div:nth-child(5) > button")).click();
        Thread.sleep(10000);
    }
}
