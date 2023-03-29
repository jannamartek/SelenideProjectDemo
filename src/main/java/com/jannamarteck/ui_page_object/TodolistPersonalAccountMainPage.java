package com.jannamarteck.ui_page_object;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class TodolistPersonalAccountMainPage {
    private static final String MAIN_MENU_BUTTON_XPATH = "//button[@aria-label='Главное меню']";
    private static final String MAIN_PAGE_BUTTON_XPATH = "//button[@aria-label='На главный экран']";
    private static final String FAST_SEARCH_INPUT_FIELD_XPATH = "//input[@aria-label='Быстрый поиск']";
    private static final String QUICK_ADD_TASK_BUTTON_XPATH = "//button[@aria-label='Быстрое добавление']";
    private static final String YOUR_PRODUCTIVITY_BUTTON_XPATH = "//button[@aria-label='Продуктивность']";
    private static final String HELP_BUTTON_XPATH = "//button[@aria-label='Поддержка и обратная связь']";
    private static final String NOTIFICATIONS_BUTTON_XPATH = "//button[@aria-label='Уведомления']";
    private static final String SETTINGS_BUTTON_XPATH = "//button[@aria-label='Настройки']";
    private static final String NAME_TASK_INPUT_FIELD_XPATH = "//div[@aria-label='Название задачи']";
    private static final String DESCRIPTION_TASK_INPUT_FIELD_XPATH = "//div[@aria-label='Описание']";
    private static final String DEAD_LINE_BUTTON_XPATH = "//div[@aria-label='Установка срока выполнения']";
    private static final String DATE_BUTTON_XPATH = "//button[@data-action-hint='scheduler-suggestion-tomorrow']";
    private static final String PRIORITY_BUTTON_XPATH = "//div[@aria-label='Установить приоритет']";
    private static final String CHOOSE_PRIORITY_1_BUTTON_XPATH = "//li[@aria-label='Приоритет 1']";
    private static final String CHOOSE_PROJECT_BUTTON_XPATH = "//button[@aria-label='Выбрать проект']";
    private static final String INBOX_PROJECT_CHOOSE_XPATH = "//li[@aria-label='Работа \uD83C\uDFAF']";
    private static final String ADD_TASK_BUTTON_XPATH = "//button[@aria-label='Добавить задачу']";

    public TodolistPersonalAccountMainPage stateTopBarLeftElements() {

        $x(format(MAIN_MENU_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(MAIN_PAGE_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(FAST_SEARCH_INPUT_FIELD_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        return new TodolistPersonalAccountMainPage();
    }

    public TodolistPersonalAccountMainPage stateTopBarRightElements() {

        $x(format(QUICK_ADD_TASK_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(YOUR_PRODUCTIVITY_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(HELP_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(NOTIFICATIONS_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        $x(format(SETTINGS_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20));
        return new TodolistPersonalAccountMainPage();
    }

    public TodolistPersonalAccountMainPage createTask() {
        $x(format(QUICK_ADD_TASK_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .click();
        $x(format(NAME_TASK_INPUT_FIELD_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .sendKeys("Позвонить Петрову");
        $x(format(DESCRIPTION_TASK_INPUT_FIELD_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .sendKeys("Уточнить дату встречи");
        $x(format(DEAD_LINE_BUTTON_XPATH))
                .click();
        $x(format(DATE_BUTTON_XPATH))
                .click();
        $x(format(PRIORITY_BUTTON_XPATH))
                .click();
        $x(format(CHOOSE_PRIORITY_1_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .click();
        $x(format(CHOOSE_PROJECT_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .click();
        $x(format(INBOX_PROJECT_CHOOSE_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .click();
        $x(format(ADD_TASK_BUTTON_XPATH))
                .shouldBe(Condition.visible, ofSeconds(20))
                .click();
        return new TodolistPersonalAccountMainPage();
    }
}