package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


import javax.swing.*;

public class _01_ActionKeyControlSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions actions = new Actions(driver);

        WebElement txtBox  = driver.findElement(By.id("autoCompleteSingleInput"));
        Action action =actions.moveToElement(txtBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build();
        Bekle(2);
        Kapat();


    }
}
