package Gun04;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class _02_DragAndDrop2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar = new Actions(driver);
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement debit = driver.findElement(By.id("bank"));
        Action act = aksiyonlar.dragAndDrop(bank,debit).build();
        act.perform();
        Bekle(2);
        WebElement debitText = driver.findElement(By.cssSelector("#bank>li"));
        Assert.assertTrue(debitText.getText().equals(debit.getText()));
        Bekle(2);
        Kapat();

    }
}
