package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("arguments[0].scrollIntoView()", driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[16]/div/div/div[2]/div/ul/li[1]/span/a/img")));

//		// scroll the page method
//		driver.get("https://www.amazon.in/");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver; //Type casting here..
//		// method 1
//		//js.executeScript("window.scrollBy(0,5000)");
//		// method 2
//		
//		js.executeAsyncScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("Australia")));
//		

	}

}
