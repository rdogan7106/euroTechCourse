package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElement_Tag extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");
        List<WebElement> liste = driver.findElements(By.tagName("li"));
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println("liste = " + liste.get(i).getText());
            
        }
        Bekle(3);
        Kapat();
    }

}
