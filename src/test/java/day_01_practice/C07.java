package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella", Keys.ENTER);

        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println(linklerListesi.size());

        // linkleri yazdiriniz
        int sayac = 1;
        for (WebElement w : linklerListesi) {
            System.out.println(sayac + ". link : " + w.getText());
            sayac++;
        }

        // pencereyi kapatiniz
        driver.close();


    }
}
