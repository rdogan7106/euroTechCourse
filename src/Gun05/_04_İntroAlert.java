package Gun05;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_İntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement clickMe1 =  driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();
        Bekle(2);
        driver.switchTo().alert().sendKeys("rhm");
        driver.switchTo().alert().accept();

        WebElement textActual =  driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(textActual.getText().contains("ismet"));
        Bekle(2);
        Kapat();
    }
}
