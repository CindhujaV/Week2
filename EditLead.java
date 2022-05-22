package week2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class EditLead {

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
		
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();	
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("J");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moh");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HajaLoc");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HajaLoc");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HajaLoc");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tester@gmail.com");
			
			WebElement drop=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select elesource=new Select(drop);
			elesource.selectByVisibleText("New York");

			driver.findElement(By.name("submitButton")).click();
			
			driver.findElement(By.linkText("Edit")).click();
			  
			driver.findElement(By.id("updateLeadForm_description")).clear();
			  
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("completed");
			  
			driver.findElement(By.name("submitButton")).click();
			  
			System.out.println("Title of Web Page is :"+driver.getTitle());
		
		}
		

	}


