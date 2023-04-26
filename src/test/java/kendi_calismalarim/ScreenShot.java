package kendi_calismalarim;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends TestBase {
    @Test
    public void name() throws IOException {
        driver.get("https://haberturk.com");
        bekle(2);
        String dosyaYolu = "C:/Users/emreo/OneDrive/Masaüstü/Yeni klasör/001.png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        File a = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(a, new File(dosyaYolu));
    }

    @Test
    public void name1() throws IOException {
        driver.get("https://ebay.com");
        String dy = "C:/Users/emreo/OneDrive/Masaüstü/Yeni klasör/001.jpeg";
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dy));
    }
}
