package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";

        if (actualTagName.equals(expectedTagName)){
            System.out.println("TEST PASSED");
        }else
            System.out.println("TEST FAILED");

        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        String actualAttributeValue = aramaKutusu.getAttribute("name");
        String expectedAttributeValue = "field-keywords";
        if (actualAttributeValue.equals(expectedAttributeValue)){
            System.out.println("TEST PASSED");
        }else
            System.out.println("TEST FAILED");

        // sayfayi kapatiniz
        driver.close();

    }
}
