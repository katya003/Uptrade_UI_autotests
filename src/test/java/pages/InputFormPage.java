package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InputFormPage {

    private final SelenideElement modalClients = $(".contact-us__form");
    private final SelenideElement elementClose = $(".contact-us__close");
    private final SelenideElement modalJoinTeam = $("form.contact-us__form");
    private final SelenideElement fieldEmail = $(".contact-us__input.invalid#email");
    private final SelenideElement fieldFormEmail = $(".contact-us__input[name='email']");
    private final SelenideElement fieldFormTel = $(".contact-us__input[placeholder='Телефон']");
    private final SelenideElement fieldFormCompany = $(".contact-us__input#company[name='company']");
    private final SelenideElement fieldFormName = $(".contact-us__label.contact-us__label-name");
    private final SelenideElement modalProvider = $(".contact-us__radio-label[for='provider']");
    private final SelenideElement fieldGoods = $(".contact-us__input[name='provider-goods']");
    private final SelenideElement fieldMessage = $(".contact-us__input.contact-us__textarea[name='message']");
    private final SelenideElement fieldName = $(".contact-us__input[name='name']");
    private final SelenideElement fieldTel = $(".contact-us__input[type='tel']");


    @Step("Отображение окна и полей на контакт форме 'Стать клиентом' ")
    public InputFormPage checkWindowClient() {
        modalClients.shouldBe(visible);
        fieldFormEmail.shouldBe(Condition.visible);
        fieldFormTel.shouldBe(Condition.visible);
        fieldFormCompany.shouldBe(Condition.visible);
        fieldFormName.shouldBe(Condition.visible);
        return this;
    }

    @Step("Переключение на кнопку 'Я поставщик'")
    public InputFormPage switchWindowProducer() {
        modalProvider.click();
        return this;
    }

    @Step("Проверка отображения полей на контакт форме 'Стать поставщиком'")
    public InputFormPage checkWindowProducer() {
        modalProvider.shouldBe(visible);
        fieldGoods.shouldBe(Condition.visible);
        fieldMessage.shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажать на элемент 'Крестик'")
    public InputFormPage closeWindowClient() {
        elementClose.click();
        return this;
    }

    @Step("проверить невидимость окна 'Стать клиентом'")
    public InputFormPage checkAbsenceWindowClient() {
        modalClients.shouldNot(Condition.visible);
        return this;
    }

    @Step("Отправить форму 'Стать частью команды'")
    public InputFormPage sendFormJoinTeam() {
        modalJoinTeam.submit();
        return this;
    }

    @Step("Проверить невалидное (пустое) заполнение поля Email в форме 'Стать частью команды'")
    public InputFormPage checkEmailFieldInvalidInput() {
        fieldEmail.shouldBe(visible).shouldHave(Condition.cssClass("invalid"));
        return this;
    }

    @Step("Проверить невалидное (пустое) заполнение поля 'Имя и фамилия' в форме 'Стать частью команды'")
    public InputFormPage checkNameFieldInvalidInput() {
        fieldName.shouldBe(Condition.visible).shouldHave(Condition.cssClass("invalid"));
        return this;
    }

    @Step("Проверить невалидное (пустое) заполнение поля 'Имя и фамилия' в форме 'Стать частью команды'")
    public InputFormPage checkTelFieldInvalidInput() {
        fieldTel.shouldBe(Condition.visible).shouldHave(Condition.cssClass("invalid"));
        return this;
    }
}
