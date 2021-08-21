package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Base64;

public class _02_YonTuslarıSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions actions = new Actions(driver);
        WebElement txtBox =  driver.findElement(By.id("autoCompleteMultipleInput"));

        Action action =  actions.moveToElement(txtBox)
                        .click().sendKeys("b")
                        .build();
                        action.perform();
        Bekle(2);
        action = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        action.perform();
        Bekle(3);
        Kapat();

    }
}
