package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.junit.*;

public class _05_Senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Bekle(1);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Bekle(1);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();


        WebElement sauceAdd = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        sauceAdd.click();
        Bekle(1);


        WebElement labsTshırt  = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        labsTshırt.click();
        Bekle(1);


        WebElement basket = driver.findElement(By.id("shopping_cart_container"));
        basket.click();
        Bekle(1);

        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();
        Bekle(1);

        WebElement firstName =  driver.findElement(By.id("first-name"));
        firstName.sendKeys("Zehra");
        Bekle(1);

        WebElement lastName  = driver.findElement(By.id("last-name"));
        lastName.sendKeys("dddd");
        Bekle(1);

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("1123");
        Bekle(1);

        WebElement contunie =  driver.findElement(By.id("continue"));
        contunie.click();
        Bekle(1);

        WebElement saucePrice  =  driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String strprice1 = saucePrice.getText().replaceAll("[^0-9.]","");
        System.out.println("strprice1 = " + strprice1);
        double price1 = Double.parseDouble(strprice1);
        Bekle(1);

        WebElement saucePrice2  =  driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String strprice2 = saucePrice2.getText().replaceAll("[^\\d.]","");
        System.out.println("strprice2 = " + strprice2);
        double price2 = Double.parseDouble(strprice2);
        Bekle(1);

        double totalPrice =  price1 +price2;
        System.out.println("totalPrice = " + totalPrice);

        WebElement subTotal = driver.findElement(By.className("summary_subtotal_label"));
        String strSubTotal = subTotal.getText().replaceAll("[^\\d.]","");
        double subTotalPrice =  Double.parseDouble(strSubTotal);

        Assert.assertTrue(subTotalPrice==totalPrice);



        Bekle(2);


        Kapat();

    }

}
