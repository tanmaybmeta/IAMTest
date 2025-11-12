package testngpractice;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class popuppractice {
	public static void main(String[] args) throws InterruptedException {
		
		
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
		
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://im.dev.metaphi.in/login");
		d.findElement(By.id("formUsername")).sendKeys("admin@gmail.com");
		d.findElement(By.id("formPassword")).sendKeys("123");
		
		d.findElement(By.xpath("//button[.=' Sign In']")).click();
		
		d.findElement(By.xpath("//span[.='Procurement']")).click();
		d.findElement(By.linkText("Purchase Request")).click();
		d.findElement(By.linkText("Create Purchase Request")).click();
		
		
		
		
	}
}
