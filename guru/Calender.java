package guru;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		driver.get("http://flights.qedgetech.com/");
//		driver.findElement(By.linkText("Register")).click();
//
//		driver.findElement(By.name("dob")).click();
//
//		String day = "23/Sep/1998";
//
//		String[] days = day.split("/");
//
//		String d = days[0];
//		String m = days[1];
//		String y = days[2];
//
//		System.out.println(d);
//		System.out.println(m);
//		System.out.println(y);
//
//		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
//		year.selectByValue(y);
//
//		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
//		month.selectByVisibleText(m);
//
//		WebElement caldate = driver.findElement(By.className("ui-datepicker-calendar"));
//
//		List<WebElement> R, C;
//
//		R = caldate.findElements(By.tagName("tr"));
//
//		for (int i = 1; i < R.size(); i++) {
//
//			C = R.get(i).findElements(By.tagName("td"));
//
//			for (int j = 0; j < C.size(); j++) {
//				
//				String date=C.get(j).getText();
//				
//				if (date.contains(d)) {
//					C.get(j).click();
//					break;
//				}
//			}
//		}

		
		
		
		
		// Another method to get a calender code 
		
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
		driver.findElement(By.id("search-date")).click();
		
		
		String calend="2025/September/23";
		String[] temp=calend.split("/");
		
		String y=temp[0];
		String m=temp[1];
		String d=temp[2];
		
		String year=driver.findElement(By.className("ui-datepicker-calendar")).getText();
		year=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!year.equals(y)) {
			
			driver.findElement(By.linkText("Next")).click();
			year=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String month=driver.findElement(By.className("ui-datepicker-calendar")).getText();
		month=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!month.equals(m)) {
			driver.findElement(By.linkText("Next")).click();
			month=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement date=driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> r,c;
		r=date.findElements(By.tagName("tr"));
		for(int i=1; i<r.size(); i++) {
			c=r.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j<c.size(); j++) {
				String a=c.get(j).getText();
				if(a.contains(d)) {
					c.get(j).click();
					break;
				}
			}
		}
		
		
	}

}
