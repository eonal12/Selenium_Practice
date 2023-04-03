package kendi_calismalarim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Task04_JUnit extends TestBase {
//-Amazon sayfasına gidelim
//-Arama Kutusundaki Dropdown menuyu yazdıralım
//-Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
// başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
// Not: Select Class'ı kullanalım


    @Test
    public void test01() {
        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
        Select select = new Select(aramaKutusu);
        select.getOptions().forEach(t-> System.out.println(t.getText()));
    }



    @Test
    public void test02() {
        driver.get("https://amazon.com");
        for (int i = 1; i <6 ; i++) {
            WebElement dropDown = driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
            ddmIndex(dropDown,i);
            driver.findElement(By.id("nav-search-submit-button")).click();
            System.out.println(driver.getTitle());
        }
    }


}
