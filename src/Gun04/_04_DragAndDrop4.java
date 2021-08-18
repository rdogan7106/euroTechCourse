package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_DragAndDrop4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        WebElement leftScroll = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        WebElement rightScroll = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));

        Actions actions = new Actions(driver);
        Action action1 = actions.dragAndDropBy(leftScroll,100,0).build();
        action1.perform();
        Bekle(2);

        Actions actions2 =  new Actions(driver);
        Action action2 = actions2.dragAndDropBy(rightScroll,-100,0).build();
        action2.perform();
        Bekle(2);
    }
}
