package com.jannamarteck.ui_page_object;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;


public class TodoistAccountSettingsPage {
    private static final String TOP_BAR_MENU_BUTTON_XPATH = "//button[@aria-label='Настройки']";
    private static final String USER_MENU_LABEL_XPATH = "//span[contains(@class,'user_menu_label') and contains(text(),'Настройки')]";

    public static TodoistAccountSettingsPage navigateToAccountSettingsPage() {
        $x(format(TOP_BAR_MENU_BUTTON_XPATH))
                .shouldBe(visible, Duration.ofSeconds(30)).click();
        $x(format(USER_MENU_LABEL_XPATH))
                .shouldBe(visible, Duration.ofSeconds(30)).click();
        return new TodoistAccountSettingsPage();
    }
}