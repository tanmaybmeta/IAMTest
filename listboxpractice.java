package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxpractice {
	public static void main(String[] args) throws InterruptedException {
		
//		
//		1. selectbyindex() method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		
//		WebElement country = d.findElement(By.xpath("//select[@id='select3']"));
//		
//		Select s = new Select(country);
//		
//		Thread.sleep(3000);
//		
//		s.selectByIndex(1);
//		
//		
//		Thread.sleep(3000);
//		
//		d.close();
		
		
//		2. selectbyvisibiletext() and selectbyvalue() and selectbyindex() methods code
//		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		
//		WebElement country = d.findElement(By.xpath("//select[@id='select3']"));
//		Select s1 = new Select(country);
//		Thread.sleep(3000);
//		
//		s1.selectByIndex(7);
//		s1.deselectbyvis
//		Thread.sleep(3000);
//		
//		
//		WebElement state = d.findElement(By.xpath("//select[@id='select5']"));
//		Select s2 = new Select(state);
//		Thread.sleep(3000);
//		
//		s2.selectByValue("Maharashtra");
//		Thread.sleep(3000);
//		
//		
//		WebElement city = d.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[3]"));
//		Select s3 = new Select(city);
//		Thread.sleep(3000);
//		
//		s3.selectByVisibleText("Palghar");
//		Thread.sleep(3000);
//		
//		d.close();
		
	}
}
