package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.navigate().to("http://www.practiceselenium.com/");
        WebElement linkCheckOut = driver.findElement(By.linkText("Check Out"));
        linkCheckOut.click();
        Bekle(2);
        driver.navigate().back();

        Bekle(2);
        driver.navigate().forward();
        Bekle(2);
        Kapat();
    }
}
