package test;

import org.junit.Test;

public class TestSix extends TestBase {
	@Test
	public void firstTest() throws InterruptedException {
		main.goTo().chooseTask("6");
		taskSix.checkElementsOnPagePresent()
			.fillInLogin("tester")
			.fillInPassword("123-xyz")
			.clickLoginButton()
			.isLoginCorrect();
	}
}
