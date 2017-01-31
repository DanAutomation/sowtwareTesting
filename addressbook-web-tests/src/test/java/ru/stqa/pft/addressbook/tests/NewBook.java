package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class NewBook extends BookBase{

    @Test
    public void NewBook() {
        app.enterData(new FillingData("Name", "Last Name", "example@test.com"));
        app.clickButton();
    }


}
