package com.jannamarteck.ui_page_object;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class TodoistLoginPage {
    private static final String EMAIL_INPUT_FIELD_XPATH = "//*[@id=\"element-0\"]";
    private static final String PASSWORD_INPUT_FIELD_XPATH = "//*[@id=\"element-3\"]";
    private static final String LOGIN_BUTTON_XPATH = "//button[@type='submit']";

    public static TodoistLoginPage login() {
        $x(format(EMAIL_INPUT_FIELD_XPATH)).shouldBe(Condition.visible, ofSeconds(20))
                .sendKeys("auto_test@bk.ru");
        $x(format(PASSWORD_INPUT_FIELD_XPATH)).shouldBe(Condition.visible, ofSeconds(20))
                .sendKeys("AQ&AQA89");
        $x(format(LOGIN_BUTTON_XPATH)).shouldBe(Condition.visible, ofSeconds(20))
                .pressEnter();
        return new TodoistLoginPage();
    }
}