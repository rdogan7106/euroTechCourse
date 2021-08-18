package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_GetAttributesCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        WebElement inputVal = driver.findElement(By.id("inputValEnter"));

        System.out.println(inputVal.getAttribute("name"));
        System.out.println(inputVal.getAttribute("type"));
        System.out.println(inputVal.getAttribute("class"));
        System.out.println("-------");
        System.out.println(inputVal.getCssValue("color"));
        System.out.println(inputVal.getCssValue("font-size"));
        System.out.println( inputVal.getCssValue("background"));

    }
}
