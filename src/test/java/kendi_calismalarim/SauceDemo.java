package kendi_calismalarim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement ilkUrun =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        ilkUrun.click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();


    }
}
