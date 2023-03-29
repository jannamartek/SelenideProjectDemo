package com.jannamartek.ui_page_object_tests;

import com.jannamarteck.ui_page_object.TodoistHomePage;
import com.jannamarteck.ui_page_object.TodoistLoginPage;
import com.jannamarteck.ui_page_object.TodolistPersonalAccountMainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TodolistPersonalAccountMainPageTest extends BaseTest {
    @BeforeClass
    public void Login() {
        new TodoistHomePage()
                .clickOnLoginButton();
        new TodoistLoginPage()
                .login();
    }

    @Test(groups = {"Regression: PersonalAccountMainPage"})
    public void testLeftTopBarContainAllElements() {
        new TodolistPersonalAccountMainPage()
                .stateTopBarLeftElements();
    }

    @Test(groups = {"Regression: PersonalAccountMainPage"})
    public void testRightTopBarContainAllElements() {
        new TodolistPersonalAccountMainPage()
                .stateTopBarRightElements();
    }

    @Test(groups = {"Regression: PersonalAccountMainPage"})
    public void testAddQuickTask() {
        new TodolistPersonalAccountMainPage()
                .createTask();
    }
}
