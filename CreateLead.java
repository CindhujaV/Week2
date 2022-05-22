package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		//setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		//Open Browser(Chrome)
		WebDriver driver=new ChromeDriver();
		
		//load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise browser window
		driver.manage().window().maximize();
		
		//Identify WebElement and store in a variable
		//WebElement Varname = driver.findElement(By.id("username"));
		//Varname.sendKeys("DemoSalesManager");
		
		
		//Identify WebElement using locator ID - login and pwd
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Identify WebElement using locator CLASSNAME
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Identify WebElement using locator LINKTEXT
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Identify WebElement using locator PARTIALLINKTEXT
		//driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//SendKeys 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("J");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HajaLoc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HajaLoc");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HajaLoc");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tester@gmail.com");
		 		
		
		//Select from DropDown
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdownobj = new Select(eleSource);
		dropdownobj.selectByVisibleText("Conference");
	    
		WebElement drop=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select elesource=new Select(drop);
		elesource.selectByVisibleText("New York");
		
		//Identify WebElement using locator NAME
		driver.findElement(By.name("submitButton")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).getText();	
		System.out.println("Title of Web Page is :"+driver.getTitle());
	
	}
	

}
