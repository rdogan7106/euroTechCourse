package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_IframeExample extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Sweden");

        driver.switchTo().frame(0);
        WebElement check = driver.findElement(By.id("a"));
        check.click();

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        WebElement eAnimals = driver.findElement(By.id("animals"));
        Select animals = new Select(eAnimals);
        animals.selectByIndex(1);
        Bekle(3);
        Kapat();
    }
}
