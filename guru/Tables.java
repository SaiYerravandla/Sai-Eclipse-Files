package guru;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.railyatri.in/time-table");

		WebElement element = driver.findElement(By.xpath("//table[@class='table table-condensed']"));

		List<WebElement> rows, cols;
		rows = element.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {

			cols = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < cols.size(); j++) {

				String data = cols.get(j).getText();
				System.out.println(data);
			}

		}
	}
}
//		driver.get("http://orangehrm.qedgetech.com/");
//
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
//		driver.findElement(By.id("btnLogin")).click();
//
//		driver.findElement(By.linkText("PIM")).click();
//		driver.findElement(By.linkText("Employee List")).click();
//
//		WebElement table = driver.findElement(By.id("resultTable"));
//
//		List<WebElement> rows, cols;
//
//		rows = table.findElements(By.tagName("tr"));
//		for (int i = 1; i < rows.size(); i++) {
//			cols = rows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				String hrmdata = cols.get(j).getText();
//
//				System.out.println(hrmdata);
//			}
//		}
//	}
//
//}
