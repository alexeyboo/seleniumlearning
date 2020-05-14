package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepsDefinition extends TestBaseCucumber {

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

	}

	@When("I select {string} task")
	public void iSelectTask(String arg0) {

	}

	@And("I login as {string} with password {string}")
	public void iLoginAsWithPassword(String arg0, String arg1) {

	}

	@Then("I should see the link to download file")
	public void iShouldSeeTheLinkToDownloadFile() {
	}
}
