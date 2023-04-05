package day_03_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropDownOptions {

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void name() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com");

        // dropdown'dan "Baby" secenegini secin
        WebElement ddm = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Baby");

        // sectiginiz option'i yazdirin
        String sectigimOption = select.getFirstSelectedOption().getText();
        System.out.println("sectigimOption = " + sectigimOption);

        // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

        List<WebElement> allOptions = select.getOptions();
        Assert.assertEquals(28,allOptions.size());

        // dropdown'daki optionların tamamını yazdırın
        int sayac=1;
        for (WebElement each : allOptions) {
            System.out.println( sayac + ". option = " + each.getText());
            sayac++;
        }



    }
}
