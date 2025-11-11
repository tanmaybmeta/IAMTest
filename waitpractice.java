package testngpractice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitpractice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://mecord.dev.metaphi.in/login");
		d.findElement(By.name("email")).sendKeys("admin@gmail.com");
		d.findElement(By.id("formPassword")).sendKeys("admin");
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
		@Nullable
		WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		signin.click();
		
		System.out.println("Login is successful");
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//img[@alt='Header Avatar']")).click();
		d.findElement(By.xpath("//span[.='Logout']")).click();
		System.out.println("Logout is successful.");
		
		Thread.sleep(3000);
		
		d.close();
		
		
	}
}
