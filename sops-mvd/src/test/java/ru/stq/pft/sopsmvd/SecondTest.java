package ru.stq.pft.sopsmvd;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class SecondTest {
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
    public void SecondTest() {
        parametersForTheRequest("7", "Доставка", "Москва", "Сочи");
        wd.findElement(By.linkText("Добавить данные по Э-ВПД")).click();
        passenger(new passenger("3586", "678790", "Василенко", "Сергей", "Петрович", "94", "4", "17"));
        wd.findElement(By.linkText("Добавить данные по Э-ВПД")).click();
        familyMember("4586", "468967", "тест", "тест", "тест", "100", "8", "5");
        saveRequest();
        returnToTheForm();
    }

    private void familyMember(String docSeries, String docNum, String lastName, String firstName, String middleName, final String year, final String month, String day) {
        if (!wd.findElement(By.id("idd1")).isSelected()) {
            wd.findElement(By.id("idd1")).click();
        }
        wd.findElement(By.id("docSeries")).click();
        wd.findElement(By.id("docSeries")).clear();
        wd.findElement(By.id("docSeries")).sendKeys(docSeries);
        wd.findElement(By.id("docNum")).click();
        wd.findElement(By.id("docNum")).clear();
        wd.findElement(By.id("docNum")).sendKeys(docNum);
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).sendKeys(lastName);
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).sendKeys(firstName);
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).sendKeys(middleName);
        wd.findElement(By.id("input-birth-date")).click();
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[" + year + "]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[ " + year + "]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[" + month + "]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[" + month + "]")).click();
        }
        wd.findElement(By.linkText(day)).click();
        if (!wd.findElement(By.id("id581")).isSelected()) {
            wd.findElement(By.id("id581")).click();
        }
        wd.findElement(By.id("subdivCode")).click();
        wd.findElement(By.id("subdivCode")).clear();
        wd.findElement(By.id("subdivCode")).sendKeys("2000");
        if (!wd.findElement(By.xpath("//div[@id='evpdEdForm']/div[21]/select//option[5]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='evpdEdForm']/div[21]/select//option[5]")).click();
        }
        wd.findElement(By.id("button-edit-save")).click();
    }


    private void returnToTheForm() {
       // wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[4]/button[3]")).click();
     //  wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[4]/button[4]")).click();
        wd.findElement(By.linkText("Реестры")).click();
        wd.findElement(By.linkText("Реестр заявок на Э-ВПД")).click();
    }

    private void saveRequest() {
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[4]/button[1]")).click();
    }
    private void passenger(passenger passenger) {
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.isEmployee")).click();
        wd.findElement(By.xpath("//select[@id='dulType']//option[2]")).click();
        wd.findElement(By.id("docSeries")).click();
        wd.findElement(By.id("docSeries")).clear();
        wd.findElement(By.id("docSeries")).sendKeys(passenger.getDocSeries());
        wd.findElement(By.id("docNum")).click();
        wd.findElement(By.id("docNum")).clear();
        wd.findElement(By.id("docNum")).sendKeys(passenger.getDocNum());
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.lastName")).sendKeys(passenger.getLastName());
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.firstName")).sendKeys(passenger.getFirstName());
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).click();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).clear();
        wd.findElement(By.name("addEvpdPanel:content:evpdEditForm:passenger.middleName")).sendKeys(passenger.getMiddleName());
        wd.findElement(By.xpath("//div[@id='evpdEdForm']/div[9]/div")).click();
        wd.findElement(By.id("input-birth-date")).click();
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[" + passenger.getYear() + "]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[" + passenger.getYear() + "]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[" + passenger.getMonth() + "]")).isSelected()) {
            wd.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[" + passenger.getMonth() + "]")).click();
        }
        wd.findElement(By.linkText(passenger.getDay())).click();
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
    }

    private void parametersForTheRequest(String date, String mission, String begin, String end) {
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[4]/span/a/span[1]")).click();
        wd.findElement(By.id("ui-id-10")).click(); //основание поездки = рапорт
        wd.findElement(By.id("input-date")).click();
        wd.findElement(By.linkText(date)).click(); // выбор даты из календаря
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[5]/span/a/span[1]")).click();
        wd.findElement(By.linkText(mission)).click(); //цель перевозки
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/a/span[1]")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).clear();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[1]/input")).sendKeys(begin);
        wd.findElement(By.linkText(begin)).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).click();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).clear();
        wd.findElement(By.xpath("//div[1]/div[2]/div[4]/form/div[2]/div[7]/span[2]/input")).sendKeys(end);
        wd.findElement(By.linkText(end)).click();
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
