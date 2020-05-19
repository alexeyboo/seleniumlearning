package test;

import org.junit.Test;

public class TestOne extends TestBase{
	@Test
	public void firstTest() {
		main.goTo()
				.chooseTask("1");
		taskOne.checkPageIsCorrect();
		taskOne.scrollToElement("Kostka");
	}
}
