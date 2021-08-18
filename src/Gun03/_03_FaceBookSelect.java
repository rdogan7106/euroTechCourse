package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_FaceBookSelect extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com");
        driver.manage().deleteAllCookies();

        WebElement acceptCookies =  driver.findElement(By.cssSelector("button[class^='_42'][id^='u_0'][title='Godkänn alla']"));
        acceptCookies.click();
        WebElement btnNewAccount = driver.findElement(By.cssSelector("a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        btnNewAccount.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("rahman");
        WebElement surName = driver.findElement(By.name("lastname"));
        surName.sendKeys("dogan");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("sad123@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123asd");
        WebElement day = driver.findElement(By.id("day"));
        Select s_day = new Select(day);
        s_day.selectByIndex(17);
        WebElement mouth = driver.findElement(By.id("month"));
        Select s_mouth = new Select(mouth);
        s_mouth.selectByIndex(6);
        WebElement year =  driver.findElement(By.id("year"));
        Select s_year = new Select(year);
        s_year.selectByValue("1990");
        WebElement man = driver.findElement(By.cssSelector("input[class^='_8esa'][value='2']"));
        man.click();

        WebElement email2= driver.findElement(By.name("reg_email_confirmation__"));
        email2.sendKeys("sad123@gmail.com");
        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();



    }
}
