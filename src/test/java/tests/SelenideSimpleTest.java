        package tests;


        import com.codeborne.selenide.Condition;
        import com.codeborne.selenide.logevents.SelenideLogger;
        import io.qameta.allure.selenide.AllureSelenide;
        import org.junit.jupiter.api.Test;
        import pages.PageGithub;


        import static com.codeborne.selenide.Selectors.withText;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;
        import static org.openqa.selenium.By.linkText;



        public class SelenideSimpleTest extends PageGithub {
        @Test
        public void testIssueSearch(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/");

        searchInput.click();
        searchInput.sendKeys("Malinatse1/Hw-9_Allure");
        searchInput.submit();

        $(linkText("Malinatse1/Hw-9_Allure")).click();
        $("#issues-tab").click();
        $(withText("#1")).should(Condition.exist);



        }
        }