package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import page_cucumber.MainCucumber;
import page_cucumber.TaskSixCucumber;

import java.util.concurrent.TimeUnit;

public class TestBaseCucumber {
	WebDriver driver;
	MainCucumber main;
	TaskSixCucumber taskSix;

	public void start() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		main = PageFactory.initElements(driver, MainCucumber.class);
	}

	public void finish() {
		driver.quit();
	}
}
