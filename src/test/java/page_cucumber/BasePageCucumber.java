package page_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePageCucumber {
	WebDriver driver;
	WebDriverWait wait;

	public BasePageCucumber(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}

	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	public void click(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}

	public void isElementDisplayed(By elementBy) {
		waitVisibility(elementBy);
		assertTrue(driver.findElement(elementBy).isDisplayed());
	}

	public void isElementNotDisplayed(By elementBy) {
		List<WebElement> elements = driver.findElements(elementBy);
		assertFalse(elements.size() > 0);
	}

	public void writeText(By elementBy, String text) {
		waitVisibility(elementBy);
		WebElement element = driver.findElement(elementBy);
		element.clear();
		element.sendKeys(text);
	}
}
