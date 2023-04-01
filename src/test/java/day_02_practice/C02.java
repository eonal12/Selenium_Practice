package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");

        // sayfa baslıgının "Google" kelimesini icerdigini test edin
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Google";

        if (actualPageTitle.contains(expectedPageTitle)){
            System.out.println("Sayfa Başlığı " + expectedPageTitle + " kelimesini içeriyor.");
        }else
            System.out.println("Sayfa Başlığı " + expectedPageTitle + " kelimesini içermiyor.");

        Thread.sleep(2000);

        // arama cubuguna "Nutella" yazıp aratın
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Nutella", Keys.ENTER);

        // bulunan sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String sonucSayisi = sonucYazisi.getText().split(" ")[1];
        System.out.println("Sonuc Sayisi = " + sonucSayisi);

        // sonuc sayısının 100000000  fazla oldugunu test edin

        String sonucc = sonucSayisi.replaceAll("\\D","");

        if (Integer.parseInt(sonucc)>100000000){
            System.out.println("Sonuc sayisi 100000000'dan fazla");
        }else {
            System.out.println("Sonuc sayisi 100000000'dan fazla degil");
        }

        // sayfayı kapatın
            driver.close();


    }
}
