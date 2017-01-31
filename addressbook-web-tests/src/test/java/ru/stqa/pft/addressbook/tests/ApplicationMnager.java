package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

/**
 * Created by User on 18.01.2017.
 */
public class ApplicationMnager {
    ChromeDriver wd;

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected void init() {
        System.setProperty("webdriver.gecko.driver", "D://softwareTesting//sowtwareTesting//addressbook-web-tests//src//browsers//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D://softwareTesting//sowtwareTesting//addressbook-web-tests//src//browsers//chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    protected void clickButton() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    protected void enterData(FillingData fillingData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(fillingData.getName());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).sendKeys("\\9");
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(fillingData.getLastName());
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(fillingData.getMail());
    }

    private void login(String username, String password) {
        wd.get("http://localhost/addressbook");
        wd.findElement(By.id("content")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    protected void stop() {
        wd.quit();
    }

    protected void selectDelete() {
        // http://localhost/addressbook/
        wd.findElement(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[4]/td[1]")).submit();

//        if (!wd.findElement(By.id("2")).isSelected()) {
//            wd.findElement(By.id("2")).click();
//        }
     //   wd.findElement(By.linkText("/html/body/div/div[4]/form[2]/div[2]/input")).click();
    }
}
