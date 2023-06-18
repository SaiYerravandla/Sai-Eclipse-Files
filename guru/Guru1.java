package guru;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.get("http://primusbank.qedgetech.com/");
//		driver.findElement(By.linkText("Site Map")).click();
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();

//         using table methods
//		driver.get("https://www.railyatri.in/time-table");
//		WebElement traintable=driver.findElement(By.xpath("//table[@class='table table-condensed']"));// identify the whole table
//		List<WebElement> rows,colums;
//		
//		rows=traintable.findElements(By.tagName("tr"));
//		
//		for(int i=1; i<rows.size(); i=i+1)
//		{
//			colums = rows.get(i).findElements(By.tagName("td"));
//			
//			for(int j=0; j<colums.size(); j++)
//			{
//				String data=colums.get(j).getText();
//				System.out.println("            "+data+"                 " );

//		
//		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
//		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
//		driver.findElement(By.id("btnLogin")).click();
//		
//		driver.findElement(By.linkText("PIM")).click();
//		driver.findElement(By.linkText("Add Employee")).click();
//		
//		driver.findElement(By.id("firstName")).sendKeys("guru");
//		driver.findElement(By.id("middleName")).sendKeys("sai");
//		driver.findElement(By.id("lastName")).sendKeys("kumar");
//		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
//		driver.findElement(By.id("btnSave")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("Employee List")).click();
//		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
//		Thread.sleep(2000);
//		driver.findElement(By.id("searchBtn")).click();
//		
//		WebElement table=driver.findElement(By.id("resultTable"));
//		
//		List<WebElement> rows,cols;
//		
//		rows=table.findElements(By.tagName("tr"));
//		
//		for(int i=1; i<rows.size(); i++)
//		{
//			cols=rows.get(i).findElements(By.tagName("td"));
//			
//			if(cols.get(i).getText().equals(empid))
//			{
//				System.out.println("a new employeer is regiestered succsusful="+    "TEST PASS ");
//			}
//		}
//		
//              Using Select method(dropdown)
//		driver.get("http://flights.qedgetech.com/");
//		
//		driver.findElement(By.linkText("Register")).click();
//		
//		driver.findElement(By.id("name")).sendKeys("Gurusaikumar");
//		driver.findElement(By.id("contact")).sendKeys("8790921450");
//		driver.findElement(By.id("email")).sendKeys("yerravandla.saikumar@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys("00000000000");
//	
//		Thread.sleep(3000);
//		
//		Select gender=new Select(driver.findElement(By.name("gender")));
//		 gender.selectByVisibleText("Male");
//		 
//		 driver.findElement(By.name("dob")).sendKeys("23-2-1995");
//		 
//		 driver.findElement(By.id("flexCheckChecked")).click();
//	driver.findElement(By.name("submit")).click();

//		
		
		
		
		
		
//		String dob="23/09/1999";
//		String[] date=dob.split("/");
//		
//		String d=date[0];
//		String m=date[1];
//		String y=date[2];
//		
//		System.out.println(d);
//		System.out.println(m);
//		System.out.println(y);

		
		
		
		// check the calender process
//		driver.get("http://flights.qedgetech.com/");
//		driver.findElement(By.linkText("Register")).click();
//
//		//driver.findElement(By.name("dob")s).click();
//		// Thread.sleep(3000);
//
//		String dob = "23/Sep/1999";
//
//		String[] temp = dob.split("/");
//
//		String d = temp[0];
//		String m = temp[1];
//		String y = temp[2];
//		
//		driver.findElement(By.name("dob")).click();
//
//		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
//		mlist.selectByVisibleText(m);
//
//		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
//		ylist.selectByVisibleText(y);
//
//		WebElement numtab = driver.findElement(By.className("ui-datepicker-calendar"));
//
//		List<WebElement> numrows, numcols;
//
//		numrows = numtab.findElements(By.tagName("tr"));
//
//		for (int i = 1; i < numrows.size(); i++) {
//			numcols = numrows.get(i).findElements(By.tagName("td"));
//
//			for (int j = 0; j < numcols.size(); j++) {
//				String caldate = numcols.get(j).getText();
//
//				if (caldate.equals(d)) {
//					numcols.get(j).click();
//					break;
//				}
//			}

		// handling the calender dates
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.id("search-date")).click();

		String flydate = "23/June/2030";
		String[] temp = flydate.split("/");

		String d = temp[0];
		String m = temp[1];
		String y = temp[2];

		String ylist = driver.findElement(By.className("ui-datepicker-calendar")).getText();
		ylist = driver.findElement(By.className("ui-datepicker-year")).getText();

		while (!ylist.equals(y)) {
			driver.findElement(By.linkText("Next")).click();
			ylist = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}

		String mlist = driver.findElement(By.className("ui-datepicker-calendar")).getText();
		mlist = driver.findElement(By.className("ui-datepicker-month")).getText();
		// System.out.prinln(mlist);
		while (!mlist.equals(m)) {
			driver.findElement(By.linkText("Next")).click();
			mlist = driver.findElement(By.className("ui-datepicker-month")).getText();
		}

		WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));

		List<WebElement> flyrows, flycols;

		flyrows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < flyrows.size(); i++) {
			flycols = flyrows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < flycols.size(); j++) {
				String date = flycols.get(j).getText();

				if (date.equals(d)) {
					flycols.get(j).click();
					break;
				}
			}
		}

		
		// Actions methods(mouse operations _)
//		driver.get("https://jqueryui.com/");
//		String mainwindow=driver.getWindowHandle();// window handling method
//		driver.findElement(By.linkText("Droppable")).click();
//		
//		Actions act=new Actions(driver);
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		WebElement src,target;
//		
//		src=driver.findElement(By.id("draggable"));
//		target=driver.findElement(By.id("droppable"));
//		act.dragAndDrop(src, target);
//		act.build();
//		act.perform();
//		
//		driver.switchTo().window(mainwindow);// this regarding as the window handling
//		Thread.sleep(3000);
//          driver.findElement(By.linkText("Demos")).click();
//		

//		driver.get("http://gmail.com");
//		String curwindow = driver.getWindowHandle();
//		//System.out.println(curwindow);
//		String win=driver.getWindowHandle();
//		win=driver.
//				
////				
//				driver.get("http://gmail.com");
//				Set<String> allwindows=driver.getWindowHandles();
//				System.out.println(allwindows);
//		
//	//// important code for  multiple window handlingss method
//		driver.get("http://gmail.com");
//		Set<String> allwindows=driver.getWindowHandles();
//		System.out.println(allwindows);
//		
//		object[] window=allwindows.toArray();
//		
//		String a=window[0].toString;
//		String b=window[1].toString;
//		driver.switchTo().window(a);
//		driver.findElement(By.linkText("community")).click();
		
		
		
//		driver.get("http://flights.qedgetech.com/");
//	
//		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("demo");
//		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Flight Bookings']")).click();
		
//		driver.findElement(By.xpath("//tbody/tr[6]/td[10]/a[3]")).click();
//		
//		String alet=driver.switchTo().alert().getText();
//		
//		if(alet.contains("delete")) {
//			driver.switchTo().alert().accept();
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//		}
	
		
		
//		//we delete particular pop up delete throuh code
//		driver.get("http://flights.qedgetech.com/");
//		
//		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("demo");
//		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Flight Bookings']")).click();
//		
//		
//		WebElement flighttable=driver.findElement(By.className("flights_table"));
//		
//		List<WebElement> rows,cols;
//		
//		String ordno="6487";
//		
//		rows=flighttable.findElements(By.tagName("tr"));
//		
//		for(int i=1; i<rows.size(); i++) {
//			cols=rows.get(i).findElements(By.tagName("td"));
//			if(cols.get(0).getText().equals(ordno)) {
//				cols.get(9).findElement(By.xpath("//tbody/tr[6]/td[10]/a[3]")).click();
//				
//				driver.switchTo().alert().accept();
//				break;
	//		}
//		}
		
		
		
//		driver.get("http://www.google.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("pawankalyan");
//		
//		Thread.sleep(3000);
//		List<WebElement> elements= driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
//		System.out.println(elements.size());
//		
//		for(WebElement element:elements) {
//			
//			String all=element.getText();
//			//System.out.println(all);
//			if(all.toLowerCase().contains("son")) {
//				
//			System.out.println("test pass");
//			break;
//		}
		
//		for(int i=0; i<elements.size();i++) {
//		 
//			String a=elements.get(i).getText();
//			
//			if(a.toLowerCase().contains("son")) {
//				
//				elements.get(i).click();
//				break;
//			}
			
			
			
		// using alert methods (_pop ups)
		
//		driver.get("http://primusbank.qedgetech.com/");
//		driver.findElement(By.id("personal")).click();
//		driver.findElement(By.name("idtxt")).sendKeys("Admin");
//				driver.findElement(By.name("pswdtxt")).sendKeys("Admin");	
//						driver.findElement(By.id("btnGO")).click();
//				Thread.sleep(3000);		
//	 String q=driver.switchTo().alert().getText();
//	 
//	 if(q.toLowerCase().contains("ok")) {
//		 
//		 driver.switchTo().alert().accept();
//	
//	 }
//	 
		
		
	
				
		// using take screen shots method
//		driver.get("http://primusbank.qedgetech.com/");
//		driver.findElement(By.id("txtuId")).sendKeys("Admin");
//		driver.findElement(By.id("txtPword")).sendKeys("Admin");
//		driver.findElement(By.name("login")).click();
//		
//		driver.findElement(By.xpath("//a[@href='change_password.aspx']//img")).click();
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;// Type Casting method
//		
//		File srcfile=ts.getScreenshotAs(OutputType.FILE);
//		File desnfile=new File("C:\\screenshots\\screenshots.bmp");
//		
//		FileUtils.copyFile(srcfile,desnfile);
		
		
		
		// scroll the page method
//		driver.get("https://www.amazon.in/");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver; //Type casting here..
//		// method 1
//		//js.executeScript("window.scrollBy(0,5000)");
//		// method 2
//		
//		js.executeAsyncScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("Australia")));
		
		
		// explicity wait method......
//		driver.get("http://primusbank.qedgetech.com/");
//		
//		driver.findElement(By.id("txtuId")).sendKeys("Abc");
//		driver.findElement(By.id("txtPword")).sendKeys("123");
//		driver.findElement(By.name("login")).click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		
//		wait.until(ExpectedConditions.alertIsPresent());
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		
	}
		}
	


