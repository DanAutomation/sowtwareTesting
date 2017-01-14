package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() {
//        wd.findElement(By.id("content")).click();
        gotoGroupPage();
//        wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).click();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
