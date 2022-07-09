import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Project\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://ru.wikipedia.org/wiki/");

        driver.get("https://google.ru/");

       WebElement input = driver.findElement(By.tagName("input"));
       input.sendKeys("Byndyusoft");
       input.submit();

       driver.findElements(By.partialLinkText("Byndyusoft")).get(0).click();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       ((JavascriptExecutor)driver).executeScript("scroll(0, 1200);");
//
//       driver.findElement(By.xpath("/html/body/section/div/span")).sendKeys(Keys.ENTER);
//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(new By.ByClassName("featured__button"))));

//        WebElement butt = driver.findElement(By.xpath("(//span[text()='Заказать презентацию'])[4]"));
//        butt.click();
//        String par = butt.getText();
//        System.out.println(par);

    }
}
