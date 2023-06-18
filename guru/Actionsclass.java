package guru;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://jqueryui.com/");

		driver.findElement(By.linkText("Droppable")).click();

		Actions x = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement src, target;

		src = driver.findElement(By.id("draggable"));
		target = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		x.dragAndDrop(src, target);
		// Thread.sleep(2000);

		x.build();
		x.perform();

	}

}
