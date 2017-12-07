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

public class SecondTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void SecondTest() {
        wd.get("http://sops.phoenixit.ru:8080/mia-rst-web/EvpdRequestPage?16");
        wd.findElement(By.linkText("Добавить данные по Э-ВПД")).click();
        wd.findElement(By.id("docSeries")).click();
        wd.findElement(By.id("docSeries")).clear();
        wd.findElement(By.id("docSeries")).sendKeys("3454");
        wd.findElement(By.id("docNum")).click();
        wd.findElement(By.id("docNum")).clear();
        wd.findElement(By.id("docNum")).sendKeys("456565");
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).sendKeys("пампушкин");
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).sendKeys("алексей");
        wd.findElement(By.id("id5cf")).click();
        wd.findElement(By.id("id5cf")).clear();
        wd.findElement(By.id("id5cf")).sendKeys("васильевич");
        wd.findElement(By.id("evpdEdForm")).click();
        wd.findElement(By.id("input-birth-date")).click();
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[93]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[93]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[5]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[5]")).click();
        }
        wd.findElement(By.linkText("14")).click();
        if (!wd.findElement(By.id("id5d2")).isSelected()) {
            wd.findElement(By.id("id5d2")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='id5c9']//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='id5c9']//option[10]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='overCategory']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='overCategory']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='rank']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='rank']//option[3]")).click();
        }
        wd.findElement(By.id("post")).click();
        wd.findElement(By.id("post")).clear();
        wd.findElement(By.id("post")).sendKeys("2000");
        wd.findElement(By.id("post")).click();
        wd.findElement(By.id("post")).clear();
        wd.findElement(By.id("post")).sendKeys("должность");
        wd.findElement(By.xpath("//div[@id='evpdEdForm']/div[14]")).click();
        wd.findElement(By.id("subdivCode")).click();
        wd.findElement(By.id("subdivCode")).clear();
        wd.findElement(By.id("subdivCode")).sendKeys("2000");
        if (!wd.findElement(By.xpath("//select[@id='tripType']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='tripType']//option[3]")).click();
        }
        wd.findElement(By.id("button-edit-save")).click();
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
