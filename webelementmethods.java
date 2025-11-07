package testngpractice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {
	public static void main(String[] args) throws InterruptedException {
		
		//1. clear method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		
//		d.get("https://mecord.dev.metaphi.in/login");
//		d.findElement(By.id("formUsername")).sendKeys("admin1@gmail.com");
//		Thread.sleep(3000);
//		d.findElement(By.id("formUsername")).clear();
//		Thread.sleep(3000);
//		d.close();
		
		
//		2. getattribute method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://www.facebook.com/");
//		@Nullable
//		String src = d.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("src");
//		System.out.println(src);
//		Thread.sleep(3000);
//		d.close();
		
//		3. getcssvalue method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://www.facebook.com/");
//		String cssvalue = d.findElement(By.xpath("//img[@alt='Facebook']")).getCssValue("height");
//		System.out.println(cssvalue);
//		Thread.sleep(3000);
//		d.close();
		
//		4. getsize method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
//		
//		int height = d.findElement(By.xpath("//img[@title='Image tooltip']")).getSize().getHeight();
//		System.out.println("Height of image is: "+height);
//		
//		int width = d.findElement(By.xpath("//img[@title='Image tooltip']")).getSize().getWidth();
//		System.out.println("Width of image is: "+width);
//		
//		Thread.sleep(3000);
//		d.close();
		
//		5. getlocation method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
//		
//		int x = d.findElement(By.xpath("//img[@title='Image tooltip']")).getLocation().getX();
//		System.out.println("Image x axis is: "+x);
//		
//		int y = d.findElement(By.xpath("//img[@title='Image tooltip']")).getLocation().getY();
//		System.out.println("Image y axis is: "+y);
//		
//		d.close();
		
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		d.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
		
		int height = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getHeight();
		System.out.println("Height of image is: "+height);
		
		int width = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getWidth();
		System.out.println("Width of image is: "+width);
		
		int x = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getX();
		System.out.println("X axis of image is: "+x);
		
		int y = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getY();
		System.out.println("Y axis of image is: "+y);
		
		d.close();
		
	
	}
}
