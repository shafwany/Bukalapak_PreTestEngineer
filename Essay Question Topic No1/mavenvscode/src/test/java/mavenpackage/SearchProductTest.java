package mavenpackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProductTest {
    
    @Test
    public void sampleTestMethod() throws InterruptedException 
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bukalapak.com/p/handphone/aksesoris-handphone/charger-177/27wphe3-jual-uneed-quickplug-smart-charger-qc-4-0-pd-with-led-display-uch404-plus?from=homepage&source=fvt&panel=2&type=recommendation");
        // driver.findElement(By.id("v-omnisearch__input")).sendKeys("helm sepeda");
        driver.findElement(By.id("section-main-product")).click();
        Thread.sleep(10000);
    }
}
