package ru.netology.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CallbackTest {
    @Test
        void shouldTest() {
            open("http://localhost:9999");
            SelenideElement form = $("[data-test-id=name]");
            form.$("[data-test-id=name] input").setValue("Василий");
        SelenideElement form2 = $("[data-test-id=phone]");
        form2.$("[data-test-id=phone] input").setValue("+79270000000");
        }
}
