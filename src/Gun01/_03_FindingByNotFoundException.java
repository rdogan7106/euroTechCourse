package Gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByNotFoundException {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        driver.manage().window().maximize();
        try {
            WebElement eleman = driver.findElement(By.id("eleman bulunamadı diyelim"));
            System.out.println(eleman.getText());

        }catch (Exception e){
            System.out.println("eleman bulunamadı");

        }
        Thread.sleep(2000);
        driver.quit();

    }
}
