package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Iframe extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");



        WebElement elementFrame1 = driver.findElement(By.name("iamframe"));
        driver.switchTo().frame(elementFrame1);

        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Sweden");

        Bekle(2);
        Kapat();
    }
}
