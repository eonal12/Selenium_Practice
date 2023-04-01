package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // Kaynak Kodlarini konsola yazdiriniz
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (pageSource.contains("Gateway")){
            System.out.println("Kaynak Kodlarında Gateway Yaziyor");
        }else
            System.out.println("Kaynak Kodlarında Gateway Yazmiyor ");

        // sayfayi kapatiniz
        driver.close();


    }
}
