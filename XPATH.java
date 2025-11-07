package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mecord.dev.metaphi.in/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("formPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.=' Sign In']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='User Management']")).click();
		driver.findElement(By.linkText("Organisation")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TCS");
		
		Thread.sleep(3000);
		driver.close();
	}
}
