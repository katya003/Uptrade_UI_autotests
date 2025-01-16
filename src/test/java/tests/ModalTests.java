package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.FirstPage;
import pages.InputFormPage;
import pages.TeamPage;

@Owner("Ekaterina")
@Feature("Тестирование модальных окон сайта")
@Tags({@Tag("ui"), @Tag("watchTest")})

public class ModalTests extends TestBase {
    FirstPage firstPage = new FirstPage();
    InputFormPage inputFormPage = new InputFormPage();
    TeamPage teamPage = new TeamPage();

    @Test
    @DisplayName("Отображение окна и полей с формой ввода, при нажатии на кнопку 'Стать клиентом' ")
    @Story("Тестирование открытия модального окна 'Стать клиентом'")
    public void buttonJoinClickTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.checkWindowClient();
    }

    @Test
    @DisplayName("Отображение окна и полей с формой ввода, при нажатии на кнопку 'Стать поставщиком' ")
    @Story("Тестирование переключения с модального окна 'Стать клиентом' на модальное окно 'Стать поставщиком' ")
    public void buttonJoinClickProducerTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.switchWindowProducer();
        inputFormPage.checkWindowProducer();
    }

    @Test
    @DisplayName("Закрытие окна с формой ввода, при нажатии на элемент 'Крестик' ")
    @Story("Тестирование закрытия модального окна 'Стать клиентом' ")
    public void closeWindowTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.closeWindowClient();
        inputFormPage.checkAbsenceWindowClient();
    }

    @Test
    @DisplayName("Отображение невалидного поля 'Email', при незаполненной форме 'Стать частью команды' ")
    @Story("Тестирование валидации, при негативной проверке поля 'Email' в модальном окне 'Стать частью команды' ")
    public void watchWindowJoinTeamEmailTest() {
        firstPage.openPage();
        firstPage.clickButtonTeam();
        teamPage.clickButtonJoinTheTeam();
        inputFormPage.sendFormJoinTeam();
        inputFormPage.checkEmailFieldInvalidInput();
    }

    @Test
    @DisplayName("Отображение невалидного поля 'Имя и фамилия', при незаполненной форме 'Стать частью команды' ")
    @Story("Тестирование валидации, при негативной проверке поля 'Имя и фамилия' в модальном окне 'Стать частью команды' ")
    public void watchWindowJoinTeamNameTest() {
        firstPage.openPage();
        firstPage.clickButtonTeam();
        teamPage.clickButtonJoinTheTeam();
        inputFormPage.sendFormJoinTeam();
        inputFormPage.checkNameFieldInvalidInput();
    }

    @Test
    @DisplayName("Отображение невалидного поля 'Телефон', при незаполненной форме 'Стать частью команды' ")
    @Story("Тестирование валидации, при негативной проверке поля 'Телефон' в модальном окне 'Стать частью команды' ")
    public void watchWindowJoinTeamTelTest() {
        firstPage.openPage();
        firstPage.clickButtonTeam();
        teamPage.clickButtonJoinTheTeam();
        inputFormPage.sendFormJoinTeam();
        inputFormPage.checkTelFieldInvalidInput();
    }
}
