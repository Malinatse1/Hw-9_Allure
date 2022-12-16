package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepsPage  {
    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий Malinatse1/Hw-9_Allure")
    public void searchForRepository() {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Malinatse1/Hw-9_Allure");
        $(".header-search-input").submit();
    }

    @Step("Кликаем по ссылке репозитория Malinatse1/Hw-9_Allure")
    public void clickOnRepositoryLink() {
        $(linkText("Malinatse1/Hw-9_Allure")).click();
    }

    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие элемента с текстом Issue")
    public void checkExisting(){
        $(withText("Issue")).should(Condition.exist);
    }

}

