package Gun05;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertExample2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement clickMe2 =  driver.findElement(By.cssSelector("input[name='submit']"));
        clickMe2.click();
        Bekle(2);
        driver.switchTo().alert().sendKeys("rhm");
        driver.switchTo().alert().accept();

        WebElement textActual =  driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(textActual.getText().contains("ismet"));
        Bekle(2);
        Kapat();
    }
}
