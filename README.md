# Проект автоматизации тестирования (WEB) для сайта uptrade.ru 

<img src="images/company.png" width="900">

## Содержание
* <a href="#tools">Технологии и инструменты</a>
* <a href="#tests">Тест-кейсы</a>
* <a href="#autotest">Запуск автотестов</a>
* <a href="#jenkins">Сборка Jenkins</a>
* <a href="#joinjenkins">Интеграция с Allure report</a>
* <a href="#allure">Отчет в Allure</a>
* <a href="#testops">Интеграция с Allure TestOps</a>
* <a href="#telegramBot">Уведомления в Telegram bot</a>
* <a href="#video">Видео прохождения тестов</a>

---

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты**</a>

<p align="center">
<a href="https://www.java.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="45" height="45" alt="Java"/></a>
<a href="https://www.jetbrains.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="45" height="45" alt="Java"/></a>                                   
<a href="https://gradle.org/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="45" height="45" alt="Java"/></a>                                     
<a href="https://junit.org/junit5/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="45" height="45" alt="Java"/></a>    
<a href="https://github.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="45" height="45" alt="Java"/></a>   
<a href="https://www.jenkins.io/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="45" height="45" alt="Java"/></a>

- Используемый стек:
    - <code>Java</code> - автотесты написаны на Java
    - <code>Gradle</code> - инструмент автоматизации сборки
    - <code>JUnit 5</code> - фреймворк для выполнения автотестов
    - <code>Selenide</code> - фреймворк для тестирования WEB

- Используемая инфраструктура:
    - <code>Github</code> - хранение кода
    - <code>Jenkins</code> - CI/CD для запуска тестов удаленно
    - <code>Allure</code> - визуализация результатов тестирования
    - <code>Telegram Bot</code> - инструмент для отправки результатов тестирования
    - <code>Selenoid</code> - ферма для удаленного запуска браузера в Docker контейнерах

- Интеграции:
    - <code>Allure TestOps</code> - тест менеджмент система
 
---

<a id="tests"></a>
## <a name="Тест-кейсы">**Тест-кейсы**</a>

Web:

8 тестов проверяют функционал [сайта](https://uptrade.ru/)

 - кликабельность кнопок и соответствие названий основных кнопок требованиям
 - переключение пагинатора на сайте
 - переключение кнопок навигации
 - открытие модального окна с формой ввода
 - закрытие модального окна с формой ввода
 - отображение незаполненного поля, при отправке формы

---

<a id="autotest"></a>
## <a name="Запуск автотестов" style="color:black"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="20" height="20">**Запуск автотестов**</a>

### Запуск тестов из терминала

Для запуска тестов локально использовать команду ниже:
```
./gradlew clean test -Denv=local
```
Для запуска тестов удаленно использовать команду ниже:
```
./gradlew clean test -Denv=remote
```

---

<a id="jenkins"></a>
## <a name="Сборка Jenkins:" style="color:black"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="20" height="20">**Сборка Jenkins:**</a>

Тесты запускаются через [Jenkins](https://jenkins.autotests.cloud/job/Uptrade_UI_autotests/)  

<img src="images/allure_param.png" width="900">

Можно выбрать параметры 
- browser
- browser_size
- browser_version

Для запуска тестов необходимо нажать на кнопку "Build". Появится прогресс бар с номером сборки тестов. 

---

<a id="joinjenkins"></a>
## <a name="Интеграция с Allure report:">**Интеграция с Allure report:**</a>

После прохождения тестов, появляется диаграмма прохождения, по которой, в цветовом значении, наглядно видно количество успешных и неуспешных тестов

<img src="images/Allure_Int.png" width="900">

<a id="allure"></a>
## <a name="Отчет в Allure">**Отчет в Allure**</a>

 При нажатии на тестовый набор, раскрывается названия всех тестов. При нажатии на определенный тест, раскрываются шаги теста с приложенными вложениями
[Allure](https://jenkins.autotests.cloud/job/Uptrade_UI_autotests/38/allure/#suites/159fbffea37b83e5595c727b9006689c/4cbb7e3a792bad4c/)

<img src="images/Allure_1.png" width="900">

---

<a id="testops"></a>
## <a name="Интеграция с Allure TestOps">**Интеграция с Allure TestOps**</a>

В [TestOps](https://allure.autotests.cloud/launch/43853/tree?treeId=8884) можно посмотреть диаграмму прохождения тестов

<img src="images/TestOps_1.png" width="900">

Так же можно посмотреть более подробную информация по тестам

<img src="images/TestOps_2.png" width="900">

---

<a id="telegramBot"></a>
## <a name="Уведомления в Telegram bot">**Уведомления в Telegram bot**</a>

Для быстрой визуализации отчетности, после выполнения тестов, результат отчета дублируется в Telegram бот:
<p align="center">
    <img src="images/telegram.png">
</p>

---

<a id="video"></a>
## <a name="Видео прохождения тестов">**Видео прохождения тестов**</a>

<p align="center">
<img title="Selenoid Video" src="images/video/uptrade.gif" width="550" height="350"  alt="video">   
</p>
