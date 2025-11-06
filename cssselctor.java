package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselctor {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("span[role='button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='Pke_EE']")).sendKeys("mobile");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
