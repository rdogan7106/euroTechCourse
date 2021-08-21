package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionHoverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etys.com/");
        Actions actions = new Actions(driver);
        WebElement mucevher =  driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye =  driver.findElement(By.id("side-nav-category-link-10873"));
        Action action = actions.moveToElement(mucevher).build();
        action.perform();
        Bekle(2);
        Kapat();
    }
}
