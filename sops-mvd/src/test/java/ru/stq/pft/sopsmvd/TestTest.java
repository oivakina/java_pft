package ru.stq.pft.sopsmvd;

import org.apache.commons.io.FileUtils;
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

public class TestTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://sops.akb-it.ru:8080/mia-rst-web/?0&login=dkovalenko4");
    }
    
    @Test
    public void TestTest() {
        wd.findElement(By.linkText("Электронная касса")).click();
        File screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        String path = "./target/screenshots/" + screenshot.getName();
        FileUtils.copyFile(screenshot, new File(path));
//        wd.findElement(By.name("loginDiv:login")).click();
//        wd.findElement(By.name("loginDiv:login")).sendKeys("\\undefined");
//        wd.findElement(By.name("loginDiv:password")).click();
//        wd.findElement(By.name("loginDiv:password")).sendKeys("\\undefined");
        wd.findElement(By.linkText("Реестры")).click();
        wd.findElement(By.linkText("Реестр заявок на Э-ВПД")).click();
//        wd.findElement(By.linkText("Добавить заявку на воздушный транспорт")).click();
//        wd.findElement(By.id("button-cancel")).click();
//        wd.findElement(By.id("button-cancel-hidden")).click();
//        wd.findElement(By.xpath("//a[@id='link-add-request-rzd']/span/span")).click();
//        wd.findElement(By.id("button-cancel")).click();
//        wd.findElement(By.id("button-cancel-hidden")).click();
        wd.findElement(By.linkText("Реестр Э-ВПД")).click();
//        if (wd.findElement(By.xpath("//div[@id='ui-id-50']/p[9]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-50']/p[9]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-50']/p[10]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-50']/p[10]/input")).click();
//        }
        wd.findElement(By.linkText("Реестр заявок на бюджетные ассигнования ГЦСП")).click();
//        if (wd.findElement(By.xpath("//div[@id='ui-id-34']/p[8]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-34']/p[8]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-34']/p[9]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-34']/p[9]/input")).click();
//        }
        wd.findElement(By.linkText("Реестр транспортных организаций")).click();
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[2]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[2]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[5]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[5]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[7]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[7]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[8]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[8]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[9]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[9]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-37']/p[10]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-37']/p[10]/input")).click();
//        }
        wd.findElement(By.linkText("Реестр счетов, поступивших от транспортных организаций")).click();
//        if (wd.findElement(By.xpath("//div[@id='ui-id-27']/p[4]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-27']/p[4]/input")).click();
//        }
//        if (wd.findElement(By.xpath("//div[@id='ui-id-27']/p[12]/input")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='ui-id-27']/p[12]/input")).click();
//        }
//        wd.findElement(By.linkText("Лимиты")).click();
//        wd.findElement(By.linkText("Лимиты ГЦСП Цели")).click();
//        wd.findElement(By.linkText("Лимиты ГЦСП Спецкодировки")).click();
//        wd.findElement(By.linkText("Администрирование")).click();
//        wd.findElement(By.linkText("Список сотрудников")).click();
//        wd.findElement(By.linkText("Список подразделений и КБК")).click();
//        wd.findElement(By.linkText("Настройки системы")).click();
//        wd.findElement(By.linkText("Загрузка ключа ГРС «Сирена-Трэвел»")).click();
//        wd.findElement(By.linkText("Справочники")).click();
//        wd.findElement(By.linkText("Коды Бюджетной Классификации (КБК)")).click();
//        wd.findElement(By.linkText("Цели перевозки")).click();
//        wd.findElement(By.linkText("Категории проезда")).click();
//        wd.findElement(By.linkText("Степени родства")).click();
//        wd.findElement(By.linkText("Филиалы")).click();
////        wd.findElement(By.id("id75b")).click();
////        wd.findElement(By.xpath("//div[@id='id805']//span[normalize-space(.)='Подразделения']")).click();
//        wd.findElement(By.linkText("Подразделения")).click();
//        wd.findElement(By.linkText("Звания")).click();
//        wd.findElement(By.linkText("Аэропорты")).click();
////        wd.findElement(By.id("id927")).click();
//        wd.findElement(By.linkText("Аудит")).click();
//        wd.findElement(By.linkText("Отчеты")).click();
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
