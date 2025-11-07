package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcontain {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://www.amazon.in/");
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		String iphone = d.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Blu')]")).getText();
		
		System.out.println("This is iphone device: "+iphone);
		Thread.sleep(3000);
		d.close();
	}
}
