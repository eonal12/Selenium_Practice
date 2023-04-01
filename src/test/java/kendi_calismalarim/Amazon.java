package kendi_calismalarim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.amazon.com.tr/ adresine git.
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("sp-cc-accept")).click();


        //Arama kutucuğunda "Dolma Kalem arat" ve sonuç yazısının görünürlüğünü kontrol et
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dolma Kalem"+Keys.ENTER);
        System.out.println("Arama sonuç yazısı görünür mü? = " + driver.findElement(By.xpath("//h1")).isDisplayed());


        //En Fazla 20 TL kutucuğunu işaretle
        driver.findElement(By.xpath("//span[text()='En Fazla 20 TL']")).click();
        String a = driver.getWindowHandle();
        System.out.println(a);

        //Çıkan sonucu ve sadece sonuç sayısını yazdır
        WebElement aramaSonucu = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println("Arama Sonucu = " + aramaSonucu.getText());
        System.out.println("Arama Sonuc Sayisi = " + aramaSonucu.getText().split(" ")[0]);


        //Arama sonucunda çıkan tüm ürünleri sepete ekle
        List<WebElement> urunler = driver.findElements(By.xpath("//img[@class='s-image']"));

        for (int i = 0; i <urunler.size() ; i++) {
            urunler = driver.findElements(By.xpath("//img[@class='s-image']"));
            urunler.get(i).click();
            WebElement sepeteEkle = driver.findElement(By.id("add-to-cart-button"));
            sepeteEkle.click();
            driver.navigate().to(a);
        }


    }
}
