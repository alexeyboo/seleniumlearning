package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskSix extends BasePage {
	public TaskSix(WebDriver driver) {
		super(driver);
	}

	public TaskSix fillInLogin(String login) throws InterruptedException {
		By loginFormUsername = By.id("LoginForm__username");
		waitVisibility(loginFormUsername);
		writeText(loginFormUsername, login);
		return this;
	}

	public TaskSix fillInPassword(String password) throws InterruptedException {
		By loginFormPassword = By.name("LoginForm[_password]");
		waitVisibility(loginFormPassword);
		writeText(loginFormPassword, password);

		return this;
	}

	public TaskSix clickLoginButton() throws InterruptedException {
		click(By.xpath("//button[text()='Login']"));

		return this;
	}

	public void isLoginCorrect() {
		isElementDisplayed(By.linkText("Pobierz plik"));
	}

	public TaskSix checkElementsOnPagePresent() {
		isElementDisplayed(By.id("LoginForm__username"));
		isElementDisplayed(By.xpath("//button[text()='Login']"));
		return this;
	}
}
