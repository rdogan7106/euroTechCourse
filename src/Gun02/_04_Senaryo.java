package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _04_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business =  driver.findElement(By.id("u_xoR_4586"));
        business.click();
        Bekle(1);

        Select selectOption = new Select(driver.findElement(By.id("u_xoR_4588")));
        selectOption.selectByIndex(2);
        selectOption.getOptions();
        Bekle(1);

        WebElement everDay = driver.findElement(By.id("u_xoR_89585_0"));
        everDay.click();
        Bekle(1);

        WebElement good = driver.findElement(By.id("u_xoR_4589_0"));
        good.click();
        Bekle(1);

        Select haveBeen = new Select(driver.findElement(By.id("u_xoR_4597")));
        haveBeen.selectByIndex(1);
        haveBeen.getOptions();
        Bekle(1);

        WebElement message =  driver.findElement(By.id("u_xoR_89597"));
        message.sendKeys("Please tell us about yourself");
        Bekle(1);

        WebElement submitBtn =driver.findElement(By.cssSelector("input[name='submit']"));
        submitBtn.click();



        Bekle(3);
        Kapat();
    }
}
