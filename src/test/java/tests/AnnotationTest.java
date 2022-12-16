package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import pages.StepsPage;


public class AnnotationTest {
    @Test
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsPage steps = new StepsPage();

        steps.openMainPage();
        steps.searchForRepository();
        steps.clickOnRepositoryLink();
        steps.openIssuesTab();
        steps.checkExisting();

    }
}
