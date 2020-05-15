package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class TaskSix extends BasePage {
	public TaskSix(WebDriver driver) {
		super(driver);
	}

	public TaskSix fillInLogin(String login) {
		By loginFormUsername = By.id("LoginForm__username");
		waitVisibility(loginFormUsername);
		writeText(loginFormUsername, login);
		return this;
	}

	public TaskSix fillInPassword(String password) {
		By loginFormPassword = By.name("LoginForm[_password]");
		waitVisibility(loginFormPassword);
		writeText(loginFormPassword, password);

		return this;
	}

	public TaskSix clickLoginButton() {
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

	public TaskSix isLoginWrong() {
		isElementNotDisplayed(By.linkText("Pobierz plik"));
		return this;
	}
}
