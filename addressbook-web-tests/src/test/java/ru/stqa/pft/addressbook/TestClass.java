package ru.stqa.pft.addressbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Work on 11.01.2017.
 */
public class TestClass {
    public static void main(String[] args){
    WebDriver fx = new FirefoxDriver();
    fx.get("http://www.google.com");
}
}
