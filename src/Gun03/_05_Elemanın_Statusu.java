package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Elemanın_Statusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));
        tuesday.isDisplayed();
        tuesday.isEnabled();
        tuesday.isSelected();
        Bekle(2);
        tuesday.click();
        System.out.println(tuesday.isSelected());

    }
}
