package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_DragAndDrop3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar = new Actions(driver);
        WebElement besbin = driver.findElement(By.id("fourth"));
        WebElement box = driver.findElement(By.id("amt7"));
        Actions actions = new Actions(driver);
        Action act = actions.clickAndHold(besbin).moveToElement(box).release().build();
        act.perform();
        Bekle(2);
        Kapat();
    }
}
