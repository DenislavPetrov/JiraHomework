package pages.jira;

import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.getUIMappingByKey;

public class JiraPage extends BaseJiraPage {

    public JiraPage(WebDriver driver) {
        super(driver, "jira.projectPage");
    }

    public void createStory() {
        String storySummary = getUIMappingByKey("jira.storySummary");
        String storyDescription = getUIMappingByKey("jira.storyDescription");

        actions.waitForElementClickable("jira.loginPage.jiraManagement");
        actions.clickElement("jira.loginPage.jiraManagement");

        actions.waitForElementClickable("jira.header.create.menuButton");
        actions.clickElement("jira.header.create.menuButton");

        actions.waitForElementClickable("jira.issueType.dropDownButton");
        actions.clickElement("jira.issueType.dropDownButton");

        actions.waitForElementClickable("jira.issueType.story");
        actions.clickElement("jira.issueType.story");

        actions.waitForElementClickable("jira.createIssue.summaryInput");
        actions.typeValueInField(storySummary, "jira.createIssue.summaryInput");

        actions.waitForElementClickable("jira.createIssue.descriptionInput");
        actions.typeValueInField(storyDescription, "jira.createIssue.descriptionInput");

        actions.waitForElementClickable("jira.create.issue.submitButton");
        actions.clickElement("jira.create.issue.submitButton");
    }
    public void createBug() {
        String bugSummary = getUIMappingByKey("jira.bugSummary");
        String bugDescription = getUIMappingByKey("jira.bugDescription");

        actions.waitForElementClickable("jira.loginPage.jiraManagement");
        actions.clickElement("jira.loginPage.jiraManagement");

        actions.waitForElementClickable("jira.header.create.menuButton");
        actions.clickElement("jira.header.create.menuButton");

        actions.waitForElementClickable("jira.issueType.dropDownButton");
        actions.clickElement("jira.issueType.dropDownButton");

        actions.waitForElementClickable("jira.issueType.bug");
        actions.clickElement("jira.issueType.bug");

        actions.waitForElementClickable("jira.createIssue.summaryInput");
        actions.typeValueInField(bugSummary, "jira.createIssue.summaryInput");

        actions.waitForElementClickable("jira.createIssue.descriptionInput");
        actions.typeValueInField(bugDescription, "jira.createIssue.descriptionInput");

        actions.waitForElementClickable("jira.create.issue.submitButton");
        actions.clickElement("jira.create.issue.submitButton");
    }

    public void clickOnBoard(String boardName) {
        actions.waitForElementVisible("trello.boardsPage.boardByTeamAndName");
        actions.clickElement("trello.boardsPage.boardByTeamAndName", boardName);
    }
}
