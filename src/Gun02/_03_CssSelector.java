package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class _03_CssSelector extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.practiceselenium.com/");
        WebElement element = driver.findElement(By.cssSelector("[class='wsb-element-image'][data-type='element']"));
        WebElement element2 = driver.findElement(By.cssSelector("div[class='txt ']>p>span"));
        Bekle(2);
        Kapat();
    }
}
