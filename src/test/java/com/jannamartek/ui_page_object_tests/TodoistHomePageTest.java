package com.jannamartek.ui_page_object_tests;

import com.jannamarteck.ui_page_object.TodoistHomePage;
import org.testng.annotations.Test;

public class TodoistHomePageTest extends BaseTest {
    @Test(groups = {"Regression: HomePage"})
    public void testNavigateToHelpCenter() {
        new TodoistHomePage()
                .navigateToHelpCenter();
    }
}