package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class _06_WaitEnterance extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explict-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement button = driver.findElement(By.cssSelector("[onclick='timeText()']"));
        button.click();

        WebElement webDriverText =  driver.findElement(By.xpath("//p[text()='WebDriver']"));
        Bekle(2);
        Kapat();
    }
}
