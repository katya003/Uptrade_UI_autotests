package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class FirstPage {
    private final SelenideElement buttonTeam = $(".nav-section__link");
    private final SelenideElement buttonJoin = $("[data-role ='buyer']");
    private final SelenideElement rightArrow = $(".hero__swiper-button--next");
    private final SelenideElement textSectionTwo = $x("//h2[text()='Гарантируем лучшие цены']");
    private final SelenideElement textSectionThree = $x("//h2[text()='Закупать просто, как на маркетплейсе']");
    private final SelenideElement textSectionOne = $x("//h2[text()='Оптимизируем процессы']");


    @Step("Открыть страницу")
    public FirstPage openPage() {
        open("/");
        return this;
    }

    @Step("Нажать на кнопку 'Стать клиентом'")
    public FirstPage clickButtonJoin() {
        buttonJoin.click();
        return this;
    }

    @Step("Нажать на кнопку 'Команда'")
    public FirstPage clickButtonTeam() {
        buttonTeam.click();
        return this;
    }

    @Step("Нажать на стрелку 'Вправо'")
    public FirstPage pressRightButtonArrows() {
        rightArrow.click();
        return this;
    }

    @Step("Проверка текста раздела, после переключения стрелки 'Вправо'")
    public FirstPage checkTextAfterSwitchingRightArrows() {
        textSectionTwo.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }

    @Step("Переключение на раздел слайдера {0}")
    public FirstPage clickSliderButton(int buttonNumber) {
        String locator = "[data-swiper-pagination='%d']".formatted(buttonNumber);
        $$(locator).filter(Condition.interactable).first().click();
        return this;
    }


    @Step("Проверка текста раздела, после переключения цифры '2'")
    public FirstPage checkTextAfterSwitchingTwoNumber() {
        textSectionTwo.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }

    @Step("Проверка текста раздела, после переключения цифры '3'")
    public FirstPage checkTextAfterSwitchingThreeNumber() {
        textSectionThree.shouldHave(Condition.text("Закупать просто, как на маркетплейсе"));
        return this;
    }

    @Step("Проверка текста раздела, после переключения цифры '1'")
    public FirstPage checkTextAfterSwitchingOneNumber() {
        textSectionOne.shouldHave(Condition.text("Оптимизируем процессы"));
        return this;
    }
}



