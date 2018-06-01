package ru.stq.pft.sopsmvd;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class TestTest {

    FirefoxDriver wd;
    final String SCREENSHOTS_FOLDER = "C:\\Users\\oivakina\\Desktop\\new"; //константа

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://sops.akb-it.ru:8080/mia-rst-web/?0&login=dkovalenko4");
    }
    
    @Test
    public void TestTest() throws IOException {
        wd.findElement(By.linkText("Электронная касса")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Реестры")).click();
        wd.findElement(By.linkText("Реестр заявок на Э-ВПД")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Реестр Э-ВПД")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Реестр заявок на бюджетные ассигнования ГЦСП")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Реестр транспортных организаций")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Реестр счетов, поступивших от транспортных организаций")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Лимиты")).click();
        wd.findElement(By.linkText("Лимиты ГЦСП Цели")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Лимиты ГЦСП Спецкодировки")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Администрирование")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Список сотрудников")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Список подразделений и КБК")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Настройки системы")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Загрузка ключа ГРС «Сирена-Трэвел»")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Справочники")).click();
        wd.findElement(By.linkText("Коды Бюджетной Классификации (КБК)")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Цели перевозки")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Категории проезда")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Степени родства")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Филиалы")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Подразделения")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Звания")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Аэропорты")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Аудит")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
        wd.findElement(By.linkText("Отчеты")).click();
        wd.findElement(By.id("body")).click();
        this.takeScreenShot (wd, SCREENSHOTS_FOLDER);
    }

    private void takeScreenShot(FirefoxDriver wd, String s) throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)wd);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(s);
        FileUtils.copyFileToDirectory(SrcFile, DestFile);
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
