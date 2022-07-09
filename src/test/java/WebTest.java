import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {

    @Test
    public void shouldCorrectData() {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://google.ru/");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Byndyusoft");
        input.submit();

        String url = driver.findElements(By.partialLinkText("Byndyusoft")).get(0).getAttribute("href");

        driver.get(url);


        WebElement btn = driver.findElement(By.cssSelector(".btn.btn--lg.btn--info.js-popup-callback-show"));
        btn.click();

        String phone = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/a[1]")).getText();
        String mail = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/a[2]")).getText();


        Assertions.assertEquals("8 800 775-15-21", phone);
        Assertions.assertEquals("sales@byndyusoft.com", mail);
    }
}
