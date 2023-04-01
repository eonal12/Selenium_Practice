package kendi_calismalarim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class YoutubeYorumYaz {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.youtube.com/ sayfasına git
        driver.get("https://www.youtube.com/");

        //Login işlemlerini yap

//        driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")).click();
//        driver.findElement(By.id("identifierId")).sendKeys("emreonal12@gmail.com"+Keys.ENTER);


//        //arama kutusunda techproeducationtr araması yap
//        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='search_query']"));
//        aramaKutusu.sendKeys("techproeducationtr");
//        aramaKutusu.submit();
//
//        //techproeducation YouTube kanalına git
//        driver.findElement(By.xpath("//*[text()='TechProEducation TR']")).click();
//
//        //videolar seçeneğine tıkla
//        driver.findElement(By.xpath("//div[text()='Videolar']")).click();
//
//        //Çıkan ilk videoya tıkla
//        driver.findElement(By.xpath("(//a[@id='thumbnail'])[28]")).click();
//
//        //Yorum yazabilmek için yorum kutucuğuna tıkla
//        driver.findElement(By.id("placeholder-area")).click();

    }
}
