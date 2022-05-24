package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class New {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun
//2- https://www.google.com/ adresine gidin
//3- cookies uyarisini kabul ederek kapatin
//4-Sayfa basliginin "Google" ifadesi icerdigini test edin
//5- Arama cubuguna "Nutella" yazip aratin
//6-Bulunan sonuc sayisini yazdirin
//7- sonuc sayisinin 10 milyon'dan fazla oldugunu test edin
//8-Sayfayi kapatin

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");

        Actions obje =new Actions(driver);
        obje.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        //4-Sayfa basliginin "Google" ifadesi icerdigini test edin
   //     WebElement driver =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));

    }
}
