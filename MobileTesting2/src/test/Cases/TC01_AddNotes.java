package Cases;

import Pages.HomePage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.BasicTest;


@Epic("Note app")
@Feature("add notes")
public class TC01_AddNotes extends BasicTest {

   HomePage homePage;


    @Step("to add a note Step")
    @DisplayName("this is a displayName")
    @Story("Add a new notes")
    @Description("Open the note app, to add a note")
    @Link("http://www.baidu.com")
    @Issue("23211134")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void AddNotes(){

        homePage = new HomePage();
        homePage.btnOfAdd.click();
        Assert.assertTrue(true);

    }
}
