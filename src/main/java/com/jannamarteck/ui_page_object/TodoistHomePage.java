package com.jannamarteck.ui_page_object;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class TodoistHomePage {
    private final static String TODOIST_LINK = "https://todoist.com/";
    private static final String TODOIST_LOGIN_BUTTON_XPATH = "//li//a[contains(@href,'/auth/login') and contains(text(),'Войти')]";

    public static TodoistHomePage navigateToTodoistHomePage() {
        try {
            open(TODOIST_LINK);
        } catch (NullPointerException e) {
            throw new RuntimeException("No URL found in properties file");
        }
        return new TodoistHomePage();
    }

    public static TodoistHomePage navigateToHelpCenter() {
        try {
            open(TODOIST_LINK);
        } catch (NullPointerException e) {
            throw new RuntimeException("No URL found in properties file");
        }
        $(byText("Ресурсы")).click();
        $(byText("Справочный центр")).click();
        return new TodoistHomePage();
    }

    public TodoistHomePage clickOnLoginButton() {
        $x(format(TODOIST_LOGIN_BUTTON_XPATH)).shouldBe(Condition.visible, ofSeconds(20)).click();
        return new TodoistHomePage();
    }
}
