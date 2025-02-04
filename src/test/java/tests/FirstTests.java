package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.FirstPage;

@Owner("Ekaterina")
@Feature("Тестирование содержимого главной страницы сайта")
@Tags({@Tag("ui"), @Tag("watchTest")})
public class FirstTests extends TestBase {

    FirstPage firstPage = new FirstPage();

    @Test
    @DisplayName("Проверка текста раздела, при переключении кнопок навигации (стрелка вправо)")
    @Story("Тестирование переключения кнопок навигации")
    public void switchingButtonArrowsTest() {
        firstPage.openPage();
        firstPage.pressRightButtonArrows();
        firstPage.checkTextAfterSwitchingRightArrows();
    }

    @Test
    @DisplayName("Проверка написанного метода")
    @Story("Тестирование переключения кнопок индикатора прогресса")
    public void switchingButtonPaginationDemo() {
        firstPage.openPage();
        firstPage.clickSliderButton(2);
        firstPage.checkTextAfterSwitchingTwoNumber();
        firstPage.clickSliderButton(3);
        firstPage.checkTextAfterSwitchingThreeNumber();
        firstPage.clickSliderButton(2);
        firstPage.clickSliderButton(1);
        firstPage.checkTextAfterSwitchingOneNumber();

    }

}
