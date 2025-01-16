package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class FirstPage {
    private final SelenideElement buttonTeam = $(".nav-section__link");
    private final SelenideElement buttonJoin = $("[data-role ='buyer']");
    private final SelenideElement rightArrow = $(".hero__swiper-button--next");
    private final SelenideElement textSection = $x("//h2[text()='Гарантируем лучшие цены']");
    private final SelenideElement paginationTwo = $(".hero__swiper-pagination-item[data-swiper-pagination='2']");


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
        textSection.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }

    @Step("Нажать на кнопку индикатора прогресса '2'")
    public FirstPage pressPaginationTwo() {
        paginationTwo.click();
        return this;
    }

    @Step("Проверка текста раздела, после переключения цифры '2'")
    public FirstPage checkTextAfterSwitchingTwoNumber() {
        textSection.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }
}



