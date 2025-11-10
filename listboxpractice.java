package testngpractice;

import java.time.Duration;
import java.util.List;

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
		
		
		//3. multiselect code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		 WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		
//		Select s1 = new Select(product);
//		s1.selectByVisibleText("Fjallraven - Foldsac...");
//		s1.selectByIndex(1);
//		s1.selectByVisibleText("Mens Cotton Jacket...");
//		
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//button[.='Add']")).click();
//		Thread.sleep(4000);
//		
//		d.close();
//		
		
//		4.deselect method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		 WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		 
//		 Select s = new Select(product);
//		 
//		 s.selectByIndex(1);
//		 s.selectByVisibleText("Fjallraven - Foldsac...");
//		 s.selectByValue("Mens Cotton Jacket");
//		 Thread.sleep(3000);
//		 
//		 s.deselectByIndex(1);
//		 s.deselectByVisibleText("Fjallraven - Foldsac...");
//		 s.deselectByValue("Mens Cotton Jacket");
//		 
//		 Thread.sleep(3000);
//		 d.close();
//		 
		
		
//		5.deselectall method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		 WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		 
//		 Select s = new Select(product);
//		 
//		 s.selectByIndex(0);
//		 s.selectByIndex(1);
//		 s.selectByIndex(2);
//		 
//		 Thread.sleep(4000);
//		 
//		 s.deselectAll();
//		 Thread.sleep(3000);
//		 d.close();
		
		
		
//		6. getfirstselectoption method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		
//		Select s = new Select(product);
//		
//		s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
//		s.selectByIndex(3);
//		
//		Thread.sleep(3000);
//		
//		String option = s.getFirstSelectedOption().getText();
//		System.out.println(option);
//		Thread.sleep(3000);
//		
//		d.close();
		
				
//		7.getallselectedoptions() method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		 
//		Select s = new Select(product);
//		
//		s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
//		s.selectByIndex(3);
//		
//		Thread.sleep(3000);
//		
//		List<WebElement> options = s.getAllSelectedOptions();
//		int count = options.size();
//		System.out.println(count);
//		
//		for (int i = 0; i < count; i++) {
//			String options1 = options.get(i).getText();
//			System.out.println(options1);
//			
//			Thread.sleep(3000);
//			
//		}
//		
//		d.close();
		
		
//		8.getoptions() method code
//		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		d.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		d.findElement(By.xpath("//section[.='Dropdown']")).click();
//		d.findElement(By.linkText("Multi Select")).click();
//		
//		WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
//		
//		Select s = new Select(product);
//		
//		List<WebElement> options = s.getOptions();
//		
//		int count = options.size();
//		System.out.println(count);
//		
//		for (int i = 0; i < count; i++) {
//			String poptions= options.get(i).getText();
//			Thread.sleep(2000);
//			System.out.println(poptions);
//			
//		}
//		d.close();
		
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		d.findElement(By.xpath("//section[.='Dropdown']")).click();
		
		d.findElement(By.linkText("Multi Select")).click();
		
		WebElement product = d.findElement(By.xpath("//select[@id='select-multiple-native']"));
		
		Select s = new Select(product);
		
		String options = s.getWrappedElement().getText();
		
		System.out.println(options);
		Thread.sleep(3000);
		
		d.close();
		
	}
}
