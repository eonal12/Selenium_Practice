package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitle = driver.getTitle();
        System.out.println("teknosaTitle = " + teknosaTitle);

        String teknosaUrl = driver.getCurrentUrl();
        System.out.println("teknosaUrl = " + teknosaUrl);
        Thread.sleep(2000);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz

        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Title Teknoloji içeriyor");
        }else
            System.out.println("Title Teknoloji içermiyor");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaUrl.contains("teknosa")){
            System.out.println("Url teknosa içeriyor");
        }else
            System.out.println("Url teknosa içermiyor");

        // "https://medunna.com/" adresine gidiniz
        driver.navigate().to("https://medunna.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle = driver.getTitle();
        System.out.println("medunnaTitle = " + medunnaTitle);
        String medunnaUrl = driver.getCurrentUrl();
        System.out.println("medunnaUrl = " + medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA içeriyor");
        }else
            System.out.println("Title MEDUNNA içermiyor");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("Url medunna içeriyor");
        }else
            System.out.println("Url medunna içermiyor");


        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // pencereyi kapat
        driver.close();
    }
}
