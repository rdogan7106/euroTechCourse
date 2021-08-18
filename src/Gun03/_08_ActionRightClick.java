package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionRightClick extends BaseStaticDriver {

    public static void main(String[] args) {


        driver.get("https://demoqa.com/buttons");


        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        Actions aksiyonlar = new Actions(driver);
        Action action = aksiyonlar.moveToElement(rightClick).contextClick().build();
        action.perform();

    }
}