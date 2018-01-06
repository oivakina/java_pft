package ru.stq.pft.addressbook.appmanager;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import sun.plugin2.util.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private java.lang.String browser;

    public ApplicationManager(java.lang.String browser) {
        this.browser = browser;
    }

    public void stop() {
        wd.quit();
    }

    public void init() {
        if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.CHROME)){
            wd = new ChromeDriver();
    }else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }

       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       wd.get("http://localhost/addressbook/");
       groupHelper = new GroupHelper(wd);
       navigationHelper = new NavigationHelper(wd);
       sessionHelper = new SessionHelper(wd);
       sessionHelper.login("admin", "secret");
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
