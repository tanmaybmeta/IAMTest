package testngpractice;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class hellotest {
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("before class");
		}
		
		@BeforeMethod
		public void beforemethod() {
			System.out.println("before method");
		}
		
		@Test
		public void hello() {
			org.testng.Assert.assertEquals(1, 1, null);
		}
		
		@AfterMethod
		public void aftermethod() {
			System.out.println("after method");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("after class");
		}
	}

	
