package com.jannamartek.ui_page_object_tests;

import com.jannamarteck.ui_page_object.TodoistHelpCenterPage;
import com.jannamarteck.ui_page_object.TodoistHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TodoistHelpCenterPageTest extends BaseTest {

    @BeforeClass
    public void HelpCenter() {
        new TodoistHomePage().navigateToHelpCenter();
    }

    @Test(groups = {"Regression: HelpCenterPage"})
    public void testCatalogLinksIsDisplayed() {
        new TodoistHelpCenterPage()
                .categoriesSectionsContainGettingStartedButton();
    }

    @Test(groups = {"Regression: HelpCenterPage"})
    public void testCheckMainTitleHelpCenter() {
        new TodoistHelpCenterPage()
                .checkMainTitle();
    }
}