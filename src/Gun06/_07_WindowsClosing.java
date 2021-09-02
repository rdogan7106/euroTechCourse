package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _07_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String homePageId = driver.getWindowHandle();
        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement li : links) {
            li.click();
        }
        Set<String> windowsIds = driver.getWindowHandles();
        for(String id: windowsIds){
            if (id.equals(homePageId)){
                continue;
            }
            System.out.println("id"+id);
            driver.switchTo().window(id);
            driver.close();
        }

    }
}
