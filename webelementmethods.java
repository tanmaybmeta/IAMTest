package testngpractice;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		
//		6. getrect method code
//		WebDriver d = new ChromeDriver();
//		
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
//		
//		int height = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getHeight();
//		System.out.println("Height of image is: "+height);
//		
//		int width = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getWidth();
//		System.out.println("Width of image is: "+width);
//		
//		int x = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getX();
//		System.out.println("X axis of image is: "+x);
//		
//		int y = d.findElement(By.xpath("//img[@title='Image tooltip']")).getRect().getY();
//		System.out.println("Y axis of image is: "+y);
//		
//		d.close();
		
		
//		7.isdisplayed method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.facebook.com/");
//		
//		boolean logo = d.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
//		
//		if(logo == true) {
//			System.out.println("Logo is displayed.");
//		}else {
//			System.out.println("Logo is not displayed");
//		}
//		
//		d.close();
//		
		
//		8.isenabled method code
//		
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.facebook.com/");
//		boolean login = d.findElement(By.xpath("//img[@alt='Facebook']")).isEnabled();
//		if (login == true) {
//			System.out.println("Login is enabled");
//		}else {
//			System.out.println("Login is disabled.");
//		}
//		
//		d.close();
		
		
//		
//		9. isselected method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Check Box']")).click();
//		
//		d.findElement(By.name("Domain")).click();
//		boolean email = d.findElement(By.name("Domain")).isSelected();
//		
//		if (email == false) {
//			System.out.println("checkbox is selected");
//		}else {
//			System.out.println("Checkbox is not selected.");
//		}
//		
//		d.close();
		
//		10. submit method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Button']")).click();
//		d.findElement(By.linkText("Submit Click")).click();
//		
//		d.findElement(By.name("satisfaction")).click();
//		d.findElement(By.xpath("//button[.='Submit']")).submit();
//		
//		Thread.sleep(3000);
//		d.close();
		
		
//		11. print alllinks in flipkart
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.flipkart.com/");
//		List<WebElement> links = d.findElements(By.xpath("//a"));
//		
//		int count = links.size();
//		
//		System.out.println(count);
//		
//		for (int i = 0; i < count; i++) {
//			String text = links.get(i).getText();
//			System.out.println("All links of flipkart: "+text);
//		}
//		
//		d.close();
		
		
		
//		12. product suggestion code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://www.flipkart.com/");
//		
//		d.findElement(By.name("q")).sendKeys("iphone 16");
//		
//		Thread.sleep(10000);
//		 List<WebElement> suggestions = d.findElements(By.xpath("//span[.='iphone 16']/.."));
//		 
//		 int count = suggestions.size();
//		 System.out.println(count);
//		 
//		 for (int i = 0; i < count; i++) {
//			String text = suggestions.get(i).getText();
//			System.out.println(text);
//		}
//		 d.close();
		
		
		
	}
}
