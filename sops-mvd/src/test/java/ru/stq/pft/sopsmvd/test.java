import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class test {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void test() {
        wd.get("http://sops.phoenixit.ru:8080/mia-rst-web/EvpdRequestPage?16");
        wd.findElement(By.linkText("Добавить данные по Э-ВПД")).click();
        if (!wd.findElement(By.xpath("//select[@id='id751']//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='id751']//option[10]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='overCategory']//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='overCategory']//option[4]")).click();
        }
        wd.findElement(By.xpath("//select[@id='rank']//option[4]")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
