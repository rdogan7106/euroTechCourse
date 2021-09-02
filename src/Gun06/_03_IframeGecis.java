package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IframeGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Sweden");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement eAnimals = driver.findElement(By.id("animals"));

        Bekle(2);
        Kapat();

        Select animals=new Select(eAnimals);
        animals.selectByIndex(2);
    }
}
