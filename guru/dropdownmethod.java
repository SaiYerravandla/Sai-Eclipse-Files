package guru;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.linkText("Register")).click();
	
	
		Select list=new Select(driver.findElement(By.name("gender")));
		Thread.sleep(3000);
		list.selectByVisibleText("Female");
		
		
//	Select lists=new Select(driver.findElement(By.name("gender")));
//	lists.selectByIndex(2);
	}

}
