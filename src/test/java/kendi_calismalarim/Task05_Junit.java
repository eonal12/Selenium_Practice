package kendi_calismalarim;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Task05_Junit extends TestBase {

// http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
// Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
// Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
// Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
// Çıkan alert'te iptal butonuna basınız
// Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
// Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
// Çıkan mesajı konsola yazdırınız
// Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız



    @Test
    public void name() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Thread.sleep(2000);
        String str = "Emre ÖNAL";
        driver.switchTo().alert().sendKeys(str);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String actualResult = driver.findElement(By.cssSelector("p[id=demo1]")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,"Hello " + str + " How are you today");

    }
}
