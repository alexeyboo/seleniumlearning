package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class StepDefinitions extends TestBaseCucumber {

	@Before
	public void initialization() {
		start();
	}

	@After
	public void teardown() {
		finish();
	}

	@Given("I go to main page")
	public void iGoToMainPage() {
		main.goTo();
	}

	@When("I select {string} task")
	public void iSelectTask(String taskNumber) {
		main.chooseTask(taskNumber);
	}

	@And("I login as {string} with password {string}")
	public void iLoginAsWithPassword(String login, String password) {
		taskSix.checkElementsOnPagePresent()
			.fillInLogin(login)
			.fillInPassword(password)
			.clickLoginButton();
	}

	@Then("I should (see|not see) the link to download file$")
	public void iShouldSeeTheLinkToDownloadFile(String visibility) {
		if (visibility.equals("see")) {
			taskSix.isLoginCorrect();
		} else {
			taskSix.isLoginWrong();
		}
	}
}