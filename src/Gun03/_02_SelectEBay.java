package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com");
        WebElement selectMenu =  driver.findElement(By.id("gh-cat"));
        driver.manage().deleteAllCookies();

        Select menu = new Select(selectMenu);
        menu.selectByValue("2984");

        WebElement searcBtn = driver.findElement(By.id("gh-shop-a"));
        searcBtn.click();
        Bekle(2);
        Kapat();
    }
}
