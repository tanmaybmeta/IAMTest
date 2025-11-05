package testngpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("src/testngpractice/file1");
		
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		driver.get(url);
		
		String email = p.getProperty("email");
		driver.findElement(By.id("formUsername")).sendKeys(email);
		
		String password = p.getProperty("password");
		driver.findElement(By.id("formPassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[.=' Sign In']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
