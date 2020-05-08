package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskOne extends BasePage {
	public TaskOne(WebDriver driver) {
		super(driver);
	}

	public void checkPageIsCorrect() {
		isElementDisplayed(By.xpath("//li[text()='Zadanie 1']"));
	}

	public void scrollToElement(String text) {
		WebElement element = driver.findElement(By.xpath("//h4[text()='" + text + "']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,250)", "");

	}
}
