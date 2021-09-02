package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_Wait1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement samsung =  driver.findElement(By.xpath("(//a[@class='hrefch'])[1]"));
        samsung.click();

        WebElement addCartBtn = driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
        addCartBtn.click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());


        driver.switchTo().alert().accept();
        Kapat();
    }
}
