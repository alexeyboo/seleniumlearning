package page_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;

public class TaskSixCucumber extends BasePageCucumber {
	public TaskSixCucumber(WebDriver driver) {
		super(driver);
	}

	public TaskSixCucumber fillInLogin(String login) {
		By loginFormUsername = By.id("LoginForm__username");
		waitVisibility(loginFormUsername);
		writeText(loginFormUsername, login);
		return this;
	}

	public TaskSixCucumber fillInPassword(String password) {
		By loginFormPassword = By.name("LoginForm[_password]");
		waitVisibility(loginFormPassword);
		writeText(loginFormPassword, password);

		return this;
	}

	public TaskSixCucumber clickLoginButton() {
		click(By.xpath("//button[text()='Login']"));

		return this;
	}

	public void isLoginCorrect() {
		isElementDisplayed(By.linkText("Pobierz plik"));
	}

	public TaskSixCucumber checkElementsOnPagePresent() {
		isElementDisplayed(By.id("LoginForm__username"));
		isElementDisplayed(By.xpath("//button[text()='Login']"));
		return this;
	}

	public TaskSixCucumber isLoginWrong() {
		isElementNotDisplayed(By.linkText("Pobierz plik"));
		return this;
	}
}