package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        WebElement clickOne = driver.findElement(By.id("v8gzC"));
        
        Actions aksiyonlar =  new Actions(driver);
        Action action = aksiyonlar.moveToElement(clickOne).click().build();
        Bekle(1);
        action.perform();
    }
}
