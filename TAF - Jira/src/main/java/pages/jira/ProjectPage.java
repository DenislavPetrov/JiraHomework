package pages.jira;

import org.openqa.selenium.WebDriver;

public class ProjectPage extends BaseJiraPage {

    public ProjectPage(WebDriver driver) {
        super(driver, "jira.projectPage");
    }

    public void addCardToList(String cardName) {
    }

    public void moveCardToList(String cardName, String listName) {
    }

    public void assertStoryExists() {
        actions.waitForElementPresent("jira.storyName");
    }
    public void assertBugExists() {
        actions.waitForElementPresent("jira.bugName");
    }

    public void assertAddListExists() {
        actions.waitForElementPresent("trello.boardPage.listWrapper");
    }
}
