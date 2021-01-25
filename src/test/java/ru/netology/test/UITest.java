package ru.netology.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.data.DataHelper.*;

public class UITest {

    @Test
    void shouldSuccessReplanDate(){
        open("http://localhost:9999/");
        $("[data-test-id=city] input").setValue(getCity());
        $("[data-test-id=date] input").setValue(getFirstDate());
        $("[data-test-id=name] input").setValue(getName());
        $("[data-test-id=phone] input").setValue(getPhone());
        $("[data-test-id=agreement] .checkbox__box").click();
        $(".button__text").click();
        //$("[data-test-id = success-notification]").shouldHave(Condition.cssClass("notification_visible"));

        $("[data-test-id=date] input").setValue(getSecondDate());
        $(".button__text").click();
        $("[data-test-id=replan-notification] button").click();
        $("[data-test-id=success-notification]").shouldHave(Condition.cssClass("notification_visible"));

    }
}
