package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://selenium.dev/");
        String homePageId=driver.getWindowHandle();
        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement li : links){
            li.click();

        }
        Set<String> windowIdler = driver.getWindowHandles();
        for(String win :windowIdler){
            if(win.equals(homePageId)){
                continue;
            }
            System.out.println("windowslar"+win);
            System.out.println("Title" + driver.getTitle());
        }
        Bekle(2);
        Kapat();
    }
}
