package Gun05;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _08_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://seleniumeasy.com/test/ajax/-form-submit-demo.html");
        WebElement name =  driver.findElement(By.id("title"));
        name.sendKeys("rm");
        WebElement submit =  driver.findElement(By.id("btn-submit"));
        submit.click();

        WebElement mesaj =driver.findElement(By.id("submit-control"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Succesfully!"));

        Assert.assertEquals("Form submited Succesufully",mesaj.getText());
    }

}
