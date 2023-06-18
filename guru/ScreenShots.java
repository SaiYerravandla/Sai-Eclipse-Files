package guru;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://primusbank.qedgetech.com/");

		driver.findElement(By.name("txtuId")).sendKeys("abcd");
		driver.findElement(By.name("txtPword")).sendKeys("1234");

		driver.findElement(By.name("login")).click();

		TakesScreenshot bank = (TakesScreenshot) driver;

		File notify_S = bank.getScreenshotAs(OutputType.FILE);

		File location = new File("C:\\screenshots\\notifSs.bmp");
		Thread.sleep(2000);
		FileUtils.copyFile(notify_S, location);

	}
}
