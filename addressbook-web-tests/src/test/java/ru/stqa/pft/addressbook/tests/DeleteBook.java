package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteBook extends BookBase{
    
    @Test
    public void setDeleteBook() {
        app.selectDelete();
//        backHome();
    }

}
