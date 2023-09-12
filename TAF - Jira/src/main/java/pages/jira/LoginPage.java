package pages.jira;

import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.getConfigPropertyByKey;

public class LoginPage extends BaseJiraPage {

    public LoginPage(WebDriver driver) {
        super(driver, "jira.loginPage");
    }

    public void loginUser(String userKey) {
        String username = getConfigPropertyByKey("jira.users." + userKey + ".username");
        String password = getConfigPropertyByKey("jira.users." + userKey + ".password");

        navigateToPage();
        assertPageNavigated();

        actions.waitForElementVisible("jira.loginPage.username");
        actions.typeValueInField(username, "jira.loginPage.username");

        actions.waitForElementVisible("jira.loginPage.loginContinueButton");
        actions.clickElement("jira.loginPage.loginContinueButton");

        actions.waitForElementClickable("jira.loginPage.password");
        actions.typeValueInField(password, "jira.loginPage.password");

        actions.waitForElementClickable("jira.loginPage.loginSubmitButton");
        actions.clickElement("jira.loginPage.loginSubmitButton");

    }
}
