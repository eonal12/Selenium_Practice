package kendi_calismalarim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
import java.util.Random;

public class Task06_Junit extends TestBase {
// https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
// ikinci emojiye tıklayın
// İkinci emoji öğelerini yazdırınız
// Parent iframe e geri donun
// Formu doldurun,(Formu istediğiniz metinlerle doldurun)
// Apply button a basiniz


    @Test
    public void iFrame() {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın
        // iFrame içerisinde olduğu için önce frame'e geçiş yapıyoruz
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        // tüm ikinci emoji öğelerini yazdırınız
        System.out.println(driver.findElement(By.xpath("//div[@id='nature']")).getText());

        // parent iframe e geri donun
        driver.switchTo().parentFrame();

        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        List<WebElement> form = driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        String str = "Emre";
        for (int i = 0; i <form.size() ; i++) {
            form.get(i).sendKeys(str + i);
        }

        // apply button a basiniz
        driver.findElement(By.id("send")).click();




    }
}
