package page_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainCucumber extends BasePageCucumber {
	String SITE_URL = "http://127.0.0.1:8080/seleniumtest/main.html";

	public MainCucumber(WebDriver driver) {
		super(driver);
	}

	public MainCucumber goTo() {
		driver.get(SITE_URL);
		return this;
	}

	public MainCucumber chooseTask(String taskNumber) {
		click(By.xpath("//h2[text()='Zadanie " + taskNumber + "']"));
		return this;
	}
}
