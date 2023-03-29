package com.jannamartek.ui_page_object_tests;

import com.jannamarteck.ui_page_object.TodoistAccountSettingsPage;
import com.jannamarteck.ui_page_object.TodoistHomePage;
import com.jannamarteck.ui_page_object.TodoistLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TodoistAccountSettingsPageTest extends BaseTest {
    private final static String EXPECTED_TITLE = "Аккаунт - Настройки - Todoist";
    private final static String EXPECTED_URL = "https://todoist.com/app/settings/account";

    @BeforeClass
    public void Login() {
        new TodoistHomePage()
                .clickOnLoginButton();
        new TodoistLoginPage()
                .login();
        TodoistAccountSettingsPage
                .navigateToAccountSettingsPage();
    }

    @Test(groups = {"Regression: AccountSettingsPage"})
    public void testNavigateToAccountSettingsPageTest() {
        String actualUrl = getWebDriver().getCurrentUrl();
        String expectedUrl = EXPECTED_URL;
        Assert.assertEquals(actualUrl, expectedUrl, "URL не совпадает с ожидаемым значением. " +
                "Ожидаемый результат: %s, текущий результат: %s\", expectedUrl, actualUrl");
    }

    @Test(groups = {"Regression: AccountSettingsPage"})
    public void testPageTitle() {
        String actualTitle = getWebDriver().getTitle().trim();
        String expectedTitle = EXPECTED_TITLE;
        Assert.assertEquals(actualTitle, expectedTitle, "Заголовок страницы не совпадает с ожидаемым значением. " +
                "Ожидаемый результат: %s, текущий результат: %s\", expectedTitle, actualTitle");
    }
}


