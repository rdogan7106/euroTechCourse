package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class _07_ExplicitWait extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explict-wait-in-selenium.html");
        WebElement button = driver.findElement(By.cssSelector("[onclick='timeText()']"));
        button.click();
        WebDriverWait waits = new WebDriverWait(driver,5);
       // WebElement webDriverText = waits.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        Bekle(2);
        Kapat();

    }
}
