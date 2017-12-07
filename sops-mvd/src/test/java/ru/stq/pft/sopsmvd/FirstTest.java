package ru.stq.pft.sopsmvd;

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

public class FirstTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        wd.get("http://sops.phoenixit.ru:8080/mia-rst-web/?0&login=dkovalenko4");
        wd.findElement(By.linkText("Реестры")).click();
        wd.findElement(By.linkText("Реестр заявок на Э-ВПД")).click();
        wd.findElement(By.linkText("Добавить заявку")).click();
    }
    
    @Test
    public void FirstTest() {
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[4]/span/a/span[1]")).click();
        wd.findElement(By.id("ui-id-10")).click();
        wd.findElement(By.id("input-date")).click();
        wd.findElement(By.linkText("7")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[5]/span/a/span[1]")).click();
        wd.findElement(By.id("ui-id-15")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/a/span[1]")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).clear();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).sendKeys("Москва");
        wd.findElement(By.linkText("Москва")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).clear();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).sendKeys("Санкт-Петербург");
        wd.findElement(By.linkText("Санкт-Петербург")).click();
        wd.findElement(By.linkText("Добавить данные по Э-ВПД")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.isEmployee")).click();
        wd.findElement(By.xpath("//select[@id='dulType']//option[2]")).click();
        wd.findElement(By.id("docSeries")).click();
        wd.findElement(By.id("docSeries")).clear();
        wd.findElement(By.id("docSeries")).sendKeys("1234");
        wd.findElement(By.id("docNum")).click();
        wd.findElement(By.id("docNum")).clear();
        wd.findElement(By.id("docNum")).sendKeys("567890");
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).sendKeys("Тестов");
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).sendKeys("Тест");
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).sendKeys("Тестович");
        wd.findElement(By.xpath("//div[@id='evpdEdForm']/div[9]/div")).click();
        wd.findElement(By.id("input-birth-date")).click();
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[97]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[97]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[4]")).click();
        }
        wd.findElement(By.linkText("14")).click();
       if (!wd.findElement(By.xpath("//select[@class='longField category']//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='longField category']//option[10]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='overCategory']//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='overCategory']//option[4]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='rank']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='rank']//option[3]")).click();
        }
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
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:save")).click();
        wd.findElement(By.xpath("//button[@id='button-save-request']")).click();
        wd.findElement(By.name("cancelButton")).click();
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
