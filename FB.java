package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB
{
 public static void main(String[] args) 
 {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[text()='Only allow essential cookies']")).click();
	driver.findElement(By.linkText("Create New Account")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("Face");
	driver.findElement(By.name("lastname")).sendKeys("Book");
	driver.findElement(By.name("reg_email__")).sendKeys("FaceBook@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("FBpwd");
	
	Select dd0=new Select(driver.findElement(By.id("day")));
	dd0.selectByVisibleText("1");
	
	Select dd1=new Select(driver.findElement(By.id("month")));
	dd1.selectByValue("1");
	
	Select dd2=new Select(driver.findElement(By.id("year")));
	dd2.selectByVisibleText("2022");
	
	driver.findElement(By.className("_58mt")).click();
 }
}