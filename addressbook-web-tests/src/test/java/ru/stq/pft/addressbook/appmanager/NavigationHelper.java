package ru.stq.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void gotoGroupPage() {
        click(By.cssSelector("body"));
        click(By.linkText("add new"));
        click(By.linkText("groups"));
    }
}