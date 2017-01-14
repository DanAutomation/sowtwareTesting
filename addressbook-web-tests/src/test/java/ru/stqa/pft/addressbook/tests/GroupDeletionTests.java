package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() {
//        wd.findElement(By.id("content")).click();
        app.gotoGroupPage();
//        wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).click();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}
