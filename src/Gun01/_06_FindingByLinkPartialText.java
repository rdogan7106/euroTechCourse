package Gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkPartialText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.partialLinkText("Passion"));
        System.out.println("element.getAttribute(\"data-value \") = " + element.getAttribute("data-value"));
        System.out.println("element.getAttribute(\"href\") = " + element.getAttribute("href"));


        Thread.sleep(3000);
        driver.quit();
    }
}
