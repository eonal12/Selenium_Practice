package kendi_calismalarim;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Task01_JUnit {

//    *** Aşağıdaki Task'i Junit framework'u ile yapınız
//      - ebay sayfasına gidiniz
//      - electronics bölümüne tıklayınız
//      - Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
//      - Her sayfanın sayfa başlığını yazdıralım
//      - sayfayı kapatalım

    WebDriver driver;

    @Before
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ebay.com");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void ebay() {
        driver.findElement(By.xpath("(//a[text()='Electronics'])[2]")).click();
        List<WebElement> urunResimleri = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));

        for (int i = 0; i <urunResimleri.size() ; i++) {
            urunResimleri = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
            urunResimleri.get(i).click();
            System.out.println("Sayfa Başlıkları = " + driver.getTitle());
            driver.navigate().back();
        }



    }
}
