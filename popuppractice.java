package testngpractice;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;

public class popuppractice {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		
//		1.alert and javascript popup code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[text()='Popups']")).click();
//		
//		d.findElement(By.xpath("//section[text()='Javascript']")).click();
//		
//		d.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//		d.findElement(By.xpath("//button[.='Delete']")).click();
//		
//		Alert a = d.switchTo().alert();
//		String text = a.getText();
//		
//		System.out.println(text);
//		
//		//a.accept();
//		a.dismiss();
//		Thread.sleep(3000);
//		d.close();
		
	
//		2. calendar popup code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//login process
//		d.get("https://www.facebook.com/");
//		d.findElement(By.linkText("Create new account")).click();
//		WebElement day = d.findElement(By.id("day"));
//		
//		Select s1 = new Select(day);
//		s1.selectByValue("2");
//		
//		WebElement month = d.findElement(By.id("month"));
//		
//		Select s2 = new Select(month);
//		s2.selectByVisibleText("Jan");
//		
//		WebElement year = d.findElement(By.id("year"));
//		
//		Select s3 = new Select(year);
//		s3.selectByVisibleText("2000");
//		
//		Thread.sleep(5000);
//		
//		d.close();
		
//		3.notification popup code
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		
//		
//		WebDriver d = new ChromeDriver(option);
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Popups']")).click();
//		d.findElement(By.xpath("//section[.='Notifications']")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//button[.='Notification']")).click();
//		Thread.sleep(3000);
//		d.close();
		
		
//		4.authentication popup code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
//		Thread.sleep(3000);
//		d.close();
		
	//	5.file upload popup code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://im.dev.metaphi.in/login");
//		d.findElement(By.id("formUsername")).sendKeys("admin@gmail.com");
//		d.findElement(By.id("formPassword")).sendKeys("123");
//		
//		d.findElement(By.xpath("//button[.=' Sign In']")).click();
//		
//		d.findElement(By.xpath("//span[.='Procurement']")).click();
//		d.findElement(By.linkText("Purchase Request")).click();
//		d.findElement(By.linkText("Create Purchase Request")).click();
//		
//		//date
//		WebElement date = d.findElement(By.xpath("//input[@type='date']"));
//		date.clear();
//		date.sendKeys("13/11/2025");
//		
//		//file
//		File f = new File("src/testngpractice/file.txt");
//		
//		String path = f.getAbsolutePath();
//		System.out.println("path: "+path);
//		
//		d.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
//		
//		d.findElement(By.xpath("//input[@name='initiated_by']")).sendKeys("Tanmay b");
//		
//		d.findElement(By.name("remark")).sendKeys("Test automation");
//		
//		//item details form
//		d.findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("Acer");
//		d.findElement(By.xpath("//li[.='Acer']")).click();
//		
//		d.findElement(By.xpath("//input[@type='number']")).sendKeys("10");
//		
//		d.findElement(By.xpath("(//input[@placeholder='Enter Remark'])[2]")).sendKeys("Test Automation");
//		
//		d.findElement(By.xpath("//button[.='Submit']")).submit();
//		
//		Thread.sleep(3000);
//		
//		d.close();
		
		
//		Runtime.getRuntime().exec("Notepad");
//		Thread.sleep(2000);
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_M);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_Y);
		
	//	6. file download popup code
//		WebDriver d = new ChromeDriver();
//		
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://im.dev.metaphi.in/login");
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		d.close();
		
	//	7. windowhandle and windowhandles method code
		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://im.dev.metaphi.in/login");
//		String winid = d.getWindowHandle();
//		System.out.println(winid);
//		
//		d.close();
		
//		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		String pwin = d.getWindowHandle();
//		
//		d.findElement(By.xpath("//section[.='Popups']")).click();
//		d.findElement(By.xpath("//section[.='Browser Windows']")).click();
//		d.findElement(By.linkText("Multiple Windows")).click();
//		
//		d.findElement(By.xpath("//button[.='Shop Now']")).click();
//		
//		Set<String> allwinid = d.getWindowHandles();
//		
//		int count = allwinid.size();
//		
//		System.out.println(count);
//		
//		for (String win : allwinid) {
//			if (!pwin.equals(win)) {
//				d.switchTo().window(win);
//				d.close();
//			}
//			System.out.println(win);
//		}
//		
		
		
	//	8. double click method code
//		WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // Open main demo site
//        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//
//        // Navigate step by step to Double Click page
//        driver.findElement(By.xpath("//section[.='Button']")).click();
//        driver.findElement(By.xpath("//section[.='Double Click']")).click();
//
//        // Locate the double-click button
//        WebElement doubleClickBtn = driver.findElement(By.id("btn20"));
//
//        // Perform double-click
//        Actions act = new Actions(driver);
//        act.doubleClick(doubleClickBtn).perform();
//
//        // Optional: get message or effect after double click
//        WebElement msg = driver.findElement(By.id("doubleClickMessage"));
//        System.out.println("Message: " + msg.getText());
//
//        Thread.sleep(2000);
//        driver.close();
		
		
	//	10.scroll  code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.bbc.com/");
//		
//		JavascriptExecutor js = (JavascriptExecutor) d;
//		Thread.sleep(3000);
//		
//		int yaxis = d.findElement(By.xpath("//div[@class='sc-75fadac9-5 jkHfbE']")).getLocation().getY();
//		System.out.println(yaxis);
//		
//		js.executeScript("window.scrollBy(0, " + yaxis + ")");
//		Thread.sleep(3000); 
//		d.close();
		
		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.amazon.in/");
//		
//		JavascriptExecutor js = (JavascriptExecutor) d;
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0, 3000)");
//		
//		Thread.sleep(3000);
		
		
//		11. drag and drop method code
//		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Mouse Actions']")).click();
//		d.findElement(By.xpath("//section[.='Drag & Drop']")).click();
//		
//		d.findElement(By.linkText("Drag Position")).click();
//		
//		WebElement src = d.findElement(By.xpath("//div[.='Mobile Charger']"));
//		
//		WebElement dest = d.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
//		
//		Actions a = new Actions(d);
//		a.dragAndDrop(src, dest).perform();
//		
//		Thread.sleep(3000);
//		d.close();
		
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		d.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		d.findElement(By.xpath("//section[.='Drag & Drop']")).click();
		
		d.findElement(By.linkText("Drag Position")).click();		
		
		
		
	}
}
