package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class _01_SelectClass extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com");
        WebElement ddMenu = driver.findElement(By.id("searchDropdownBox"));
        Select menu = new Select(ddMenu);
        menu.selectByIndex(2);
        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();
        Bekle(2);
        Kapat();


    }
}
