package test.cases.jira;

import org.junit.*;
import pages.jira.JiraPage;
import pages.jira.ProjectPage;


public class JiraTest extends BaseTest {
    @Before
    public void beforeTest() {
        login();
    }


    @Test
    public void createStoryJira() {
        JiraPage jiraPage = new JiraPage(actions.getDriver());
        jiraPage.createStory();
    }
    @Test
    public void createBugJira() {
        JiraPage jiraPage = new JiraPage(actions.getDriver());
        jiraPage.createBug();
    }
}
