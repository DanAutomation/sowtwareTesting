package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BookBase {

    protected final ApplicationMnager app = new ApplicationMnager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


    public ApplicationMnager getApp() {
        return app;
    }
}
