package com.jannamarteck.ui_page_object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class TodoistHelpCenterPage {
    private static final String GETTING_STARTED_BUTTON_XPATH = "//a[@href='/help/categories/getting-started']";
    private static final SelenideElement mailLabel = $(byCssSelector("head > title"));

    public static TodoistHelpCenterPage categoriesSectionsContainGettingStartedButton() {
        $x(format(GETTING_STARTED_BUTTON_XPATH))
                .shouldBe(visible, ofSeconds(20))
                .click();
        return new TodoistHelpCenterPage();
    }

    public static TodoistHelpCenterPage checkMainTitle() {
        mailLabel
                .getText()
                .contains("Помощь | Todoist");
        return new TodoistHelpCenterPage();
    }
}
