package tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import pages.PageGithub;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;





public class StepsTestLambda extends PageGithub {
    public static final String REPOSITORY = "Malinatse1/Hw-9_Allure";
    public static final int ISSUE = 1;
    @Test
    public void testIssueSearch(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу",() -> {
                    open("https://github.com/");
                });
        step("Ищем репозиторий " + REPOSITORY, () ->{

        searchInput.click();
        searchInput.sendKeys("Malinatse1/Hw-9_Allure");
        searchInput.submit();
    } );
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем таб Issue " + REPOSITORY, () -> {
            $("#issues-tab").click();
        });

        step("Проверяем наличие Issue с номером  " + ISSUE, () -> {
        $(withText("#" + ISSUE)).should(Condition.exist);
        });
    }
}