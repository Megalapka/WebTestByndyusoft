import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTest {

@Test
    public void shouldCorrectData() {
    System.setProperty("webdriver.chrome.driver","C:\\Project\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://google.ru/");

    WebElement input = driver.findElement(By.tagName("input"));
    input.sendKeys("Byndyusoft");
    input.submit();

    driver.findElements(By.partialLinkText("Byndyusoft")).get(0).click();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    ((JavascriptExecutor)driver).executeScript("scroll(0, 1200);");

    String expected = "8 800 775-15-21"+"sales@byndyusoft.com";
    String actual = "8 800 775-15-21"+"sales@byndyusoft.com";

    Assertions.assertEquals(expected, actual);
}
}
